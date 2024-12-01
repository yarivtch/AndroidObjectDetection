class MainActivity : AppCompatActivity() {
    private lateinit var cameraProvider: ProcessCameraProvider
    private lateinit var objectDetector: ObjectDetector
    private lateinit var binding: ActivityMainBinding
    private var detectionTimer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (allPermissionsGranted()) {
            startCamera()
        } else {
            requestPermissions()
        }

        setupObjectDetection()
        setupUI()
    }

    private fun setupObjectDetection() {
        val options = ObjectDetectorOptions.Builder()
            .setDetectorMode(ObjectDetectorOptions.STREAM_MODE)
            .enableMultipleObjects()
            .build()
        objectDetector = ObjectDetection.getClient(options)
    }

    private fun setupUI() {
        binding.startDetectionButton.setOnClickListener {
            val objectName = binding.objectNameInput.text.toString()
            val timeout = binding.timeoutInput.text.toString().toLongOrNull() ?: 30

            startObjectDetection(objectName, timeout)
        }
    }

    private fun startObjectDetection(targetObject: String, timeoutSeconds: Long) {
        detectionTimer?.cancel()
        detectionTimer = object : CountDownTimer(timeoutSeconds * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // עדכון תצוגת הטיימר
            }

            override fun onFinish() {
                showDetectionFailure()
            }
        }.start()
    }

    private fun processImage(image: ImageProxy) {
        val mediaImage = image.image
        if (mediaImage != null) {
            val inputImage = InputImage.fromMediaImage(mediaImage, image.imageInfo.rotationDegrees)
            
            objectDetector.process(inputImage)
                .addOnSuccessListener { detectedObjects ->
                    // בדיקה אם האובייקט המבוקש זוהה
                    handleDetectedObjects(detectedObjects)
                }
                .addOnFailureListener { e ->
                    Log.e(TAG, "שגיאה בזיהוי אובייקט", e)
                }
                .addOnCompleteListener {
                    image.close()
                }
        }
    }

    private fun showDetectionSuccess() {
        // הצגת הודעת הצלחה והפעלת התראה
        detectionTimer?.cancel()
        Toast.makeText(this, "האובייקט זוהה בהצלחה!", Toast.LENGTH_SHORT).show()
    }

    private fun showDetectionFailure() {
        Toast.makeText(this, "לא נמצא האובייקט המבוקש", Toast.LENGTH_SHORT).show()
    }

    companion object {
        private const val TAG = "MainActivity"
        private const val PERMISSION_REQUEST_CODE = 10
    }
} 
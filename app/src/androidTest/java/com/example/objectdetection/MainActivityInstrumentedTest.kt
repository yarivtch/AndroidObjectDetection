@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCameraPermission() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val permission = ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.CAMERA
        )
        // בדיקה שההרשאה התקבלה
        assertEquals(PackageManager.PERMISSION_GRANTED, permission)
    }

    @Test
    fun testUIElements() {
        onView(withId(R.id.startDetectionButton))
            .check(matches(isDisplayed()))
        
        onView(withId(R.id.objectNameInput))
            .check(matches(isDisplayed()))
    }
} 
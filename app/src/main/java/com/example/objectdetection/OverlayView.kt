class OverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val drawables = mutableListOf<View>()

    fun add(drawable: View) {
        drawables.add(drawable)
        invalidate()
    }

    fun clear() {
        drawables.clear()
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        for (drawable in drawables) {
            drawable.draw(canvas)
        }
    }
} 
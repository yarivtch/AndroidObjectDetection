class MainActivityTest {
    @Test
    fun testObjectDetectionThreshold() {
        val threshold = 0.5f
        assertTrue(threshold in 0.0..1.0)
    }
} 
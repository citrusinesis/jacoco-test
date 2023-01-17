import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TesteeTest {

    val testee: Testee = Testee()

    @Test
    fun testee1Success() {
        assertEquals(testee.testee1("asdf"), "Too long")
    }

    @Test
    fun testee2Success() {
        assertEquals(testee.testee2(3), false)
    }

    @Test
    fun testee3Success() {
        assertEquals(testee.testee3(), "To Test")
    }

    @Test
    fun failedTest() {
        assert(value = false)
    }
}
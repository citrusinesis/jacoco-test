class Testee {
    fun testee1(arg: String): String = when (arg.length) {
        1 -> "1"
        2 -> "2"
        3 -> "3"
        else -> "Too long"
    }

    fun testee2(arg: Int): Boolean = arg * arg > 100

    fun testee3(): String = "To Test"
}
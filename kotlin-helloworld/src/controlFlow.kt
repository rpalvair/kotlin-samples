fun main(args: Array<String>) {
    val maximum = max(1, 2)
    println("maximum is $maximum")
    println("isNumber = " + isNumber(1))
    println("isNumber = " + isNumber("1"))
}


fun max(a: Int, b: Int) = if (a > b) a else b


fun isNumber(a: Any): Boolean = when (a) {
    is Int -> true
    else -> false
}
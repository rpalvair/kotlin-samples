fun main(args: Array<String>) {
    val maximum = max(1, 2)
    println("maximum is $maximum")
}


fun max(a: Int, b: Int) = if (a > b) a else b


fun isNumber(a: Any): Boolean = when (a) {
    a is Int -> true
    else -> false
}
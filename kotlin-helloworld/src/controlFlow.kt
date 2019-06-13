fun main() {
    val maximum = max(1, 2)
    println("maximum is $maximum")
    println("isNumber = " + isNumber(1))
    println("isNumber = " + isNumber("1"))
    displayListContent(listOf(1, 2, 3))
    displayArrayContent(Array(5) { i -> (i * i) })
}


fun max(a: Int, b: Int) = if (a > b) a else b


fun isNumber(a: Any): Boolean = when (a) {
    is Int -> true
    else -> false
}

fun displayListContent(collection: Collection<Int>) {
    for (item in collection) {
        println("item $item")
    }
}

fun displayArrayContent(array: Array<Int>) {
    for (item in array) {
        println("item $item")
    }
}
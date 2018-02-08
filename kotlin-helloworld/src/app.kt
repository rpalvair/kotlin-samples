fun main(arg: Array<String>) {
    val applicationName = getApplicationName()
    val appNameUppercase = toUpperCaseSafety(applicationName)
    println("Welcome to [$appNameUppercase]")
    val nullUpperCase = toUpperCaseSafety(null)
    println("Null uppercase [$nullUpperCase]")
}

fun getApplicationName(): String = "kotlin-helloworld"

fun toUpperCaseSafety(input: String?): String? = input.orEmpty().toUpperCase()
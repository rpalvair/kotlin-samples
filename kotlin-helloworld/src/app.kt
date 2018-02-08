fun main(arg: Array<String>) {
    val applicationName = getApplicationName()
    val appNameUppercase = toUpperCaseSafety(applicationName)
    println("Welcome to [$appNameUppercase]")
    val nullUpperCase = toUpperCaseSafety(null)
    println("Null uppercase [$nullUpperCase]")
    val lenghtMessage = getLengthMessage(applicationName)
    println("message : $lenghtMessage")
    println("chaine sur plusieurs lignes " + getMultiLinesString())
}

fun getApplicationName(): String = "kotlin-helloworld"

fun toUpperCaseSafety(input: String?): String? = input.orEmpty().toUpperCase()

fun getLengthMessage(input: String): String = "$input.length  is ${input.length}"

fun getMultiLinesString(): String {
    return """
        Hello
        World
        """
}
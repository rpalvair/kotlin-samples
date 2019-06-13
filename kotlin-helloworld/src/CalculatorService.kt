class CalculatorService {


    fun addition(a: Int, b: Int): Int {
        return a + b
    }


}

fun main() {
    val calculatorService = CalculatorService()

    val result = calculatorService.addition(1, 7)

    System.out.println("resultat $result")
}
class RightTriangle(private val cathetus1: Double, private val cathetus2: Double) {

    // Метод для формирования строки с информацией об объекте
    fun getInfo(): String {
        return "Катет 1: $cathetus1, Катет 2: $cathetus2"
    }

    // Метод для вычисления длины гипотенузы
    fun calculateHypotenuse(): Double {
        return Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2)
    }
}
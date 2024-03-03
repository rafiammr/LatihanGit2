class Triangle(
    private val base: Double,
    private val height: Double,
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) {

    fun wideTriangle(): Double {
        return 0.5 * base * height
    }

    fun aroundTriangle(): Double {
        return sideA + sideB + sideC
    }
}

fun main() {

    val triangle = Triangle(6.0, 8.0, 5.0, 7.0, 9.0)
    val wide = triangle.wideTriangle()
    val around = triangle.aroundTriangle()

    println("Luas Segitiga: $wide")
    println("Keliling Segitiga: $around")

}

import kotlin.math.PI
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
class Circle(private val jariJari: Double) {
    fun wideCircle(): Double {
        return PI * jariJari * jariJari
    }

    fun aroundCircle(): Double {
        return 2 * PI * jariJari
    }
}

val circle = Circle(5.0)
val circleWide = circle.wideCircle()
val circleAround = circle.aroundCircle()


fun main() {

    val triangle = Triangle(6.0, 8.0, 5.0, 7.0, 9.0)
    val wide = triangle.wideTriangle()
    val around = triangle.aroundTriangle()

    println("Luas Segitiga: $wide")
    println("Keliling Segitiga: $around")
    println("Luas Lingkaran: $circleWide")
    println("Keliling Lingkaran:$circleAround")

}
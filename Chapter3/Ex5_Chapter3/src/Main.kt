import kotlin.math.sqrt

interface Shape {
    fun getArea(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun getArea(): Double {
        return width * height
    }
}

class Circle(private val radius: Double) : Shape {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}

class Triangle(private val a: Double, private val b: Double, private val c: Double) : Shape {
    private var p = (a + b + c) / 2
    override fun getArea(): Double {
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 10.0)
    val circle = Circle(5.0)
    val triangle = Triangle(10.0, 10.0, 10.0)

    println("Rectangle Area: ${rectangle.getArea()}")
    println("Circle Area: ${circle.getArea()}")
    println("Triangle Area: ${triangle.getArea()}")
}
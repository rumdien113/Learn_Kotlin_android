class Rectangle(val width: Int, val height: Int) {
    fun area() = width * height
    fun preimeter() = 2 * (width + height)
}

fun main() {
    val r = Rectangle(3, 4)
    println("Area: ${r.area()}")
    println("Perimeter: ${r.preimeter()}")
}
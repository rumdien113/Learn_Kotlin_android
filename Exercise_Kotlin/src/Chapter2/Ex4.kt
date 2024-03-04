package Chapter2

import kotlin.math.sqrt

fun checkTriangle(a: Int, b: Int, c: Int): String {
    if (a+b <= c || a+c <= b || b+c <= a)
        return "Không phải tam giác"
    else if (a == b && b == c)
        return "Tam giác cân"
    else if (a == b || b == c || a == c)
        return "Tam giác đều"
    else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
        return "Tam giác vuông"
    return "Tam giác thường"
}
fun perimeter(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
fun area(a: Int, b: Int, c: Int): Double {
    val p = (a + b + c) / 2
    return sqrt((p * (p - a) * (p - b) * (p - c)).toDouble())
}
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(checkTriangle(a, b, c))
    if (checkTriangle(a, b, c) != "Không phải tam giác") {
        println("Chu vi: ${perimeter(a, b, c)}")
        println("Diện tích: ${area(a, b, c)}")
    }
}
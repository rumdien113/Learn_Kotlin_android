import kotlin.math.sqrt

fun equation1(a: Double, b: Double) {
    if(a == 0.0) {
        if (b == 0.0)
            println("x ∈ R")
        else
            println("x ∈ ∅")
    } else {
        println("x = ${-b / a}")
    }
}

fun equation2(a:Double, b:Double, c:Double) {
    val delta = b * b - 4 * a * c
    if(delta < 0) {
        println("x ∈ ∅")
    } else if(delta == 0.0) {
        println("x = ${-b / (2 * a)}")
    } else {
        println("x1 = ${(-b - sqrt(delta)) / (2 * a)}")
        println("x2 = ${(-b + sqrt(delta)) / (2 * a)}")
    }
}

fun main() {
    println("Solve equation 1: ax + b = 0")
    println(equation1(0.0, 10.0))
    println("Solve equation 2: ax^2 + bx + c = 0")
    println(equation2(1.0, 2.0, 1.0))
}
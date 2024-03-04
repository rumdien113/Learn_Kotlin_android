package Chapter2

fun perimeter(r: Int): Double {
    return 2 * r * Math.PI
}
fun area(r: Int): Double {
    return Math.PI * r * r
}

fun main() {
    val r = readLine()!!.toInt()
    println("perimeter = ${perimeter(r)}")
    println("area = ${area(r)}")
}
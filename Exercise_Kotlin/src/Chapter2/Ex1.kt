package Chapter2

fun sum(n: Int) : Int {
    return (1..n).sum()
}
fun main() {
    val n = readLine()!!.toInt()
    print("sum: ${sum(n)}")
}
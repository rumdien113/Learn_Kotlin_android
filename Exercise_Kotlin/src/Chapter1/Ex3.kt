fun main() {
    print("enter a: ")
    var n:Int = readLine()!!.toInt()
    var sum:Int = 0
    for (i in 1..n)
        sum += i
    println("sum = $sum")
}
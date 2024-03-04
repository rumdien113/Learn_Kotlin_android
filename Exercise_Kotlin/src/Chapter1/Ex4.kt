fun main() {
    print("Enter a number: ")
    var n:Int = readLine()!!.toInt()
    var f = IntArray(n+1)
    f[0] = 0
    f[1] = 1
    for (i in 2..n)
        f[i] = f[i-1] * i
    print("Factorial of $n = ${f[n]}")
}
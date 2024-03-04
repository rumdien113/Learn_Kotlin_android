fun main() {
    print("enter a month: ")
    var month:Int = readLine()!!.toInt()
    when(month){
        1,2,3 -> println("1st quarter")
        4,5,6 -> println("2nd quarter")
        7,8,9 -> println("3rd quarter")
        10,11,12 -> println("4th quarter")
        else -> println("invalid month")
    }
}
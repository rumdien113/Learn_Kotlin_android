package Chapter2

fun printInfo(name: String, age: Int, address: String, phoneNumber: String): Unit {
    println("name: $name")
    println("age: $age")
    println("address: $address")
    println("phoneNumber: $phoneNumber")
}

fun main() {
    var name: String = "Nguyễn Lê Tiến Đạt"
    var age: Int = 20
    var address: String = "Huế"
    var phoneNumber: String = "0123456789"
    printInfo(name, age, address, phoneNumber)
}
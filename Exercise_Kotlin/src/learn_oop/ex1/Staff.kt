package learn_oop.ex1

class Staff(name: String, age: Int, gender: String, address: String, private var task: String): Officer(name, age, gender, address) {
    override fun toString(): String {
        return "Nhân viên: ${name}, ${age}, ${gender}, ${address}, $task"
    }
}
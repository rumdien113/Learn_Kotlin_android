package learn_oop.ex1

class Worker(name: String, age: Int, gender: String, address: String, level: Int) : Officer(name, age, gender, address) {
    private var level = level
        set(value) {
            field = if (value > 10)
                10
            else if (value < 1)
                1
            else
                value
        }
    override fun toString(): String {
        return "Công nhân: ${name}, ${age}, ${gender}, ${address}, $level"
    }
}
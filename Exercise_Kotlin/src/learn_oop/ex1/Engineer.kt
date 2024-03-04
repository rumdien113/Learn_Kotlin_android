package learn_oop.ex1

class Engineer(name: String, age: Int, gender: String, address: String, private var branch: String) : Officer(name, age, gender, address) {
    override fun toString(): String {
        return "Kỹ sư: ${name}, ${age}, ${gender}, ${address}, $branch"
    }
}
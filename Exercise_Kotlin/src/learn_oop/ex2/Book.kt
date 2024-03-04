package learn_oop.ex2

class Book(id: Int, publisher: String, number: Int, private var author: String, private var numberPage: Int): Document(id, publisher, number) {
    override fun toString(): String {
        return "Sách: ${id}, ${publisher}, ${number}, $author, $numberPage"
    }
}
package learn_oop.ex2

class News(id: Int, publisher: String, number: Int, private val dayIssue: Int): Document(id, publisher, number) {
    override fun toString(): String {
        return "News(id: $id, nxb: '$publisher', number: $number, dayIssue: $dayIssue)"
    }
}
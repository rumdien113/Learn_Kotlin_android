package learn_oop.ex2

class Magazine(id: Int, publisher: String, number: Int, private var issueNumber: Int, private var month: Int) : Document(id, publisher, number){
    override fun toString(): String {
        return "Magazine: $id, $publisher, $number, $issueNumber, $month"
    }
}
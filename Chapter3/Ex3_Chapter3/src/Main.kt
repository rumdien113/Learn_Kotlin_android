class Book(val title: String, val author: String, val ISBN: String) {
    fun display() {
        println("Title: $title")
        println("Author: $author")
        println("ISBN: $ISBN")
        println('\n')
    }
}

fun main() {
    var books: List<Book> = listOf()
    fun addBook(title: String, author: String, ISBN: String) {
        books += Book(title, author, ISBN)
    }
    fun removeBook(ISBN: String) {
        books = books.filter { it.ISBN != ISBN }
    }

    addBook("The Catcher in the Rye", "J.D. Salinger", "9780316769488")
    addBook("To Kill a Mockingbird", "Harper Lee", "9780061120084")
    addBook("1984", "George Orwell", "9780451524935")

    for (book in books)
        book.display()
    println("=======================================")
    removeBook("9780316769488")

    for (book in books)
        book.display()
}
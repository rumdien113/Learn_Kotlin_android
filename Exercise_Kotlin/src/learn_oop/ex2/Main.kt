package learn_oop.ex2

class Main {
    fun main() {
        val manager = Manager()
        while(true) {
            println("Application Document")
            println("1. Add document")
            println("2. Delete document")
            println("3. Display document")
            println("4. Search document by type")
            println("5. Exit")
            print("Enter your choice: ")
            val choice: Int = readln().toInt()
            when (choice) {
                1 -> {
                    print("Enter id: ")
                    val id: Int = readln().toInt()
                    print("Enter publisher: ")
                    val publisher: String = readln()
                    print("Enter issue number: ")
                    val number: Int = readln().toInt()
                    print("Enter type of document (1. Book, 2. Magazine, 3. News): ")
                    val type: Int = readln().toInt()
                    when (type) {
                        1 -> {
                            print("Enter author:")
                            val author: String = readln()
                            print("Enter page number: ")
                            val pageNumber: Int = readln().toInt()
                            manager.addDocument(Book(id, publisher, number, author, pageNumber))
                        }
                        2 -> {
                            print("Enter issue number: ")
                            val issueNumber: Int = readln().toInt()
                            print("Enter month issue: ")
                            val monthIssue: Int = readln().toInt()
                            manager.addDocument(Magazine(id, publisher, number, issueNumber, monthIssue))
                        }
                        3 -> {
                            print("Enter day issue: ")
                            val dayIssue: Int = readln().toInt()
                            manager.addDocument(News(id, publisher, number, dayIssue))
                        }
                        else -> {
                            println("Invalid type")
                        }
                    }
                }
                2 -> {
                    print("Enter id want to delete: ")
                    val id: Int = readln().toInt()
                    manager.deleteDocument(id)
                }
                3 -> {
                    manager.display()
                }
                4 -> {
                    print("Enter type of document (1. Book, 2. Magazine, 3. News): ")
                    val type: Int = readln().toInt()
                    when (type) {
                        1 -> {
                            manager.searchBook()
                        }
                        2 -> {
                            manager.searchMagazine()
                        }
                        3 -> {
                            manager.searchNews()
                        }
                        else -> {
                            println("Invalid type")
                        }
                    }
                }
                5 -> {
                    return
                }
                6 -> {
                    println("Invalid choice")
                }
            }
        }
    }
}
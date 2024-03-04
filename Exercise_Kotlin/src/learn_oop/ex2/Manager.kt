package learn_oop.ex2

class Manager {
    private var documents: List<Document> = mutableListOf()

    fun addDocument(document: Document) {
        this.documents += document
    }

    fun deleteDocument(id: Int) {
        this.documents = this.documents.filter { it.id != id } //khác id thì giữ lại, còn giống id thì loại bỏ
    }

    fun display() {
        for (document in documents)
            println(document.toString())
    }

    fun searchBook() {
        this.documents.stream().filter { it is Book }.forEach { println(it.toString()) }
    }

    fun searchMagazine() {
        this.documents.stream().filter { it is Magazine }.forEach { println(it.toString()) }
    }

    fun searchNews() {
        this.documents.stream().filter { it is News }.forEach { println(it.toString()) }
    }
}
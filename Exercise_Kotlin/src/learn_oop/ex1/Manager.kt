package learn_oop.ex1

class Manager {
    private var officers: List<Officer> = mutableListOf()
    fun addEmployee(officer: Officer) {
        this.officers += officer
    }

    fun search(name: String) {
        for (officer in officers) {
            if (officer.name == name)
                println(officer.toString())
        }
    }

    fun display() {
        for (officer in officers)
            println(officer.toString())
    }
}
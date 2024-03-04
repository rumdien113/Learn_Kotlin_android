class Employee(var name: String, var job: String, var salary: Double) {
    fun calculate(percent: Double) {
        var amount = salary * percent / 100
        salary += amount
    }
    fun display() {
        println("Name: $name")
        println("Job: $job")
        println("Salary: $salary")
        println()
    }
}

fun main() {
    val emp = Employee("TienDat", "Developer", 1000.0)
    emp.display()
    emp.calculate(10.0)
    emp.display()
}
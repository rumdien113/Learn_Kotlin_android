package learn_oop.ex1

class Main {
    fun main() {
        val manager = Manager()
        while(true) {
            println(message = "Application Manager")
            println("1. Add employee")
            println("2. Search employee")
            println("3. Display employee")
            println("4. Exit")
            print("Enter your choice: ")
            val choice: Int = readln().toInt()
            when (choice) {
                1 -> {
                    print("Enter name: ")
                    val name: String = readln()
                    print("Enter age: ")
                    val age: Int = readln().toInt()
                    print("Enter gender: ")
                    val gender: String = readln()
                    print("Enter address: ")
                    val address: String = readln()
                    print("Enter type of employee (1. Staff, 2. Worker, 3. Engineer): ")
                    val type: Int = readln().toInt()
                    when (type) {
                        1 -> {
                            print("Enter task: ")
                            val task: String = readln()
                            manager.addEmployee(Staff(name, age, gender, address, task))
                        }

                        2 -> {
                            print("Enter level: ")
                            val level: Int = readln().toInt()
                            manager.addEmployee(Worker(name, age, gender, address, level))
                        }

                        3 -> {
                            print("Enter branch: ")
                            val branch: String = readln()
                            manager.addEmployee(Engineer(name, age, gender, address, branch))
                        }
                        else -> {
                            println("Invalid type")
                        }
                    }
                }
                2 -> {
                    print("Enter name: ")
                    val name: String = readln()
                    manager.search(name)
                }
                3 -> {
                    manager.display()
                }
                4 -> {
                    return
                }
                else -> {
                    println("Invalid choice")
                }
            }
        }
    }
}
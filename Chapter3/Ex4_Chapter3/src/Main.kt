open class Vehicle(val make: String, val model: String, val year: Int, val fuelType: String) {
    open fun calculatingFuelEfficiency(): Double {
        return 0.0
    }
    open fun distanceTraveled(time: Double, speed: Double): Double {
        return time * speed
    }
    open fun maximumSpeed(): Double {
        return 0.0
    }
    override fun toString(): String {
        return "Make: $make, Model: $model, Year: $year, Fuel Type: $fuelType"
    }
}

class Truck(make: String, model: String, year: Int, fuelType: String): Vehicle(make, model, year, fuelType) {
    override fun calculatingFuelEfficiency(): Double {
        return 90.0
    }
    override fun distanceTraveled(time: Double, speed: Double): Double {
        return time * speed
    }
    override fun maximumSpeed(): Double {
        return 120.0
    }
}

class Car(make: String, model: String, year: Int, fuelType: String): Vehicle(make, model, year, fuelType) {
    override fun calculatingFuelEfficiency(): Double {
        return 100.0
    }
    override fun distanceTraveled(time: Double, speed: Double): Double {
        return time * speed
    }
    override fun maximumSpeed(): Double {
        return 150.0
    }
}

class Motorcycle(make: String, model: String, year: Int, fuelType: String): Vehicle(make, model, year, fuelType) {
    override fun calculatingFuelEfficiency(): Double {
        return 110.0
    }
    override fun distanceTraveled(time: Double, speed: Double): Double {
        return time * speed
    }
    override fun maximumSpeed(): Double {
        return 180.0
    }
}

fun main() {
    val truck = Truck("Toyota", "Tacoma", 2021, "Gasoline")
    val car = Car("Toyota", "Corolla", 2021, "Gasoline")
    val motorcycle = Motorcycle("Honda", "CBR1000RR", 2021, "Gasoline")

    println(truck)
    println("Fuel Efficiency: ${truck.calculatingFuelEfficiency()} km/l")
    println("Distance Traveled: ${truck.distanceTraveled(2.0, 60.0)} km")
    println("Maximum Speed: ${truck.maximumSpeed()} km/h")
    println()

    println(car)
    println("Fuel Efficiency: ${car.calculatingFuelEfficiency()} km/l")
    println("Distance Traveled: ${car.distanceTraveled(2.0, 60.0)} km")
    println("Maximum Speed: ${car.maximumSpeed()} km/h")
    println()

    println(motorcycle)
    println("Fuel Efficiency: ${motorcycle.calculatingFuelEfficiency()} km/l")
    println("Distance Traveled: ${motorcycle.distanceTraveled(2.0, 60.0)} km")
    println("Maximum Speed: ${motorcycle.maximumSpeed()} km/h")
    println()
}
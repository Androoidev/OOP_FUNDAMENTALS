package inheritance.vehicle

class Motorcycle(brand: String, val model: String, val type: String) : Vehicle(brand) {
    fun revEngine(){
        println("Vroom vroom")
    }
    fun startMotorcycle(){
        startEngine()
    }
}
package inheritance.vehicle

class Car(brand: String, val model: String) : Vehicle(brand) {
    fun honk(){
        println("Beep beep!")
    }

    fun startCar(){
        startEngine()
    }
}
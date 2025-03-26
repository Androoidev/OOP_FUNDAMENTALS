package inheritance.vehicle

open class Vehicle (val brand: String) {
    protected fun startEngine(){
        println("Engine started!")
    }
}
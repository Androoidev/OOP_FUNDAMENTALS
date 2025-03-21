package inheritance.product

fun main(){
    val product1 = Product("Ropa", 100.0)
    product1.applyDiscount(20.0)

    val cloth = Clothing("Shirt", 40.0, "Large", "Red")
    println(cloth.getClothingInfo())

    val electronics = Electronics("TV", 140.30, "Samsung", 12)
    println(electronics.getElectronicsInfo())
}
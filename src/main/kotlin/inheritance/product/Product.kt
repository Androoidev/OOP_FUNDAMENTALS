package inheritance.product

open class Product(val name: String, var price: Double) {

    fun getProductInfo(): String {
        return "\nPRODUCT INFO:\n - NAME: $name\n - PRICE: $price\n"
    }

    fun applyDiscount(discount: Double): Double {
        price -=  price * (1 - discount / 100)
    }
    constructor(name: String, price: Double, discount: Double) : this(name, price){
        applyDiscount(discount)
    }

}
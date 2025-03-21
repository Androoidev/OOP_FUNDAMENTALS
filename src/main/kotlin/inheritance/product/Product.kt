package inheritance.product

open class Product(val name: String, var price: Double) {

    open fun getProductInfo(): String {
        return "\nPRODUCT INFO:\n - NAME: $name\n - PRICE: $price\n"
    }

    fun applyDiscount(discount: Double) : Double {
        price *= (1 - discount / 100)
        return price
    }
    constructor(name: String, price: Double, discount: Double) : this(name, price){
        applyDiscount(discount)
    }

}
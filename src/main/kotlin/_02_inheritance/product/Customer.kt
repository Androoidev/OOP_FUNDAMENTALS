package inheritance.product

class Customer(val clientName: String, val email: String, val shoppingCart : MutableList<Product> = mutableListOf()) {

    fun addToCart(product: Product) {
        shoppingCart.add(product)
        println("THE PRODUCT ${product.name} HAS BEEN ADDED TO SHOPPING CART SUCCESSFULLY")
    }

    fun getCartTotal(): Double {
        return shoppingCart.sumOf { it.price }
    }

    fun checkout() {
        val total = getCartTotal()
        println("TOTAL: $$total")
        println("Processing payment...")
        if (total != 0.0){
            println("Payment successfully")
        }
    }
}
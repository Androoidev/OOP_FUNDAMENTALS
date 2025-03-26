package inheritance.product

fun main(){

    val product1 = Product("Ropa", 100.0)
    val product2 = Product("Polera", 230.0)

    product1.applyDiscount(20.0)

    val cloth = Clothing("Shirt", 40.0, "Large", "Red")
    println(cloth.getProductInfo())

    val electronics = Electronics("TV", 140.30, "Samsung", 12)
    println(electronics.getProductInfo())

    val customer = Customer("Luis", "asjd@gmail.com", mutableListOf())
    customer.addToCart(product1)
    customer.addToCart(product2)

    println(customer.getCartTotal())

    customer.checkout()
}


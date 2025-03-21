package inheritance.product

class Clothing(name: String, price: Double, val size: String, val color: String) : Product(name, price) {

    override fun getProductInfo(): String {
        val discountedPrice : Double = applyDiscount(10.0)
        return super.getProductInfo() + "\n - SIZE: $size\n - COLOR: $color\n FINAL PRICE: $discountedPrice"
    }
}
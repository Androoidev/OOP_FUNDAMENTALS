package inheritance.product

class Clothing(name: String, price: Double, val size: String, val color: String) : Product(name, price) {

    fun getClothingInfo(): String {
        val discountedPrice : Double = applyDiscount(10.0)
        return "${getProductInfo()} - SIZE: $size\n - COLOR: $color\n FINAL PRICE: $discountedPrice"
    }
}
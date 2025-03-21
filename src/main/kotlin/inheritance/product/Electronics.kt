package inheritance.product

class Electronics(name: String, price: Double, val brand: String, val warrantyPeriod: Int) : Product(name, price) {

    override fun getProductInfo(): String {
        return super.getProductInfo() + "BRAND: $brand\n - WARRANTY PERIOD: $warrantyPeriod months"
    }
}
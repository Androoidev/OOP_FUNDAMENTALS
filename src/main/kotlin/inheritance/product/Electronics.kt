package inheritance.product

class Electronics(name: String, price: Double, val brand: String, val warrantyPeriod: Int) : Product(name, price) {

    fun getElectronicsInfo() : String{
        return "${getProductInfo()} - BRAND: $brand\n - WARRANTY PERIOD: $warrantyPeriod months"
    }
}
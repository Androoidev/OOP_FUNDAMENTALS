package _04_classes.sealedclass

sealed class PaymentResult {
    data class Success(val amout: Double) : PaymentResult()
    data class Failure(val error: String) : PaymentResult()
    object Pending : PaymentResult()

    fun proccessPayment(paymentType: String): PaymentResult {
        return when (paymentType) {
            "creditCard" -> Success(100.0)
            "paypal" -> Failure("Insufficient funds")
            "bankTransfer" -> Pending
            else -> Failure("Unknown payment method")
        }
    }
}

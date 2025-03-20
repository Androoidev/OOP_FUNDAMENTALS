package fundamentals.bank_account
class BankAccount(private var balance: Double, private val holder: String) {

    fun getBalance() : Double{
        return balance
    }

    fun getBalanceMessage() : String {
        return "\nHEY, ${holder.uppercase()}, YOUR AVAILABLE BALANCE IS: $balance\n"
    }

    fun setBalance(){
        var cond = true

        while (cond) {
            println(
                """
            |  BANK ACCOUNT
            |  ------------------
            |  1. DEPOSIT MONEY
            |  2. WITHDRAW MONEY
            |  3. EXIT
            |  ------------------
            """.trimMargin()
            )
            print("PLEASE CHOOSE AN OPTION (1-3): ")
            val opt = readlnOrNull()?.toIntOrNull()

            when (opt) {
                1 -> depositMoney()
                2 -> withdrawMoney()
                3 -> {
                    println("EXITING...")
                    cond = false
                }
                else -> println("INVALID OPTION. PLEASE TRY AGAIN")
            }
        }
    }

    fun depositMoney(){
        print("ENTER THE AMOUNT TO DEPOSIT: ")
        val amount = readlnOrNull()?.toDoubleOrNull()

        if (amount != null && amount > 0) {
            balance += amount
            println("YOU HAVE ADDED $$amount. AVAILABLE BALANCE: $$balance")
        } else {
            println("INVALID AMOUNT. MUST BE MORE THAN $0\n")
        }
    }

    fun withdrawMoney(){
        print("ENTER THE AMOUNT TO WITHDRAW: ")
        val amount = readlnOrNull()?.toDoubleOrNull()

        if (amount != null && amount > 0){
            if (amount <= balance){
                balance -= amount
                println("\nYOU HAVE WITHDRAWED $$amount. REMAINING BALANCE: $$balance\n")
            } else {
                println("INSUFFICIENT FUNDS TO WITHDRAW THIS AMOUNT\n")
            }
        } else {
            println("INVALID AMOUNT. MUST BE OVER $0\n")
        }

    }
}
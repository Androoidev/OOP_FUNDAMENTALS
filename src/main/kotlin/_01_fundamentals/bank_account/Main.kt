package _01_fundamentals.bank_account

fun main(){

    val account1 = BankAccount(10.0,"Luis")
    print(account1.getBalanceMessage())
    account1.setBalance()
}
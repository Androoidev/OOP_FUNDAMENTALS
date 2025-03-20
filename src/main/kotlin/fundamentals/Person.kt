package fundamentals

fun main(){
    val person1 = Person("Luis", 26,'M')
    val person2 = Person("Jazmin", 31, 'F')
    // Gender no provided
    val personGenderDefault = Person("Ariel", 43)
}

class Person(
    // Primary Constructor
    private var name: String,
    private val age: Int,
    private val gender: Char = 'X' // Default Value
) {
    init {
        println("Person named $name, age $age and gender $gender has been added.")
    }


    fun setName(){
        print("Enter your new name: ")
        val newName = readlnOrNull()?.takeIf { it.isNotBlank() }

        if (newName != null && newName != name){
            name = newName
            println("Name updated succesfully!")
        } else{
            println("Invalid or same name entered. No changes made.")
        }
    }


}
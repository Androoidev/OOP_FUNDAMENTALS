package fundamentals.person

// This program defines a 'Person' class that allows creating person objects with their name, age, and gender.
// It provides functionality to update the person's name via the setName() function after prompting the user for input.

class Person(
    // Primary Constructor
    private var name: String,
    private val age: Int,
    private val gender: Char = 'X' // Default Value
) {

    // Initializes the class with a message with the added person's data
    init {
        println("Person named $name, age $age and gender $gender has been added.")
    }

    // Changes the person's name
    fun setName(){
        print("Enter your new name $name: ")
        // Read input from the user and assign it to newName if it is not null and not blank
        val newName = readlnOrNull()?.takeIf { it.isNotBlank() }

        // Check if the newName is not null and not the same as the current name
        if (newName != null && newName != name){
            // If valid, update the name and notify the user
            name = newName
            println("Name updated succesfully!")

            // If the newName is null or the same as the current name, no change is made
        } else{
            println("Invalid or same name entered. No changes made.")
        }
    }
}
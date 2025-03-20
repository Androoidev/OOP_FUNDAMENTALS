package fundamentals.person

fun main(){
    // Creating Person objects
    val person1 = Person("Luis", 26,'M')
    val person2 = Person("Jazmin", 31, 'F')
    // Gender not provided, so the default value 'X' will be used for the gender
    val personGenderDefault = Person("Ariel", 43)

    // Call setName() for person1
    person1.setName()
}
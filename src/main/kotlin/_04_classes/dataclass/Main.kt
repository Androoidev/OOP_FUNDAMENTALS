package _04_classes.dataclass

import _04_classes.dataclass.Book

fun main(){
    val book1 = Book("1984","George Orwell", 1949, "fiction", true)

    //book1.getBookInfo()

    // Authomatics Methods
    println(book1.toString())

    val book2 = book1.copy(isAvailable = false)
    println(book2.toString())

    // Destructuring declarations
    val (title, author, year) = book1
    println(title)
}
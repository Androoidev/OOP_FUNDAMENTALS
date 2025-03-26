package _01_fundamentals.book

fun main(){
    val book1 = Book("Lord Of The Rings", "J.R.R. Tolkien",1954, "Fantasy")
    val book2 = Book("Harry Potter", "J.K. Rowling")

    println(book1.getBookInfo())
    println(book2.getBookInfo())

    book2.updateYear(1997)
    println("\nCase 1:\n${book2.getBookInfo()}")

    book2.updateYear(2024)
    println("\nCase 2:\n${book2.getBookInfo()}")
}
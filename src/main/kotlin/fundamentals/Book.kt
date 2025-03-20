package fundamentals

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
class Book (
    val title: String,
    val author: String,
    private var year: Int,
    val genre: String) {

    constructor(title: String, author: String) :
            this(title, author, 2024, "Unknown")


    fun getBookInfo() : String {
        return """
            BOOK INFO
            ------------------
            | TITLE:  $title
            | AUTHOR: $author
            | YEAR:   $year
            | GENRE:  $genre
            ------------------
        """.trimIndent().uppercase()
    }

    fun updateYear(newYear: Int) {
        when {
            newYear <= 0 -> println("INVALID YEAR. MUST BE GREATER THAN O.")
            newYear > 2025 -> println("INVALID YEAR. MAXIMUM ALLOWED IS 2025.")
            newYear == year -> println("INVALID YEAR. MUST BE DIFFERENT FROM CURRENT YEAR.")
            else -> {
                year = newYear
                println("YEAR UPDATED SUCCESSFULLY TO $newYear")
            }
        }
    }
}
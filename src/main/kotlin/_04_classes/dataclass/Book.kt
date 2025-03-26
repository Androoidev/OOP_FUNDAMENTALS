package _04_classes.dataclass

data class Book(
    val title: String,
    val author: String,
    val year: Int,
    val genre: String,
    val isAvailable: Boolean
) {
    fun getBookInfo(){
        println("""
            |TITLE:     $title
            |AUTHOR:    $author
            |YEAR:      $year
            |GENRE:     $genre
            |AVAILABLE: $isAvailable
        """.trimIndent())
    }
}
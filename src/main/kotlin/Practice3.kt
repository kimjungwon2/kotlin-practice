// 정적인 메소드나 정적인 변수를 선언할 때 사용.
// 자바의 static 역할을 한다.
class Book private constructor(val id: Int, val name : String){

    companion object BookFactory :IdProvider{

        val myBook = "new book"
        fun create() = Book(getId(), myBook)
        override fun getId(): Int {
            return 444
        }
    }

}

interface IdProvider{
    fun getId() : Int

}

fun main(){
    val book = Book.create()

    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
    println(bookId)

}
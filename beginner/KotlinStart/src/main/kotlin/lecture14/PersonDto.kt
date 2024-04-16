package lecture14

fun main(){
    val Person1 = PersonDto("김정원",20)
    val Person2 = PersonDto("김원",230)

    println(Person2 == Person1)
    println(Person2)
}


data class PersonDto (
    val name: String,
    val age: Int,
)


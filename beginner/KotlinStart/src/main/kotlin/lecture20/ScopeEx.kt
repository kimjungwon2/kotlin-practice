package lecture20

fun main(){
    val strings = listOf("APPLE","CAR")

    strings.map{ it. length}
        .filter { it>3 }
        .let(::println)


    val str = "apple"
    val length = str?.let{
        println(it.uppercase())
        it.length
    }



}
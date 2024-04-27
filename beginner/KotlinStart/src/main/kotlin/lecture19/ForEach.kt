package lecture19

fun main(){
    val numbers = listOf(1,2,3)

    numbers.map {it + 1}.forEach{println(it)}


    run {
        numbers.forEach{ number->
        if(number ==2){
            return@run
        }}
    }
}
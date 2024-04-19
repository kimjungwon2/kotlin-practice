package lecture15

fun main(){
    val numbers = setOf(100,200)

    for (number in numbers){
        println(number)
    }

    for((i,v) in numbers.withIndex()){
        println("${i} ${v}")
    }



}
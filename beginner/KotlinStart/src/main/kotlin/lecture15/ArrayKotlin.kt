package lecture15

fun main(){
    val array = arrayOf(100, 200)

    array.plus(300)

    for (i in array.indices){
        println("${i} ${array[i]}")
    }

    for ((i,value) in array.withIndex()){
        println("${i} ${value}")
    }

}
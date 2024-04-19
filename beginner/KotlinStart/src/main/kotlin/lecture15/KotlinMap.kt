package lecture15

fun main(){

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1,"Monday")
    oldMap[2] = "Tuesday"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")


    for (key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries){
        println(key)
        println(value)
    }



}
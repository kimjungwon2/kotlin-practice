
fun main(){
    val number1 = 3
    val number2: Long = number1.toLong()

    val num1:Int? = 3
    val num2:Long = num1?.toLong() ?:0L
}

fun printAgeIfPerson(obj: Any){
    if(obj is Person){
        println(obj.age)
    }
}
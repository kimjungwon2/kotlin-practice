fun main(){
    checkNum(1)
}

//4. 조건식
fun maxBy(a :Int, b:Int):Int{

    if(a>b){
        return a
    } else{
        return b
    }
}

fun maxBy2(a : Int, b:Int) = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when (score){
        1->1
        2->2
        else -> 3
    }

    println("b : $b")

    when(score){
        in 90..100->println("You are Genius")
        in 10..80 ->println("Not bad")
        else -> println("okay")
    }
}

//Expression vs Statement

// 5. Array and List

// array
// List 1. list 2. MutableList => ArrayList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0]=3

    val arrayList =arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}
fun main(){
    nullCheck()
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

// 6. For / while
fun forAndWhile(){
    val students = arrayListOf("joyce","james","jenny","jennifer")

    for(name in students){
        println("$name")
    }

    var sum:Int =0
//
//    for(i in 1..10 step 2){
//        sum+=i
//    }

    for((index,name) in students.withIndex()){
        println("${index+1}번째 학생 : $name")
    }


    for(i in 1 until 100){ //100을 포함하지 않는다. 1..100=>1부터 100이다.
        sum+=i
    }

    println(sum)

    var index = 0
    while(index<10){
        println("current index : $index")
        index++
    }
}

// 7. NonNull / Nullable
fun nullCheck(){
    // 컴파일 시점에서 NPE를 잡아줌

    var name : String = "joyce"
    var nullName : String? = null

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()

    //?: 엘비스 연산자
    val lastName:String? ="kim"
    val fullName = name +" "+ (lastName?:"No lastName")
    println(fullName)

}

//!! 컴파일한테 null이 아니다는 걸 보증해준다. 이것보다는 위의 방식을 쓰는 게 좋다.
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upperCase = mNotNull.uppercase()

    val email : String? ="joycehongXXX@nana.vom"
    email?.let{
        println("my email is $email")
    }
}


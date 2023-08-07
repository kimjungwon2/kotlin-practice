open class Human constructor(name:String= "Anonymous"){

    //java
    /**
     * class Person{
     * public Person(String name){
     * }
     *
     * public Person(String name, int age){
     * this(name);
     * }
     *
     * **/

    constructor(name:String, age: Int) :this(name){
        println("my name is ${name}, ${age}years old")
    }

    // 주 생성자의 일부. 먼저 실행된다.
    init{
        println("New human has been born!!")
    }

    val name = name
    fun eatingCake(){
        println("This is so YUMMYYY~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){

    override fun singASong(){
        super.singASong()
       println("라라랄")
        println("my name is :${name}")
    }

}

fun main(){
//    val human = Human("minsu")
//    val stranger = Human()
//    human.eatingCake()

//    val mom = Human("Kuri",52)

//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}")

    val korean =Korean()
    korean.singASong()
}
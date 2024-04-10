package lecture09

fun main(){
    val person = Person("최태현")
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person(
    val name: String,
    var age:Int
){
    init{
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String): this(name, 1){
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동"){
        println("두 번째 부생성자")
    }
}
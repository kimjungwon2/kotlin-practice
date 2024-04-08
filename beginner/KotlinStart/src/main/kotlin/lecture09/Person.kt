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

    constructor(name: String): this(name, 1)


}
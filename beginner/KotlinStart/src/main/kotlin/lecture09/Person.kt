package lecture09

fun main(){
    val person = Person("최태현",100)
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person(
    val name: String,
    var age:Int
)
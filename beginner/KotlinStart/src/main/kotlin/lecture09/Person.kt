package lecture09

fun main(){
    val person = Person("최태현")
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person(
    name: String = "김정원",
    var age: Int = 29
){

    var name = name
        set(value){
            field = value.uppercase()
        }

    init{
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    fun isAdult(): Boolean{
        return this.age >=20
    }

}
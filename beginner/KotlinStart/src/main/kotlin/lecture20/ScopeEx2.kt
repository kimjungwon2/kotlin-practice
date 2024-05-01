package lecture20

import lecture19.Person

fun main(){
    val person = Person("김정원",100).run{
//        hobby = "독서"
//        personRepository.save(this)
    }

    mutableListOf("one", "two", "three")
        .also{println("four 추가 이전 자금 값: $it")}
        .add("four")


}


fun createPerson(
    name:String,
    age:Int,
    hobby: String,
): Person{
    return Person(
        name = name,
        age = age
    ).apply {
//        this.hobby = hobby
    }
}
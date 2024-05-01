package lecture20

import lecture19.Person

fun main(){
    val person = Person("김정원",100).run{
//        hobby = "독서"
//        personRepository.save(this)
    }


}


fun createPerson(
    name:String,
    age:Int,
    hobby: String,
): Person{
    return Person(
        name = name,
        age = age,
    ).apply {
        hobby = hobby
    }
}
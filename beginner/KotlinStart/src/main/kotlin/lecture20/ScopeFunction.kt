package lecture20

import lecture19.Person

fun main(){

}

fun printPerson(person: Person?){
    person?.let{
        println(it.name)
        println(it.age)
    }

    if(person != null){
        println(person.name)
        println(person.age)
    }
}
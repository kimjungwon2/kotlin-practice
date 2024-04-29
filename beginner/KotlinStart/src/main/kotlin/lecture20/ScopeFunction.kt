package lecture20

import lecture19.Person

fun main(){

    val person = Person("김순철",30)

    val value1 = person.let{
        it.age
    }

    val value2 = person.run{
        this.age
    }

    val value3 = person.also{
        it.age
    }

    val value4 = person.apply{
        this.age
    }

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


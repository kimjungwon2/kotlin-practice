
// 1. 람다

//val square : (Int) -> (Int) = {number ->number*number}
val square = {number :Int ->number*number}

val nameAge = {name:String, age:Int ->
    "my name is $name I'm $age"
}

fun main(){
    println(square(12))
    println(nameAge("joyce",99))

    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana",27))
    println(calculateGrade(981))

    val lambda = {number : Double->
        number == 5.2343
    }

    println(invokeLambda(lambda))
    println(invokeLambda({it<3.4}))


}

//확장 함수
val pizzaIsGreat : String.() -> String ={
    this+"Pizza is the best!"
}

// this => 함수를 콜 하는 object, it => 하나 들어가는 파라미터의 경우 it으로 생략이 가능.
fun extendString(name : String, age: Int):String{
    val introduceMyself :String.(Int) -> String ={
       "I am $this and $it years old"
    }

    return name.introduceMyself(age)
}

// 람다의 Return
val calculateGrade : (Int) -> String ={
    when(it) {
        in 0..40 ->"fail"
        in 41..70 ->"pass"
        in 71..100 ->"perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda: (Double) ->Boolean): Boolean{
    return lambda(5.2343)
}

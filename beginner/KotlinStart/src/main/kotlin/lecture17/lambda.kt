package lecture17

fun main(){
    val fruits = listOf(
        Fruit("사과",1_000),
        Fruit("사과",1_200),
        Fruit("사과",1_200),
        Fruit("사과",1_500),
        Fruit("바나나",3_000),
        Fruit("바나나",3_200),
        Fruit("바나나",2_500),
        Fruit("수박",10_000),
    )



    val isApple = fun(fruit: Fruit): Boolean{
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = {it.name == "사과"}

    filterFruits(fruits, isApple2)

    val map: Map<String, List<Fruit>> = fruits.groupBy {fruit -> fruit.name}
    println(map)




}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit)-> Boolean
): List<Fruit>{
    return fruits.filter(filter)
}

class Fruit(val name:String, val price:Int)
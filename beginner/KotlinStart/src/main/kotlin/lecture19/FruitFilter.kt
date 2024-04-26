package lecture19

import lecture17.Fruit

fun filterFruits(fruits:List<Fruit>, filter:(Fruit)->Boolean){

}

typealias FruitFilter = (Fruit)->Boolean

fun filterFruits2(fruits:List<Fruit>, filter:FruitFilter){

}
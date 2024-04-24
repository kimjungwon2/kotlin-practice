package lecture17

fun main(){
    val fruit2s = listOf(
        Fruit2(1,"사과",1_000,1000),
        Fruit2(2,"바나나",2_000,1500),
        Fruit2(3,"망고",3_000,1500),
        Fruit2(4,"사과",4_000,2500)
    );

    val apple = fruit2s.filter { fruit->fruit.name =="사과"}

    println(apple)

    //사과의 가격들
    val applePrices = fruit2s.filter { fruit->fruit.name=="사과" }
        .map{fruit->fruit.currentPrice}

    println(applePrices)

    val isAllApple = fruit2s.all{fruit->fruit.name =="사과"}
    println(isAllApple)

    val isNoApple = fruit2s.none{fruit->fruit.name=="사과"}
    println(isNoApple)

    val isNoApple2 = fruit2s.any {fruit -> fruit.factoryPrice >=10_000 }
    println(isNoApple2)
}


data class Fruit2(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)
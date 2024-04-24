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
}


data class Fruit2(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)
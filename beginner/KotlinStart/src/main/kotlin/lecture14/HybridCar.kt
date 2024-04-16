package lecture14

fun main(){
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar){
    when(car){
        is Avante -> println("아빤떼다요")
        is Grander -> println("그렌저다요")
        is Sonata -> println("소나타다요")
    }
}



sealed class HyundaiCar(
        val name:String,
        val price:Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grander : HyundaiCar("그랜저", 3_000L)
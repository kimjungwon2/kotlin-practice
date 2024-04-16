package lecture14

sealed class HyundaiCar(
        val name:String,
        val price:Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grander : HyundaiCar("그랜저", 3_000L)
package lecture13



class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
){
    class LivingRoom(
        private val area: Double
    )
}
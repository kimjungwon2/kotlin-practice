
fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다.")
    }
}

class JavaMoney(val amount: Long) : Comparable<JavaMoney> {
    override fun compareTo(other: JavaMoney): Int {
        return this.amount.compareTo(other.amount)
    }
}
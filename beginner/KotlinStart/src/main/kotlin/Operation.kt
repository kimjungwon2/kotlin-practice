
fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val mon1 = JavaMoney(1_000L)
    val mon2 = mon1
    val mon3 = JavaMoney(1_000L)

    println(mon1 === mon2)
    println(mon1 === mon3)
    println(mon1 == mon3)
}

class JavaMoney(val amount: Long) : Comparable<JavaMoney> {
    override fun compareTo(other: JavaMoney): Int {
        return this.amount.compareTo(other.amount)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JavaMoney) return false
        return this.amount == other.amount
    }
}
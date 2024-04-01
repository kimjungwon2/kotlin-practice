fun main(){
    if (fun1() || fun2()){
        println("본문")
    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
}

fun fun1(): Boolean{
    println("fun 1")
    return true
}

fun fun2(): Boolean{
    println("fun 2")
    return false
}

class Money(val amount: Long) : Comparable<JavaMoney> {
    override fun compareTo(other: JavaMoney): Int {
        return this.amount.compareTo(other.amount)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JavaMoney) return false
        return this.amount == other.amount
    }

    operator fun plus(money2: Money): Any {
        return this.amount + money2.amount
    }
}
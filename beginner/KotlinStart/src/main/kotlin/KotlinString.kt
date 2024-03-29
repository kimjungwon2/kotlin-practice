
fun main(){
    val name = "김정원"

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()

    println(str)

    val str2 = "아무개"
    println(str2[0])
    println(str2[2])
}
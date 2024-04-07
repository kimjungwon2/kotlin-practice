package lecture08

fun main(){
    repeat("Hello World", useNewLine = false)
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
){
    for (i in 1..num){
        if(useNewLine){
            println(str)
        } else{
            print(str)
        }
    }
}
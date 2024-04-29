package lecture19

fun getNumberOrNullV2(number:Int): Int?{
    return number.takeIf {it>0}
}
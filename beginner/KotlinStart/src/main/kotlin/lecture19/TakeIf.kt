package lecture19

fun getNumberOrNullV2(number:Int): Int?{
    return number.takeIf {it>0}
}

fun getNumberOrNullV3(number:Int): Int?{
    return number.takeUnless { it<=0 }
}
fun validateScoreIsNotNegative(score: Int){
    if(score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }


}

fun getPassOrFail(score: Int): String{
    return if(score>=50){
        return "P"
    } else{
        return "F"
    }
}

fun getGrade(score: Int): String{
    return if(score>=90){
        "A"
    }else if(score>=80){
        "B"
    }else if(score>=70){
        "C"
    }else{
        "D"
    }
}


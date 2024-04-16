package lecture14

fun handleCountry(country: Country){
    when (country){
        Country.AMERICA -> println("미국")
        Country.KOREA -> println("한국")
    }
}


enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}
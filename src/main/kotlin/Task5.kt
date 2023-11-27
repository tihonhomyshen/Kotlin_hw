fun getYearEra(year : Int): String{
    val yearString: String = when (year){
        in Int.MIN_VALUE..1969 -> "до"
        1970 -> "соответствует"
        in 1971..1999 -> "После (XX век)"
        in 2000..2099 -> "После (XXI век)"
        else -> "Далекое будущее"
    }
    return yearString
}

fun main(){
    println("Введите год:")
    println(getYearEra(readln().toInt()))
}
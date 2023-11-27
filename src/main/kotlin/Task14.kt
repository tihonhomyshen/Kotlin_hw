fun getLength(str: String?): Int?{
    return str?.length
}

fun main(){
    val notNullString = "dsad"
    println(getLength(notNullString))
    val nullVariable = null
    println(getLength(nullVariable))
}
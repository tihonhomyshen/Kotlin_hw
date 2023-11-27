fun getLength1(str: String?): Int{
    return str!!.length
}

fun main(){
    val notNullString = "dsad"
    println(getLength1(notNullString))
    val nullVariable = null
    println(getLength1(nullVariable))
}
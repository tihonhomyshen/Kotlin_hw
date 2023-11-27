fun calcChairs(alienCount: Int): Int {
    return alienCount + (alienCount / 2)
}

fun main(){
    println("Введите количество пришельцев:")
    val aliens: Int = readln().toInt()
    println(calcChairs(calcChairs(aliens)))
}




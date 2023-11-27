fun sugarSwap(cashAmount: Int, dayNumber: Int, bugRank: Int): Int {
    return cashAmount * dayNumber * (bugRank + 42)
}

fun main(){
    println("Введите кол-во денежных единиц, день недели и ранг")
    val sugarTotal: Int = sugarSwap(readln().toInt(), readln().toInt(), readln().toInt())
    println("Количество сахара: $sugarTotal кг")
}
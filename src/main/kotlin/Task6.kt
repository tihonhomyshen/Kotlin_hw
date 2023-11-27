fun calculateEvenDigits(salaryString: String): Int{
    var salary = 0
    for (letter in salaryString){
        val num: Int = letter.digitToInt()
        if (num % 2 == 0){
            salary += num
        }
    }
    return salary
}

fun main(){
    println("Введите строку:")
    val total = calculateEvenDigits(readln())
    print("Зарплата: $total инопланетых монет")
}
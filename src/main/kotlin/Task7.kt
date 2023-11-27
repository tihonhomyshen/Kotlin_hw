fun calculateBugMentions(string: String): Int {
    val wordsArray = string.split(" ")
    var bugCount = 0
    for (elem in wordsArray){
        if (elem.lowercase() == "bug") {
            bugCount++
        }
    }
    return bugCount
}

fun main(){
    println("Введите строку:")
    val wordsCount = calculateBugMentions(readln())
    println("Количество слова bug в строке: $wordsCount")
}
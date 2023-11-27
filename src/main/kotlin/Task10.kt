class SugarStorage (var volume: Int){

    fun decreaseSugar(value: Int){
        if (value > 0){
            if (volume - value < 0) volume = 0
            else volume -= value
        }
    }

    fun increaseSugar(value: Int){
        if (value > 0) volume += value
    }
}

fun main(){
    println("Введите начальный запас хранилища:")
    val initialValue = readln().toInt()
    val sugarStorage = SugarStorage(initialValue)
    while (true){
        println("Выберите команду для выполнения: '+' - пополнить баланс сахара, '-' - убавить, 'quit' - закончить")
        val operation = readln()
        when (operation) {
            "+" -> {
                println("Введите количество сахара для пополнения:")
                sugarStorage.increaseSugar(readln().toInt())
            }
            "-" -> {
                println("Введите количество сахара, которое нужно убрать:")
                sugarStorage.decreaseSugar(readln().toInt())
            }
            "quit" -> break
        }
        println("Количество сахара теперь: ${sugarStorage.volume}")
    }
}


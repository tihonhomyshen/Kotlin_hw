fun getCubeList(num: Int): MutableList<Int> {
    val list: MutableList<Int> = mutableListOf()
    for (i in 0..<num){
        list.add(i * i * i)
    }
    return list
}

fun main(){
    println("Введите число:")
    val num: Int = readln().toInt()
    println("Полученный список: ${getCubeList(num)}")
}
open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int{
        return rank
    }

    fun getId(): String{
        return "${rank}.${name}"
    }
}

class BugCivilian(rank: Int, name: String): Bug(rank, name){

    override fun getSugarLimit(): Int {
        return rank / 2
    }
}

fun main(){
    println("Введите ранг и имя:")
    val rank: Int = readln().toInt()
    val name: String = readln()
    val bug = Bug(rank, name)
    val bugCivilian = BugCivilian(rank, name)
    println("Значения метода класса родителя и класса наследника:")
    println("${bug.getSugarLimit()}, ${bugCivilian.getSugarLimit()}")
}
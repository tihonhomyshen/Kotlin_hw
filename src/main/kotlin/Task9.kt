class NibirunianClass (namePlate: String){
    fun createNamePlate(name: String): String {
        return "Живи долго и счастливо, $name"
    }
}

fun main(){
    val nibirunian = NibirunianClass("Тарелка 1")
    println(nibirunian.createNamePlate("Кошмар 2"))
}

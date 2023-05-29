interface funcionario{
    val salario: Float
    fun bonus(): Float
}
class gerente(override val salario: Float) : funcionario{  // Override na variável salario para entender que é a mesma da linha 2
    override fun bonus(): Float {
        return salario * 0.3f
    }


}
class analista(override val salario: Float) : funcionario {  // Override na variável salario para entender que é a mesma da linha 2

    override fun bonus(): Float {
        return salario * 0.1f
    }
}


    fun mostraBonus(g: gerente){  // Posso codar assim
    println(g.bonus())
    }
    fun mostraBonus(a: analista){ // Posso codar assim
        println(a.bonus())
    }
        // Ou posso utilizar o polimorfismo e realizar dessa forma:
        fun mostraBonus(func: funcionario){
            println(func.bonus())
        }



fun main() {
    mostraBonus(gerente(5000f))
    mostraBonus(analista(5000f))

}



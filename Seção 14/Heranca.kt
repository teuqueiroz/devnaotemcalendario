class carro(val marca: String) : motor(){  // Herdeiro
    fun andar(){
        TemGasolina()
        println("andando com minha $marca: Vrum vrum !!")
    }
}


open class motor(){
    private var gasolina =  2

    fun TemGasolina() {
        if (gasolina >= 1){
            println("Ligando motor")
            return
        } else{
            println("Põe gasolina neh")
        }
    }
}

fun main(args: Array<String>) {

    carro("Ferrari").andar()
}
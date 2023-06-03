class Portaria {
    val Console = Console()

    fun controle(){
        val idade = Console.readInt("Qual a sua idade ? ")
            if (idade < 18){
                println("Negado!  Menores de idade não são permitidos")
            }

        val tipoConvite = Console.readString("Qual o tipo de convite ?")
        println(tipoConvite)
    }
}
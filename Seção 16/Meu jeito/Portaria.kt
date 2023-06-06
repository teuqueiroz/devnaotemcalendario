class Portaria {
    val Console = Console()

    fun controle() {
        val idade = Console.readInt("Qual a sua idade ? ")
        if (idade < 18) {
            println("Negado!  Menores de idade não são permitidos")
            return
        }

        val tipoConvite = Console.readString("Qual o tipo de convite ?")
        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
            println("Prossiga")
            val CodConvite = Console.readStringCod("Informe o código do seu convite")
            if (tipoConvite == "luxo" || tipoConvite == "premium") {
                if (CodConvite.startsWith("XL", true)) {
                    println("Welcome")
                } else {
                    println("Negado. Convite inválido.")
                }
            }else if(tipoConvite == "comum" && CodConvite.startsWith("XT" , true)){
                println("Welcome")
            } else {println("Negado. Convite inválido.")}
        } else {
            println("Negado. Convite inválido.")
        }


    }
}
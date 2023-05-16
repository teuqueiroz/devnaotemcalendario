fun main() {
    print("Qual é a sua idade? ")
    val idade = readLine()!!.toInt()

    if (idade < 18) {
        println("Negado. Menores de idade não são permitidos.")
        return
    }

    print("Qual é o tipo de convite? (comum/premium/luxo) ")
    val tipoConvite = readLine()!!

    if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
        println("Negado. Convite inválido.")
        return
    }

    print("Qual é o código do convite? ")
    val codigoConvite = readLine()!!

    if ((tipoConvite == "premium" || tipoConvite == "luxo") && !codigoConvite.startsWith("XL")) {
        println("Negado. Convite inválido.")
        return
    } else if (tipoConvite == "comum" && !codigoConvite.startsWith("XT")) {
        println("Negado. Convite inválido.")
        return
    }

    println("Welcome :)")
}
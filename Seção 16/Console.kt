class Console {
    fun TratamentoInformação(msg: String): Int? {
        var retornoIdade: Int? = null

        do {
            println(msg)
            val idade = readLine()

            if (idade != null && idade != "") {
                retornoIdade = idade.toIntOrNull()
            } else {
                println("Valor inválido !")
            }

        } while (idade == null || idade =< 0)

    }
}
package control

class Console private constructor(){
    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null

            do {
                println(msg)
                val info = readLine()

                if (info != null && info != "") {
                    retorno = info.toIntOrNull()

                    if (retorno == null || retorno <= 0) {
                        println("Informação inválida.")
                    }

                } else println("Informação inválida.")

            } while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null

            do {
                println(msg)
                val info = readLine()

                if (info != null && info != "") {
                    retorno = info.toString().lowercase()

                } else {
                    println("Informação inválida.")
                }

            } while (retorno == null)
            return retorno
        }
    }

}

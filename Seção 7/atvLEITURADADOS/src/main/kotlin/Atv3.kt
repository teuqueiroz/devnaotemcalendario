/*4 Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”. */

fun main() {
    println("Qual a sua idade ? ")
    val idade = readLine()!!.toInt()
    if (idade != null && idade < 18) {
        println("Negado. Menores de idade não são permitidos")
    } else {
        println(" Qual o seu tipo de convite ? ")
        val convt = readLine()
        if (convt == "Comum" || convt == "premium" || convt == "luxo") {
            println("Qual o código do seu convite ? ")
            val cod = readLine()
            if (cod != null && cod != "") {
                if (convt == "Comum" && cod.startsWith("XT", true)) {
                    println("Welcome :)")
                } else if ((convt == "luxo" || convt == "premium") && cod.startsWith("XL", true)) {
                    println("Welcome :)")
                } else {
                    println("Negado, código inválido")
                }

            }
        }
    }
}
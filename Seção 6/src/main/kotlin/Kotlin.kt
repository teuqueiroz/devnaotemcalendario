/* Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos

2 Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
3 Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
4 Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
5 Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
6 Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.  */



    //QUESTÃO 1:
    fun transfor(years: Int) {
        val meses = years * 12
        val days = years * 365
        val hours = days * 24
        val minutes = hours * 60
        val seconds = minutes * 60

        println("$years equivalem a:")
        println("$meses meses;")
        println("$days dias;")
        println("$hours horas;")
        println("$minutes minutos;")
        println("$seconds segundos.")
    }

    // QUESTÃO 2
    fun caracteres(nome: String): Int = nome.length


    // QUESTÃO 3
    fun funcubo(cubo: Int) = cubo*cubo*cubo




    // QUESTÃO 4
    fun convert(milhas: Double): Double = milhas * 1.6


    //QUESTÃO 5

    fun trocanome(str: String): String {
        return (str.replace("a", "x", true).uppercase())
    }



fun main() {


    println(transfor(2))
    println(caracteres("Andrews Matheus"))
    println(funcubo(3))
    println(convert(33.5))
    println(trocanome("Andrews Matheus"))
}
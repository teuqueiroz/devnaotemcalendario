/*
2 Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).*/

fun main() {
    println("Digite o primeiro lado do triângulo: ")
    var n1 = readLine()
    if (n1 != null && n1 != "") {
        n1.toInt()
    }

    println("Digite o segundo lado do triângulo: ")
    val n2 = readLine()
    if (n2 != null && n2 != "") {
        n2.toInt()
    }

    println("Digite o terceiro lado do triângulo: ")
    val n3 = readLine()
    if (n3 != null && n3 != "") {
        n3.toInt()
    }

    if (n1 == n2 && n2 == n3 && n1 == n3) {
        println("É um triango equilátero")
    } else {
        println("Não é um triango equilátero")
    }
}
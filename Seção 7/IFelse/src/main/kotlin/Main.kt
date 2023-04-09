/* 1 Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

2 Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00w
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00 */



fun aumento(cargo: String): Float {
    if (cargo == "gerente") {
        return 2000f
    } else if (cargo == "coordenador") {
        return 1500f
    } else if (cargo == "Engenheiro de software") {
        return 1000f
    } else if (cargo == "Estagiário") {
        return 500f
    } else {
        return 0f
    }

}


fun main() {
    println(aumento("gerente"))


}
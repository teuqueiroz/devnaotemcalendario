/*2 Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00 */


fun aumento2(cargo: String, anos: Double): Float {
    if (cargo == "gerente") {
        if (anos <= 1.9) {
            return 2000f
        } else {
            return 3000.00f
        }
    } else if (cargo == "coordenador") {
        if (anos <= 1.0) {
            return 1500f
        } else {
            return 1800f
        }

    } else if (cargo == "Engenheiro de software") {
        return 1000f
    } else if (cargo == "Estagiário") {
        return 500f
    } else {
        return 0f
    }
}


fun main() {
    println("Para o seu cargo e anos na empresa você receberá o aumento de R$${aumento2("gerente", 2.3)}")

}


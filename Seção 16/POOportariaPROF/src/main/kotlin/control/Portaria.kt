package control

import business.ConvidadoBusiness
import entity.Convidado
// AREA DE CONTROLE
class Portaria  {
    private val ConvidadoBusiness = ConvidadoBusiness()
    init {
        println("Portaria inicializada")
        controle()
    }
    private fun controle() {
        val idade = Console.readInt("Qual a sua idade ? ")
        val convidado = Convidado(idade = idade)

        if (!ConvidadoBusiness.MaiorIdade(convidado.idade))
            return println("Negado. Menores de idade não são permitidos.")

        convidado.tipoConvite = Console.readString("Qual o tipo de convite ?")
        if (!ConvidadoBusiness.TipoValido(convidado.tipoConvite))
            return println("Negado. Convite inválido.")

        convidado.codigo = Console.readString("Qual o codigo do convite ?")
        if (!ConvidadoBusiness.ConvidadoValido(convidado))
            return println("Negado. Código inválido.")


        return println("Welcome! :)")
    }
}
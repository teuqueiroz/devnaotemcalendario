package business

import entity.Convidado
// AREA DE VALIDAÇÕES
class ConvidadoBusiness {

    fun TipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun MaiorIdade(idade: Int): Boolean {
        return idade >= 18
    }

    fun ConvidadoValido(convite: Convidado) = when (convite.tipoConvite){
            "comum" -> convite.codigo.startsWith("xt")
            "premium" , "luxo" -> convite.codigo.startsWith("xl")
            else -> false
        }
    }

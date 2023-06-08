package business

import control.Console
import entity.convite

class ConvidadoBuniness {
    fun TipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun MaiorIdade(idade: Int) = idade >= 18

    fun ConviteValido(convite: convite) {

        }
    }
}
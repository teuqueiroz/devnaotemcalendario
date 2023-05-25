interface event{
    fun OnSucess()

}

class Programa(){
    fun salvar(e: event){
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas !")
        e.OnSucess()
    }

}
class evento : event {
    override fun OnSucess() {
        println("Com sucesso !")
    }
}

fun main(){
    val p = Programa()
    val e = evento()
    p.salvar(e)

}
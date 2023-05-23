fun main(){
    var f: foto = foto()
    f.visualizar()
    f.curtir()
    f.curtir()
    f.MetaDados()
    var v: video = video()
    v.visualizar()
    v.curtir()
    v.curtir()
    v.MetaDados()


}

 abstract class post(){
     protected var qntCurtidas = 0
     protected var qntViwer = 0

    fun curtir(){
        println("Curtido !!")
        qntCurtidas++
    }

    fun visualizar(){
        println("Visualizado !!")
        qntViwer++
    }

    abstract fun MetaDados()
 }

class foto() : post() {

    override fun MetaDados() {
        println("A quantidade de curtidas foi de $qntCurtidas")
    }
}

class video() : post() {

    override fun MetaDados() {
        println("A quantidade de viwer foi de $qntViwer")
    }

}
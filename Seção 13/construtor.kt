    /*
     * Um construtor é um método chamado no momento que uma classe é instanciada.
     * É muito comum que no construtor haja a atribuição de valores para os atributos da classe.
     *
     * Nesse exemplo existe um construtor primário e dois secundários.
     * Existem alguns detalhes nos contrutores secundários que devem ser observados.
     * 1. Atributos não podem ser val nem var, devem somente ter o nome do atributo e o tipo.
     * 2. Não podem ser acessados dentro ou fora da classe.
     * Se existe algum valor a mais no construtor secundário, variável dentro da classe deve ser declarada.
     */
    // This é usado para se referir ao atributos e metodos da classe dentro do escopo da própria classe.

class Pessoa (val anoNascimento: Int, val nome: String){
    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String): this(anoNascimento, nome){
        this.doc = doc // Utilizo o "This" para se referir ao primeiro doc e uso essa linha para instanciar dessa forma.
    }


    fun dormir(){

    }

    fun acordar(){


    }
}


fun main() {
    var pessoa: Pessoa = Pessoa(2000, "francisco", "20213123")
    var pessoa2: Pessoa = Pessoa(2000, "chico")
}
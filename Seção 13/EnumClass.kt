enum class Prioridades1 {
    baixa, media, alta    // Limita a esses 3 tipos apenas
}


// Posso fazer com que ela assuma outros valores
enum class Prioridades2(val assuma: Int) {
    baixa(1), media(5), alta(15)
}

// Também posso fazer um override
enum class Prioridades3 {
    Baixa,
    Media {
        override fun toString(): String {
            return "Retorno o que quiser aqui" // Sobescreve no println da linha 28
        }
    },
    Alta
}

fun main() {
    println(Prioridades1.alta)
        for (p in Prioridades1.values()){
            if (p == Prioridades1.alta) {
            println("Prioridade EXTREMA")}
        }
    println(Prioridades3.Media)
}
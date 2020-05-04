import modelo.Endereco

fun main() {

    // no kotlin, todas as classes extends ANY == porque o kotlin atende qquer tipo de TIPO,
    // a gente pode chamar todas as implementacoes da funcao println() abaixo.
    println()
    println(1)
    println(1.0)
    println(true)
    println("teste")

    // sobrecarga implicita
    val endereco = Endereco(logradouro = "")

    // existe impressao objetos
    println(endereco)

    imprime()
    imprimeInt(1)
    imprimeTrue(1.0)

}

// sobrecarga = diferentes implementacoes para uma mesma assinatura
fun imprime() {}

fun imprimeInt(int: Int) {}

fun imprimeTrue(double: Double) {}
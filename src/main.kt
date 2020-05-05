import modelo.Endereco

// no kotlin, qdo trabalharmos com TIPOS PRIMITIVOS, eles sempre serao CLASSES
// tudo que trabalhar no kotlin é um objeto

fun main() {
    // sobrecarga implicita
    val endereco = Endereco(logradouro = "")

    // existe impressao objetos

    imprime(1)
    imprime(1.0)
    imprime(endereco)

}

// sobrecarga = diferentes implementacoes para uma mesma assinatura
fun imprime(valor: Any) {
    println(valor)
}
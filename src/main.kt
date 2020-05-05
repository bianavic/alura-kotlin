import modelo.Endereco
import javax.print.attribute.IntegerSyntax

// no kotlin, qdo trabalharmos com TIPOS PRIMITIVOS, eles sempre serao CLASSES
// tudo que trabalhar no kotlin é um objeto

fun main() {
    // sobrecarga implicita
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 100,
        cep = "00000"
    )

    // EQUALS == para ele o que importa é a referencia do objeto e nao a informacao que contem
    println(endereco.equals(enderecoNovo)) // FALSE
    println(endereco.equals(endereco)) // TRUE

    // HASHCODE IDENTIFICACAO do objeto
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    // TO STRING = retorna REPRESENTACAO do objeto
    println(endereco.toString())
    println(enderecoNovo.toString())

    // outra forma de imprimir em String observe que é na linguem java.
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")


}

// sobrecarga = diferentes implementacoes para uma mesma assinatura
fun imprime(valor: Any) {
    println(valor)
}
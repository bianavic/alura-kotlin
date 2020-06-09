import modelo.Endereco

fun main() {

    // ao trabalhar com objeto precisa criar uma variavel, a  nao ser que vc crie um metodo
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)


    // HOF: nao é necessario criar a variavel
    // HOF: sem retorno
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let {
        endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }

    // HOF: com retorno EXPLICITO
    // o tipo funcao sempre retorna algo, Generics, mas podemos alterar conforme a funcao
    val enderecoEmMaiusculo = Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let {
                endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }
    println(enderecoEmMaiusculo)

    // HOF: podemos utilizar o RETORNO de outra forma, mudando para outro LET
    // sao ESCOPOS DE FUNCOES onde cada uma faz sua responsabilidade
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let {
                endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let {
                enderecoEmMaiusculo -> println(enderecoEmMaiusculo)
        }

    // HOF com RETORNO mais enxuto
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let {
                endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let (::println)

    // LISTA
    listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty()}

}
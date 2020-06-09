import modelo.Autenticavel
import modelo.Endereco
import modelo.SistemaInterno

fun main() {

    // criar um autenticavel
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

    println("-----------------------------------------------------------")

    // SCOPE FUNCTIONS == precisamos nos atentar ao RETORNO que desejamos com essas funcoes
    // ex: toUpperCase()
    // Lambda (IT) com retorno da lambda
    // [let, run, with]
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    println("-----------------------------------------------------------")

    // Receiver (THIS) com retorno do objeto de contexto.
    // ao inves de devolver o objeto de contexto ele devolveu o THIS,
    // por isso nao printou o retorno COM letras maiusculas
    // [apply, also]
//    Endereco(logradouro = "rua vergueiro", numero = 3185)
//        .apply {
//            "$logradouro, $numero".toUpperCase()
//        }.let(::println)


    // CORRECAO do retorno para letra maiuscula
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoMaiusculo: String ->
            println(enderecoMaiusculo)
        }


}
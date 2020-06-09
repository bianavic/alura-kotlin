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

    println("----------------------IT-------------------------------------")

    // SCOPE FUNCTIONS == precisamos nos atentar ao RETORNO que desejamos com essas funcoes
    // ex: toUpperCase()
    // Lambda (IT) com retorno da lambda
    // [let, run, with]
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    println("-------------------------THIS----------------------------------")

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

    // aplique essas atribuicoes/configuracoes para este objeto"
    println("-------------------------APPLY----------------------------------")

    val enderecoApply = Endereco()
        .apply {
        logradouro = "rua vergueiro"
        numero = 3185
    }

    println(enderecoApply)

    // "COM este objeto, faca X)
    println("-------------------------WITH----------------------------------")

    // obs: WITH nao é uma extensao, por isso esta sem o ponto [.],
    // por isso enviamos o objeto como um argumento

    val enderecoWith = Endereco(logradouro = "rua vergueiro", numero = 3185)

    with(enderecoWith) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoMaiusculo: String ->
        println(enderecoMaiusculo)
    }


    with(enderecoWith) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoMaiusculo: String ->
        println(enderecoMaiusculo)
    }



    println("-------------------------RUN----------------------------------")
    // RUN se comporta como o LET ou como uma uma extensao
    run { println("execucao do RUN sem extensao") }


    // "e ALSO faz o seguinte com o objeto)
    // exe de uso, casos de LOG
    println("-------------------------ALSO----------------------------------")
    // tendo ou nao ALSO no codigo ele nao interfere na logica geral do resultado
    val enderecoAlso = Endereco()
        .also { println("Criando endereco com ALSO") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

}
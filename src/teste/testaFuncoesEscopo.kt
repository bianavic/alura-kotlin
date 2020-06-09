package teste

import modelo.Endereco

fun testaFuncoesEscopo() {

    println("----------------------LET-------------------------------------")

    println("------------IT--------------")
    // SCOPE FUNCTIONS == precisamos nos atentar ao RETORNO que desejamos com essas funcoes
    // ex: toUpperCase()
    // Lambda (IT) com retorno da lambda
    // [let, run, with]
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    println("------------THIS--------------")
    // CORRECAO do retorno para letra maiuscula
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoMaiusculo: String ->
            println(enderecoMaiusculo)
        }

    // é um RECEIVER
    // aplique essas atribuicoes/configuracoes para este objeto"
    println("-------------------------APPLY----------------------------------")

    // Receiver (THIS) com retorno do objeto de contexto.
    // ao inves de devolver o objeto de contexto ele devolveu o THIS,
    // por isso nao printou o retorno COM letras maiusculas
    // [apply, also]
//    Endereco(logradouro = "rua vergueiro", numero = 3185)
//        .apply {
//            "$logradouro, $numero".toUpperCase()
//        }.let(::println)

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
    // agrupamento de chamadas de funcao em 1 objeto

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
    // RUN se comporta como o LET ou como uma uma extensao.
    // retorna lambda mas o contexto é THIS
    // ou retorna o lambda sem cotexto e sem extensao)
    run { println("execucao do RUN sem extensao") }


    // É um ARGUMENTO
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
    println(enderecoAlso)


    // para verificar o estado do objeto. se o estado for apropriado (takeIf: CONDICAO TRUE), retorna objeto,
    // se for objeto nulo, o estado nao é apropriado (takeUnless: CONDICAO FALSE)
    println("-------------------------TAKE IF & TAKE UNLESS----------------------------------")
    val number = 3

    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it %2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")
}
package teste

import modelo.Cliente
import modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal: $taxaMensal")


    // o LET sempre devolve um valor para a gente
    // o exe quer ter acesso à conta poupanca
    Cliente(nome = "Joao", cpf = "111.111.111-11", senha = 1234)
        .let { clienteNovo: Cliente ->
            ContaPoupanca(clienteNovo, 1000)
        }.run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let(::println)

        // opcao print 2
        .let { rendimentoMensal ->
            println(rendimentoMensal)
        }

    // pegar rendimento anual
    val contaPoupanca = ContaPoupanca(Cliente(nome = "Joao", cpf = "111.111.111-11", senha = 1234), numero = 200)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("simulacao rendimento anual $rendimentoAnual")

}
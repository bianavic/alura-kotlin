package teste

import modelo.*

fun testaContasDiferentes() {
    // usando HERANCA, POLIMORFISMO e SOBRESCRITA

    val contaCorrente = ContaCorrente(Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 4,
        endereco = Endereco(
            logradouro = "Rua Vergueiro"
        )
    ), numero = 1000)

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereco do titular ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Fran", cpf = "", senha = 5), numero = 1001)
    val contaSalario = ContaSalario(Cliente(nome = "Marco", cpf = "", senha = 6), numero = 3000)

}
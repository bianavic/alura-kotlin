package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca
import modelo.ContaSalario

fun testaContasDiferentes() {
    // usando HERANCA, POLIMORFISMO e SOBRESCRITA

    val contaCorrente = ContaCorrente(titular = "gui", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "fran", numero = 1001)
    val contaSalario = ContaSalario(titular = "Marcos", numero = 3000)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupanca após saque: ${contaPoupanca.saldo}")
    println("saldo após saque salário: ${contaSalario.saldo}")

    // polimorfismo com funcao transfere
    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferencia: ${contaCorrente.saldo}")
    println("saldo poupanca após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(300.0, contaCorrente)
    println("saldo poupanca após transferencia para corrente: ${contaCorrente.saldo}")
    println("saldo corrente após receber transferencia da poupanca: ${contaPoupanca.saldo}")

//    contaSalario.transfere(200, contaCorrente)
//    contaSalario.transfere(200, contaPoupanca)

}
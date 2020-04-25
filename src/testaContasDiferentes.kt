fun testaContasDiferentes() {
    // usando HERANCA, POLIMORFISMO e SOBRESCRITA

    val contaCorrente = ContaCorrente(titular = "gui", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "fran", numero = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupanca após saque: ${contaPoupanca.saldo}")

//    // polimorfismo com funcao transfere
//    contaCorrente.transfere(100.0, contaPoupanca)
//    println("saldo corrente após transferencia: ${contaCorrente.saldo}")
//    println("saldo poupanca após receber transferencia: ${contaPoupanca.saldo}")
//
//    contaPoupanca.transfere(300.0, contaCorrente)
//    println("saldo poupanca após transferencia para corrente: ${contaCorrente.saldo}")
//    println("saldo corrente após receber transferencia da poupanca: ${contaPoupanca.saldo}")
}
fun testaComportamentosContas() {
    val contaGui = ContaCorrente(titular = "gui", numero = 1000)
    contaGui.deposita(200.0)

    val contaFran = ContaPoupanca(titular = "fran", numero = 1001)
    contaFran.deposita(300.0)
}
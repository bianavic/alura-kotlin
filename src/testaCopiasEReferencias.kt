fun testaCopiasEReferencias() {
    val contaJose = ContaCorrente(titular = "gui", numero = 1000)
    contaJose.titular = "Jose"

    val contaMaria = ContaPoupanca(titular = "fran", numero = 1001)
    contaMaria.titular = "Maria"
}
class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun deposita(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        TODO("Not yet implemented")
    }
}

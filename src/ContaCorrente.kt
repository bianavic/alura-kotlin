class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun deposita(valor: Double) {
        TODO("Not yet implemented")
    }

    // uso da heranca com a sobreescrita
    override fun saca(valor: Double ) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        TODO("Not yet implemented")
    }

}
class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    // uso da heranca com a sobreescrita
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saca(valorComTaxa)
    }
}
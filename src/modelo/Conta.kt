package modelo

// property global
var totalContas = 0
private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    var total = 0 // cada membro que criamos é exclusivo da instancia/objeto,
    // por isso nao conseguimos armazenar valores entre as classes

    // similar comportamento construtor secundario
    init {
        println("criando conta")
        totalContas++ // variavel global, que todo mundo pode alterar
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    open fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
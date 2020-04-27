package modelo

import modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
    private set // garante q a property só sera modificada para quem esta interno

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}
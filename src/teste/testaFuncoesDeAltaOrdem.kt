package teste

import modelo.Autenticavel
import modelo.SistemaInterno

fun testaFuncoesDeAltaOrdem() {

    // criar um autenticavel
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}

package teste

import modelo.Autenticavel
import modelo.SistemaInterno

fun testaFuncoesDeAltaOrdem() {

    // resultados com diferentes implementacoes
    soma(1, 5, resultado = { valor ->
        println(valor)
    })

    somaReceiver1(1, 5, resultado = {
        println(this)
    })

    somaReceiver2(3, 6, resultado = {
        println(this)
    })

    // criar um autenticavel
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    // modo 1
//    SistemaInterno().entra(autenticavel, 1234, autenticado = {
//        println("realizar pagamento")
//    })

    // modo 2
    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

// implementamos como uma extensao
fun somaReceiver1(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

fun somaReceiver2(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}

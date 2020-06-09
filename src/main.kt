import modelo.Autenticavel
import modelo.Endereco
import modelo.SistemaInterno

fun main() {

    // criar um autenticavel
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

    // SCOPE FUNCTIONS
    // com lambda (IT)
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    // com receiver (THIS)
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .apply {
            "$logradouro, $numero".toUpperCase()
        }.let(::println)

}
import modelo.Endereco
import teste.testaRun

fun main() {

    testaRun()
}

private fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "V Mariana"
        cidade = "Sao Paulo"
        estado = "SP"
        cep = "02310-001"
        complemento = "apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
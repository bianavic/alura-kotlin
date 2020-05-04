package modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    // o parametro do construtor ja tera uma instancia do endereco
    private val senha: Int
): Autenticavel { // se nao tiver construtor (), é interface

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}
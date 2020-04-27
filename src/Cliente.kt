class Cliente (
    val nome: String,
    val cpf: String,
    val senha: Int
): Autenticavel { // se nao tiver construtor (), é interface
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
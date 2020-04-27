class Cliente (
    val nome: String,
    val cpf: String,
    override val senha: Int
): Autenticavel { // se nao tiver construtor (), é interface

}
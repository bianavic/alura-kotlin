interface Autenticavel {

    // ao implementar INTERFACE terei que indicar uma PROPERTY e que ela sempre sera PUBLICA,
    // mas no caso de SENHAS precisamos proteger a informacao sensivel (senha)
    // implementar property ABSTRATA para garantir que quem implemente essa interface obtenha o valor
    val senha: Int

    // nao tem uso da implementacao, nao tem construto, apenas que faz uso da interface é obrigado a implementar
    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
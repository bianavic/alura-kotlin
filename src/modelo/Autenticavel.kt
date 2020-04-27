package modelo

interface Autenticavel {

    // nao tem uso da implementacao, nao tem construto, apenas que faz uso da interface é obrigado a implementar
    fun autentica(senha: Int): Boolean
}
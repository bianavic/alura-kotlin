package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao PagPay")
            autenticado()
        } else {
            println("Falha na autenticacao")
        }
    }
}
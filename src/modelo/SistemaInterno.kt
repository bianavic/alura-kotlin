package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao PagPay")
        } else {
            println("Falha na autenticacao")
        }
    }
}
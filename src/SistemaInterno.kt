class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao PagPay")
        } else {
            println("Falha na autenticacao")
        }
    }
}
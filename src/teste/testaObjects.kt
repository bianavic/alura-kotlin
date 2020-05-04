package teste

import modelo.*

public fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf = "111.111.111-11"
        val senha: Int = 10

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 10)
    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)


    println("total de contas ${Conta.total}")
}
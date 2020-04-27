
fun testaAutenticacao() {
    val gerente = Gerente(nome = "Alex", cpf = "111", salario = 1000.0, senha = 11)

    val diretora = Diretor(nome = "Maria", cpf = "222", salario = 2000.0, senha = 22, plr = 200)

    val cliente = Cliente(nome = "Marcos", cpf = "333", senha = 33)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 11)
    sistemaInterno.entra(diretora, 22)
    sistemaInterno.entra(cliente, 33)
}
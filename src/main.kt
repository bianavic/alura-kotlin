fun main() {
    println("Bem vindo ao pag&pay!")

    val maria = Funcionario(
        nome = "Maria",
        cpf = "444",
        salario = 1000.0
    )

    println("nome: ${maria.nome}")
    println("nome: ${maria.cpf}")
    println("nome: ${maria.salario}")
    println("bonificacao: ${maria.bonificacao()}")

    // criar gerente
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${fran.nome}")
    println("nome: ${fran.cpf}")
    println("nome: ${fran.salario}")
    println("bonificacao: ${fran.bonificacao()}")

    if (fran.autentica(12345)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticacao")
    }
}

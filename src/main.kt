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

}
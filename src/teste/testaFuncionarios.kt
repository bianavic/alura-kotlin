package teste

import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionarios() {
    val maria = Analista(
        nome = "Maria",
        cpf = "444",
        salario = 1000.0
    )

    println("nome: ${maria.nome}")
    println("nome: ${maria.cpf}")
    println("nome: ${maria.salario}")
    println("bonificacao: ${maria.bonificacao}")

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
    println("bonificacao: ${fran.bonificacao}")

    if (fran.autentica(12345)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticacao")
    }

    val gui: Diretor = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1234,
        plr = 200
    )

    println("nome: ${gui.nome}")
    println("nome: ${gui.cpf}")
    println("nome: ${gui.salario}")
    println("bonificacao: ${gui.bonificacao}")
    println("plr: ${gui.plr}")

    val jose = Analista(nome = "Jose", cpf = "444.444.444-44", salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(maria)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(jose)


    println("Total de bonificacao: ${calculadora.total}")
}
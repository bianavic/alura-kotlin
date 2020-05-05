import modelo.Endereco

// PILHA DE EXECUCAO | CALL STACK

// DEPURADOR | DEBUGGER

fun main() {
    println("Inicio main")

    // simulando uma exception do tipo ArithmeticException ao tentar dividir por zero
    10/0
    funcao1()
    println("Fim main")
}

fun funcao1() {
    println("Inicio funcao1")
    funcao2()
    println("Fim funcao1")
}

fun funcao2() {
    println("Inicio funcao2")
    for (i in 1..5) {
        println(i)

        // simulando uma exception do tipo ClassCastException
        // ao tentar converter uma classe de um tipo nao compativel
//        val endereco = Any()
//        endereco as Endereco
    }
    println("Fim funcao2")
}
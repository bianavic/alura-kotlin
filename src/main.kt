// PILHA DE EXECUCAO | CALL STACK

// DEPURADOR | DEBUGGER

fun main() {
    println("Inicio main")
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
    }
    println("Fim funcao2")
}
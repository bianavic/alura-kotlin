// opem: possibilidade para fazer heranca
open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    // criar metodo | retira a logica
        open val bonificacao: Double // transformou em PROPERTY que tem comportamento similar a uma funcao
        get() {
            return salario * 0.1
        }
}

// qdo precisar criar algo mais ESPECIFICO evite criar tipos, crie uma NOVA CLASSE
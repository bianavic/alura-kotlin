// opem: possibilidade para fazer heranca
open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
        open val bonificacao: Double
        get() {
            return salario * 0.1
        }
}
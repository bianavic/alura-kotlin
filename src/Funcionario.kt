// opem: possibilidade para fazer heranca
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    // assinatura da funcao/property
    abstract val bonificacao: Double
}
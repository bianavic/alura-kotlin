class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    // criar metodo
    fun bonificacao(): Double {
        return salario * 0.1
    }
}
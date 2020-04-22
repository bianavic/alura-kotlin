class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    // criar metodo | retira a logica
    fun bonificacao(): Double {
        return salario * 0.1
    }
}

// qdo precisar criar algo mais ESPECIFICO evite criar tipos, crie uma NOVA CLASSE

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){ // delegamos o valor para a mae/pai porque é ela que iniciara as properties

    fun bonificacao(): Double {
        return super.bonificacao + salario + plr
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
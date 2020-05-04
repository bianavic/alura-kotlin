package modelo

abstract class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel { // delegamos o valor para a mae/pai porque é ela que iniciara as properties

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    override fun autentica(senha: Int): Boolean {
        return autentica(senha)
    }
}
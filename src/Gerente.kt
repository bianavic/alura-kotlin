// HERANCA
// depois do construtor a gente usa a heranca, considere se a classe pai tem ou nao construtor
// vamos retirar as implementacoes pq a classe pai tem seu construtor. deixam de ser properties(informacoes)
// e se transformam em apenas parametros que recebemos durante o cosntrutor
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){ // delegamos o valor para a mae/pai porque é ela que iniciara as properties/informacoes

    // OVERRIDE | SOBRE ESCRITA: modificacao especifica para um comportamento que ja existe na classe mae
    // para reutilizar a assinatura temos que sobre escrever
    override val bonificacao: Double
        get() {
            return salario * 0.2
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
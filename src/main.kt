import modelo.Cliente
import modelo.Conta
import modelo.ContaPoupanca
import teste.testaContasDiferentes

// variavel global == evitar porque qquer um pode alterar
//var totalContas = 0

fun main() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)

    // testaAutenticacao()
    testaContasDiferentes()

    //println("total de contas ${contaPoupanca.total}")
    println("total de contas ${Conta.total}")

}
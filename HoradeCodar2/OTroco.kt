import kotlin.system.exitProcess

var saldo = 1000.0
var nome = String

fun main() {

    println("Qual o seu nome?")
    nome = String

    println("Olá $nome é um prazer ter você por aqui!")

    inicio()
}

fun inicio() {

    println("Escolha uma opção:")
    println("1 - Saldo")
    println("2 - Extrato")
    println("3 - Saque")
    println("4 - Depósito")
    println("5 - Transferência")
    println("6 - Sair")

    val escolha = readln().toIntOrNull()

    when (escolha) {
        1 -> validarSenha(1)
        2 -> validarSenha(2)
        3 -> validarSenha(3)
        4 -> fazerDeposito()
        5 -> validarSenha(5)
        6 -> sair()
        else -> erro()
    }
}

fun verSaldo() {

    println("Seu saldo atual é: $saldo")

    inicio()
}

fun extrato() {

    println("--- Extrato ---")
    println("Nike: R$ 300,00")
    println("Adidas: R$ 500,00")
    println("Mercado Livre: R$ 800,00")

    inicio()
}

fun validarSenha(opcao: Int) {

    var senha: Int

    println("Digite sua senha:")
    senha = readln().toInt()

    if (senha == 7981) {

        println("Senha correta")

        when (opcao) {
            1 -> verSaldo()
            2 -> extrato()
            3 -> fazerSaque()
            5 -> transferencia()
            else -> erro()
        }

    } else {

        println("Senha errada")
        validarSenha(opcao)
    }
}

fun fazerDeposito() {

    print("Qual o valor para depósito? ")

    val deposito = readLine()?.toDoubleOrNull()

    if (deposito == null) {

        println("Por favor, informe um número válido.")
        fazerDeposito()

    } else if (deposito <= 0) {

        println("Operação não autorizada")
        fazerDeposito()

    } else {

        saldo += deposito
        verSaldo()
    }
}

fun fazerSaque() {

    print("Qual o valor para saque? ")

    val saque = readLine()?.toDoubleOrNull()

    if (saque == null) {

        println("Por favor, informe um número válido.")
        fazerSaque()

    } else if (saque <= 0) {

        println("Operação não autorizada")
        fazerSaque()

    } else if (saque > saldo) {

        println("Operação não autorizada")
        fazerSaque()

    } else {

        saldo -= saque
        println("Saque realizado com sucesso")
        verSaldo()
    }
}

fun transferencia() {

    println("Digite o número da conta:")
    val conta = readln().toIntOrNull()

    if (conta == null) {

        println("Operação não autorizada")
        inicio()

    } else {

        println("Digite o valor da transferência:")
        val valor = readln().toDoubleOrNull()

        if (valor == null) {

            println("Por favor, informe um número válido.")

        } else if (valor <= 0) {

            println("Operação não autorizada")

        } else if (valor > saldo) {

            println("Operação não autorizada")

        } else {

            saldo -= valor
            println("Transferência realizada com sucesso")
        }

        inicio()
    }
}

fun erro() {

    println("Por favor, informe um número entre 1 a 6.")

    inicio()
}

fun sair() {

    print("Você deseja sair? (S/N)")

    val confirma = readln().uppercase()

    when (confirma) {
        "S" -> {
            println("$nome, foi um prazer ter você por aqui!")
            exitProcess(0)
        }

        "N" -> inicio()

        else -> sair()
    }
}
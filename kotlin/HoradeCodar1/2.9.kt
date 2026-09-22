// 2.9. Leia o ano de nascimento e informe se a pessoa pode votar no ano atual (sem considerar o mês).

fun main() {
    print("Digite seu nome: ")
    var nome = readlnOrNull()
    print("Digite o ano que você nasceu: ")
    var ano = readlnOrNull()?.toIntOrNull() ?: 0

    if (ano == null) {
        println("Por favor digite um ano válido!")
    }
    else {
        if (ano in 0..2008) {
            print("Seu nome é $nome, você nasceu em $ano e tem direito ao voto!")
        }
        if (ano >= 2009) {
            print("Seu nome é $nome, você nasceu em $ano e não tem direito ao voto!")
        }
    }
}
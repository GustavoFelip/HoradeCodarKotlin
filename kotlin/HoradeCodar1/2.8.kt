// 2.8. Leia 4 números, aceitando apenas valores maiores que 0 e menores que 10. Calcule a média e:

fun main() {

    var media = 0.0
    var soma = 0.0
    var contador = 0.0

    print("Digite um número: ")
    val n1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite outro número: ")
    val n2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite outro número: ")
    val n3 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite outro número: ")
    val n4 = readlnOrNull()?.toDoubleOrNull() ?: 0.0


    if (n1 <= 10 && n1 > 0) {
        soma = soma + n1
        contador++
    }
    if (n2 <= 10 && n2 > 0) {
        soma = soma + n2
        contador++
    }
    if (n3 <= 10 && n3 > 0) {
        soma = soma + n3
        contador++
    }
    if (n4 <= 10 && n4 > 0) {
        soma = soma + n4
        contador++
    }
    media = soma / contador

    if (media >= 5) {
        print("Sua média foi: $media, você passou no teste!")
    } else if (media < 4.9) {
        print("Sua médida foi: $media, você não passou no teste, tente novamente!")
    }
}
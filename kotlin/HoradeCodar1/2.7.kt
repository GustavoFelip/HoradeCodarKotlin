// 2.7. Leia 6 números. Some apenas os valores menores que 72. Exiba a soma e todos os valores informados.

fun main() {

    var total = 0.0

    print("Digite um número: ")
    val n1 = readlnOrNull()?.toDoubleOrNull()?:0.0
    print("Digite outro número: ")
    val n2 = readlnOrNull()?.toDoubleOrNull()?:0.0
    print("Digite outro número: ")
    val n3 = readlnOrNull()?.toDoubleOrNull()?:0.0
    print("Digite outro número: ")
    val n4 = readlnOrNull()?.toDoubleOrNull()?:0.0
    print("Digite outro número: ")
    val n5 = readlnOrNull()?.toDoubleOrNull()?:0.0
    print("Digite outro número: ")
    val n6 = readlnOrNull()?.toDoubleOrNull()?:0.0


    if (n1 < 72) {
        total = total + n1
    }
    if (n2 < 72) {
        total = total + n2
    }
    if (n3 < 72) {
        total = total + n3
    }
    if (n4 < 72) {
        total = total + n4
    }
    if (n5 < 72) {
        total = total + n5
    }
    if (n6 < 72) {
        total = total + n6


    }

    println("o primeiro número é $n1, o último número é $n4, ")

}
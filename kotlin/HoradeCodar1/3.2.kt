// 3.2. Leia dois valores. Enquanto o segundo valor for menor ou igual a zero, peça novamente esse mesmo valor. Ao final, mostre a divisão do primeiro pelo segundo.

fun main() {
    print("Digite um número: ")
    var n1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite outro número: ")
    var n2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    while (n2 <= 0.0) {
        print("Houve um erro, o segundo número não pode ser negativo ou 0. Digite outro número: ")
        n2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    }
    val total = n1 / n2
    print("A divisão entre os dois números é: $total")
}
// Leia 3 valores diferentes e mostre a soma dos 2 maiores.
fun main() {

    println("Digite um número: ")
    var num1 = readln().toDouble()
    println("Digite o segundo número: ")
    var num2 = readln().toDouble()
    println("Digite o terceiro número:")
    var num3 = readln().toDouble()
    var soma: Double

    if (num1 < num2 && num1 < num3) {
        soma = num2 + num3

    } else if (num1 < num2 && num3 < num1) {
        soma = num1 + num3
    } else {
        soma = num1 + num2

    }
    println(soma)
}
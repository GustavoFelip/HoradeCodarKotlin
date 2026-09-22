// 2.1. Leia dois números e mostre o maior deles.

fun main() {

    // Para o usuário declarar uma variavel do tipo inteiro, basta usar readln().toInt(), porem nao aceita numeros decimais, se quiser que aceita os dois, basta usar readln().toDouble()
    println("Digite um número: ")
    var num1 = readln().toDouble()

    println("Agora digite um segundo número: ")
    var num2 = readln().toDouble()

    if (num1 > num2) {
        println("O Maior número: $num1, menor: $num2")

    } else if (num1 < num2) {
        println("O Maior número: $num2, menor: $num1")

    }
      else
        println("Os dois números são iguais")
}


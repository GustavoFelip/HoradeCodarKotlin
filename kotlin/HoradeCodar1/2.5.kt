// 2.5. Leia 6 valores, exiba todos e calcule a média aritmética.

fun main(){

    // : Double == Definindo o tipo da váriavel
    var soma : Double

    println("Escreva o primeiro número: ")
    var num1 = readln().toDouble()
    println("Escreva o segundo número: ")
    var num2 = readln().toDouble()
    println("Escreva o terceiro número: ")
    var num3 = readln().toDouble()
    println("Escreva o quarto número: ")
    var num4 = readln().toDouble()
    println("Escreva o quinto número: ")
    var num5 = readln().toDouble()
    println("Escreva o sexto número: ")
    var num6 = readln().toDouble()

    // \n barra invertida == Serve para quebrar a linha
    println("Números definidos $num1 $num2 $num3 $num4 $num5 $num6 agora iremos dividi-lo por 6\n\nTOTAL: ")

    soma = (num1+num2*num3+num4*num5+num6)/6

    println("$soma")

}
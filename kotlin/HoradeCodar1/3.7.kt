// 3.7. Leia um valor N (N > 0) e imprima todos os inteiros de 1 até N.

fun main(){
    var contador = 0

    print("Digite um número: ")
    var n1 = readlnOrNull()?.toDoubleOrNull()?:0.0

    while(contador <= n1){
        println(contador)
        contador++
    }
}
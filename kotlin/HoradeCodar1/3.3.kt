// 3.3. Calcule e exiba a média aritmética dos números inteiros de 15 a 100 (inclusive).

fun main(){
    var contador = 15
    var soma = 0
    var media: Int = 0

    while (contador <= 100){
        println(contador)
        soma += contador
        contador += 1
    }
    media=soma/86
    println("media = $media")
}
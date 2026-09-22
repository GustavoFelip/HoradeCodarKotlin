// 3.6. Leia 6 notas válidas (de 0 a 10), calcule e exiba a média simples.

fun main(){
    var soma: Double = 0.0
    var contador = 0
    var media: Double = 0.0

    while(contador<6){
        print("Digite a nota: ")
        var nota = readlnOrNull()?.toDoubleOrNull()?:0.0


        while(nota < 0 || nota > 10){
            print("Essa nota não é valida! Digite outra nota: ")
            nota = readlnOrNull()?.toDoubleOrNull()?:0.0
        }
        soma+=nota
        contador++
    }
    media = soma/6
    print("A média é: $media")
}

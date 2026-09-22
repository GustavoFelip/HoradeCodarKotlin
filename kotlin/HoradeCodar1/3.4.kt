// 3.4. Leia dois inteiros (sendo o primeiro menor que o segundo) e calcule a média desses números e de todos os inteiros entre eles.

fun main(){
    print("Digite um nùmero: ")
    var n1 = readlnOrNull()?.toIntOrNull()?:0
    print("Digite outro número: ")
    var n2 = readlnOrNull()?.toIntOrNull()?:0

    var contador = n1
    var soma = 0
    var quantidade: Int = 0
    var media: Double = soma.toDouble()

    while(n2<=n1){
        print("Houve um erro, o primeiro número precisa ser menor que o segundo, digite outro número: ")
        n2 = readlnOrNull()?.toIntOrNull()?:0
    }
    while(contador<=n2){
        soma=soma+contador
        contador=contador+1
    }
    quantidade = n2-n1+1
    media = soma.toDouble()/quantidade
    println("A média entre os números é: $media")
}
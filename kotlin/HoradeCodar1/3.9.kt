// 3.9. Leia 10 valores e informe quantos estão no intervalo de 24 a 42 (inclusive) e quantos estão fora.

fun main(){
    var contador = 0
    var dentro = 0
    var fora = 0

    while(contador < 10 ){
        print("Digite um valor: ")
        var valor = readlnOrNull()?.toIntOrNull()?:0

        if (valor>=24 && valor<=42){
            dentro++
        }
        else{
            fora++
        }
        contador++
    }
    println("Números fora: $fora")
    println("Números dentro $dentro")
}
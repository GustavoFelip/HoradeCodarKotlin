// 3.1. Crie uma bomba-relógio com contagem regressiva de 30 até 0 e, ao final, escreva EXPLOSÃO.

fun main(){
    var contador=30

    while (contador>=0){
        println("A bomba irá explodir em $contador")
        contador=contador-1
    }
    println("EXPLOSÃO!!!BOOOOOOOOOOOOOM!!!")
}
// 2.6. Leia 4 valores diferentes e informe apenas o primeiro, o último e o maior deles.
fun main(){

    var maior : Double
    println("Digite o primeiro número: ")
    var n1 = readln().toDouble()
    println("Digite o segundo número: ")
    var n2 = readln().toDouble()
    println("Digite o terceiro número: ")
    var n3 = readln().toDouble()
    println("Digite o quarto número: ")
    var n4 = readln().toDouble()

    if (n1 > n2 && n1 > n3 && n1 > n4){
        maior = n1
    }else if (n2 > n1 && n2 > n3 && n2 > n4){
        maior = n2
    }else if(n3 > n1 && n3 > n2 && n3 > n4){
        maior = n3
    }else{
        maior = n4
    }

    println ("O Primeiro número é $n1 , o último número $n4, e o maior entre os números digitados é $maior ")



}
// 2.3. Leia 3 valores diferentes e mostre o maior.

fun main(){

println("Digite um numero: ")
var num1 = readln().toDouble()
println("Digite um segundo número: ")
var num2 = readln().toDouble()
println("Digite o terceiro número: ")
var num3 = readln().toDouble()

//&& → junta duas ou mais condições.
if(num1 > num2 && num1 > num3) {
    println("O maior número é o $num1")
}else if(num2 > num1 && num2 > num3) {
    println("O maior número é o $num2")
}else{
    println("O maior número é o $num3")

   }
  }
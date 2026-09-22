// 3.5. Leia 2 notas de um aluno, calcule a média final e considere aprovação com nota 9,5. Em seguida, pergunte: Calcular a média de outro aluno? (S/N). Se a resposta for S, repita; caso contrário, encerre e mostre a quantidade de alunos aprovados.

fun main() {
    var resposta = "S"
    var aluno1 = 0
    var aluno2 = 0
    while (resposta.equals("S", ignoreCase = true)){

        print("Digite a nota a primeira nota aluno: ")
        val n1 = readlnOrNull()?.toDoubleOrNull()?:0.0
        print("Digite a segunda nota aluno: ")
        val n2 = readlnOrNull()?.toDoubleOrNull()?:0.0

        val media = (n1+n2)/2

        println("A média é: $media")

        if(media>=9.5){
            println("Aluno aprovado!")
            aluno1++
        }
        else{
            println("Aluno reprovado!")
            aluno2++
        }
        print("Quer calcular a média de outro aluno? (S/N): ")
        resposta = readlnOrNull()?: "N"

        println("Alunos aprovados: $aluno1")
        println("Alunos reprovados: $aluno2")
    }
}

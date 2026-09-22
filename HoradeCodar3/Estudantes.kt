fun main(){

    val estudantes = mutableListOf<String>()
    var nome = ""

    //!= utilizamos para ver se algo é diferente de outro
    while (nome.uppercase() != "PARE") {

        println("Digite o nome do estudante:")
        nome = readln()


        if (nome.uppercase() != "PARE") {

            estudantes.add(nome)

        }
    }
    println("Quantidade de estudantes: ${estudantes.size}")
    println("Estudantes cadastrados: $estudantes")


}
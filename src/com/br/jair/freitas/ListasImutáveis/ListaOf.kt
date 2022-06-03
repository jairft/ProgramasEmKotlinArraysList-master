package com.br.jair.freitas.ListasImutáveis

fun main() {

    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val marcos = Funcionario("Marcos", 3600.0, "PJ")
    val maria = Funcionario("Anna", 2800.0, "CLT")

    val funcionarios = listOf(pedro, marcos, maria)
    funcionarios.forEach {
        println(it)
        println("~~~~~~~~~~~~~~~~~~~~")
    }
    println("--------------------")
    println(funcionarios.find { it.nome == "Anna" })
    println("~~~~~~~~~~~~~~~~~~~~")
    // Ordena a lista referênciando o salario do menor para o maior
    funcionarios.sortedBy { it.salario }.forEach {
        println(it)
    }
    println("~~~~~~~~~~~~~~~~~~~~")
    funcionarios.groupBy { it.tipoContratacao }.forEach {
        println(it)
    }
}

data class Funcionario( val nome : String, val salario: Double, val tipoContratacao: String) {

    override fun toString(): String =
        """
            Nome:        $nome
            Salário:     $salario
            Contratação: $tipoContratacao
        """.trimIndent()



}
package com.br.jair.freitas.ListasImutáveis

import kotlin.math.pow

fun main() {
    val salario = arrayListOf(1000.0, 3050.0, 800.0, 5500.0, 4100.0)

     salario.forEach { valor ->
         println(valor)
     }
    println("~~~~~~~~~~~~~~~~~~~~")
    // A função filter, filtra todos os valores e retorna os valores espeficiados
    val salarioMaior2500 = salario.filter { it > 2500.0 }

    salarioMaior2500.forEach {
        println(it)
    }
    println("~~~~~~~~~~~~~~~~~~~~")
    // A função count retorna a quantidade de valores especificados
    println("Salarios entre 2000 e 6000 mil: " + salario.count() {it in 2000.0..6000.0})
    println("~~~~~~~~~~~~~~~~~~~~")
    // A função find retorna um valor especificado, caso não ache o valor, ele retorna null
    println("Salario igual a 800: " + salario.find { it == 800.0 })
    println("Salario igual a 900: " + salario.find { it == 900.0 })
    println("~~~~~~~~~~~~~~~~~~~~")
    // A função any procura um valor espeficado, retornando um valor boolean
    println(salario.any { it == 1000.0 })
    println(salario.any { it == 2000.0 })
    println("~~~~~~~~~~~~~~~~~~~~")
    println("Maior salário da lista é: " + salario.maxOrNull())
    println("Menor salário da lista é: " + salario.minOrNull())
}
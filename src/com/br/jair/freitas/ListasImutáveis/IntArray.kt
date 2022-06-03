package com.br.jair.freitas.ListasImutáveis

fun main(){
    val lista = IntArray(5)
    lista[0] = 6
    lista[1] = 2
    lista[2] = 9
    lista[3] = 1
    lista[4] = 5

    for (valor in lista){
        println(valor)
    }
    println("---------------------")
    lista.forEach {
        println(it)
    }
    println("---------------------")
    for (valor in lista.indices){
        println(lista[valor])
    }
    println("---------------------")
    lista.sort()
    for (valor in lista){
        println(valor)
    }

}
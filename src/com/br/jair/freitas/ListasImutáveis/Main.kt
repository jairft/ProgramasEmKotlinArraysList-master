package com.br.jair.freitas.ListasImutáveis

fun main(){
    val p1: Pessoa = Pessoa("Jair freitas")
    val p2: Pessoa = Pessoa("Caleb Crispim", 19)

    println(p1.saudacao())
    println(p2.saudacao())


}
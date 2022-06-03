package com.br.jair.freitas.ListasImutáveis

class Pessoa(val nome: String) {
    var idade: Int? = null
    constructor(nome: String, idade: Int): this(nome){
        this.idade = idade
    }
    fun saudacao(){
        println("Olá, meu nome é $nome e minha idade é $idade anos")
    }
}
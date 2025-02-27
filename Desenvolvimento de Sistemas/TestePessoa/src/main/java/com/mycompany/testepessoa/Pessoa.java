package com.mycompany.testepessoa;

public class Pessoa {
    String nome;
    String idade;
    
    public void Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void definirNome(String valor){
        nome = valor;   
    }
    
    public void retornarNome() {
        System.out.println(nome);;
    }
    
    public void definirIdade(String valor) {
        idade = valor;
    }
    
    public void retornarIdade() {
        System.out.println(idade);;
    }
    
}

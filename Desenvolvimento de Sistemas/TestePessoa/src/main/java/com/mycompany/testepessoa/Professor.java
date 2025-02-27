package com.mycompany.testepessoa;

public class Professor extends Pessoa{
    String formacao;
    
    public void Professor(String formacao) {
        this.formacao = formacao;
    }
    
    public void definirFormacao(String val_Formacao) {
        formacao = val_Formacao;
    }
    
    public void retornarFormacao() {
        System.out.println(formacao);
    }
}

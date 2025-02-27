package com.mycompany.testepessoa;

public class TestePessoa {

    public static void main(String[] args) {

        Professor prof = new Professor();
        
            prof.idade = "55";
            prof.nome = "Carlos";    
            prof.formacao = "Bacharel em Ciência da Computação";
            
            System.out.println("Nome: " + prof.nome + ", " + "idade: " + prof.idade + ", " + "formação: " + prof.formacao);
        
        Aluno alu = new Aluno();
            
                alu.nome = "Lucas";
                alu.idade = "17";
                alu.curso = "Desenvolvimento de Sistemas";
                
            System.out.println("Nome: " + alu.nome + ", " + "idade: " + alu.idade + ", " + "curso: " + alu.curso);
         
    }
}

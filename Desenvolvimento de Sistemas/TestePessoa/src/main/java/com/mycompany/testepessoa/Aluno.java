package com.mycompany.testepessoa;

public class Aluno extends Pessoa {
    String curso;
    
    public void Aluno() {
        this.curso = curso;
    }
    
    public void definirCurso(String val_Curso) {
        curso = val_Curso;
    }
    
    public void retornarCurso() {
        System.out.println(curso);
    }
}

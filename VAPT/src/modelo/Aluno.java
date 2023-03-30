/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Fatec
 */
public class Aluno{
    private int id_aluno;
    private int id_turma;
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    private String nome;

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public int getId_turma() {
        return id_turma;
    }

    public String getNome() {
        return nome;
    }
    
    
     
    
    

    

}

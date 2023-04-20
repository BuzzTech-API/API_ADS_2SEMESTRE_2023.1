/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

import dao.AlunoDao;

/**
 *
 * @author Fatec
 */
public class Aluno{
    private int id_aluno;
    private int id_turma;
    private Turma turma;
    private String nome;
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

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
    
    public void getIdBanco() {
        AlunoDao alunoDao = new AlunoDao();
        id_aluno = alunoDao.pesquisarPorNomeETurma(nome, id_turma);
        if (id_turma==0) {
            JOptionPane.showMessageDialog(null, "Aluno não cadastrada");
        }
    }
    
     
    
    

    

}

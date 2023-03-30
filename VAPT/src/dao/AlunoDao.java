/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Aluno;
/**
 *
 * @author Fatec
 */
public class AlunoDao {
    private Connection conexao;
    private PreparedStatement stmt;
  

    public AlunoDao() {
        this.conexao = new Conection().getConnection();
    }
    public void adicionar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, turma_id) VALUES (?, ?);";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2,aluno.getId_turma());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Aluno Cadastrado com Sucesso!");

        } catch (SQLException exception) {
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }
                 
  
}

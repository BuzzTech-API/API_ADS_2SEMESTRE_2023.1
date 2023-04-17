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
    private ResultSet rs;
    private ArrayList<Aluno> lista;

    public AlunoDao() {
        this.conexao = new Conection().getConnection();
        this.lista = new ArrayList<>();
    }
    public void adicionar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, Turma_id_turma) VALUES (?, ?);";
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
           
    public int pesquisarPorNomeETurma(String nome, int id_turma) {
        String sql = "SELECT * FROM aluno where nome = ? and Turma_id_turma = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, id_turma);
            rs = stmt.executeQuery();
            if (rs.next())
                return rs.getInt("id_aluno");
            
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return 0;
    }

    public ArrayList<Aluno> buscarTodasAlunoDaTurma(int id) {
        String sql = "SELECT * FROM aluno where Turma_id_turma = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno objAluno = new Aluno();
                objAluno.setId_aluno(rs.getInt("id_aluno"));
                objAluno.setNome(rs.getString("nome"));
                objAluno.setId_turma(rs.getInt("Turma_id_turma"));

                this.lista.add(objAluno);
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return this.lista;
    }
  
}

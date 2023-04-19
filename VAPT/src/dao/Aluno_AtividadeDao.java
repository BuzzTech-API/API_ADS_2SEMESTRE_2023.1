package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Aluno_Atividade;

public class Aluno_AtividadeDao {
    
    private Connection conexao;
    private PreparedStatement stmt;
  

    public Aluno_AtividadeDao() {
        this.conexao = new Conection().getConnection();
    }
    public void adicionar(Aluno_Atividade aluno_Atividade) {
        String sql = "INSERT INTO aluno_atividade (Aluno_id_aluno, Atividade_id_atividade, Aluno_Atividade_entrega, Aluno_Atividade_data_entrega) VALUES (?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, aluno_Atividade.getAluno_id_aluno());
            stmt.setInt(2,aluno_Atividade.getAtividade_id_atividade());
            stmt.setBoolean(3,aluno_Atividade.getAluno_Ativadade_entrega());
            stmt.setDate(4,aluno_Atividade.getAluno_Atividade_data_entrega());
            stmt.execute();
            stmt.close();
            //JOptionPane.showMessageDialog(null,"Aluno_Atividade Cadastrado com Sucesso!");

        } catch (SQLException exception) {
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }
    
    public void atualizar(Aluno_Atividade aluno_Atividade){
        
        String sql = "UPDATE aluno_atividade SET Aluno_Atividade_entrega = ?, Aluno_Atividade_data_entrega = ? "+
        "WHERE Aluno_id_aluno = ?, Atividade_id_atividade = ?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            //Criar a conexão
            conn = new Conection().getConnection();
            
            //Executar a query
            stmt = conn.prepareStatement(sql);
            
            //Adicionar os valores para atualizar
            stmt.setBoolean(1, aluno_Atividade.getAluno_Ativadade_entrega());
            stmt.setDate(2, aluno_Atividade.getAluno_Atividade_data_entrega());
            //Qual o id do registro
            stmt.setInt(3, aluno_Atividade.getAluno_id_aluno());
            stmt.setInt(4, aluno_Atividade.getAtividade_id_atividade());
            
            //Executar a query
            stmt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        try{
            if(stmt!=null){
                stmt.close();
            }if(conn!=null){
                conn.close();
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
        
    }





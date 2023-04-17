package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Aluno;
import modelo.Aluno_Atividade;
import modelo.Atividades;

public class Aluno_AtividadeDao {
    
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Aluno_Atividade> lista;
  

    public Aluno_AtividadeDao() {
        this.conexao = new Conection().getConnection();
        this.lista = new ArrayList<>();
    }
    public void adicionar(Aluno_Atividade aluno_Atividade) {
        String sql = "INSERT INTO aluno_atividade (Aluno_id_aluno, Atividade_id_atividade, Aluno_Atividade_entrega, Aluno_Atividade_data_entrega) VALUES (?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, aluno_Atividade.getAluno().getId_aluno());
            stmt.setInt(2,aluno_Atividade.getAtividade().getId_atividade());
            stmt.setBoolean(3,aluno_Atividade.getAluno_Ativadade_entrega());
            stmt.setDate(4,aluno_Atividade.getAluno_Atividade_data_entrega());
            stmt.execute();
            stmt.close();
            //JOptionPane.showMessageDialog(null,"Aluno_Atividade Cadastrado com Sucesso!");

        } catch (SQLException exception) {
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }

    public ArrayList<Aluno_Atividade> buscarAlunosDeUmaAtividade(int idAtividade) {
        String sql = "SELECT * FROM aluno_atividade JOIN aluno ON aluno.id_aluno = aluno_atividade.Aluno_id_aluno JOIN atividade ON atividade.id_atividade = aluno_atividade.Atividade_id_atividade WHERE Atividade_id_atividade = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAtividade);
            rs = stmt.executeQuery();
            while (rs.next()) {

                // Cria um objeto Aluno_Atividade para ser inserido na lista que será retornada
                Aluno_Atividade objAluno_Atividade = new Aluno_Atividade();


                // Cria um objeto aluno para colocar as informações do aluno que faz a atividade
                Aluno objAluno = new Aluno();
                objAluno.setId_aluno(rs.getInt("aluno.id_aluno"));
                objAluno.setNome(rs.getString("aluno.nome"));
                objAluno.setId_turma(rs.getInt("aluno.Turma_id_turma"));
                objAluno_Atividade.setAluno(objAluno);

                
                // Cria um objeto atividade para colocar as informações da atividade que aluno faz
                Atividades objAtividades = new Atividades();
                objAtividades.setId_atividade(rs.getInt("atividade.id_atividade"));
                objAtividades.setTipo(rs.getString("atividade.tipo"));
                objAtividades.setDescricao(rs.getString("atividade.descricao"));
                objAtividades.setData_inicio(rs.getDate("atividade.data_inicio"));
                objAtividades.setData_fim(rs.getDate("atividade.data_fim"));
                objAtividades.setTurma_id_turma(rs.getInt("atividade.Turma_id_turma"));
                objAluno_Atividade.setAtividade(objAtividades);

                // inseri no aluno_atividade se o aluno entregou a atividade e se entregou quando
                objAluno_Atividade.setAluno_Ativadade_entrega(rs.getBoolean("Aluno_Atividade_entrega"));
                objAluno_Atividade.setAluno_Atividade_data_entrega(rs.getDate("Aluno_Atividade_data_entrega"));
                this.lista.add(objAluno_Atividade);
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
        return this.lista;
        
    }

}

package dao;

import GUI.popup.PopupCadasrSucesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Atividades;


/**
 * <h1>Classe de modificação na tabela Atividades</h1>
 * <h2>Métodos</h2>
 * <ul>
 *      <li>adicionar()</li>
 * 
 * </ul>
 * 
 */

public class AtividadesDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Atividades> lista;

    public AtividadesDao() {
        this.conexao = new Conection().getConnection();
        lista = new ArrayList<>();
    }

    /** 
     * 
     * <p>Esse método recebe como parâmetro um Objeto da Classe Atividades que será inserido no banco de dados</p>
    */
    public void adicionar(Atividades atividades) {
        String sql = "INSERT INTO atividade(tipo, descricao, data_inicio, data_fim, Turma_id_turma) VALUES(?, ?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, atividades.getTipo());
            stmt.setString(2, atividades.getDescricao());
            stmt.setDate(3, atividades.getData_inicio());
            stmt.setDate(4, atividades.getData_fim());
            stmt.setInt(5, atividades.getTurma_id_turma());
            stmt.execute();
            stmt.close();
            PopupCadasrSucesso popup = new PopupCadasrSucesso();
            popup.setVisible(true);

        } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }
    
    public ArrayList<Atividades> buscarTodasAtividadesDaTurma(int id) {
        String sql = "SELECT * FROM atividade where Turma_id_turma = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Atividades objAtividades = new Atividades();
                objAtividades.setId_atividade(rs.getInt("id_atividade"));
                objAtividades.setTipo(rs.getString("tipo"));
                objAtividades.setDescricao(rs.getString("descricao"));
                objAtividades.setData_inicio(rs.getDate("data_inicio"));
                objAtividades.setData_fim(rs.getDate("data_fim"));
                objAtividades.setTurma_id_turma(rs.getInt("Turma_id_turma"));

                this.lista.add(objAtividades);
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return this.lista;
    }

    public int pesquisarPorDadosDaAtividade(String tipo, String descricao, java.sql.Date data_inicio, java.sql.Date data_fim, int turma_id_turma) {
        String sql = "SELECT * FROM atividade WHERE tipo = ? AND descricao = ? AND data_inicio = ? AND data_fim = ? AND Turma_id_turma = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, tipo);
            stmt.setString(2, descricao);
            stmt.setDate(3, data_inicio);
            stmt.setDate(4, data_fim);
            stmt.setInt(5, turma_id_turma);
            rs = stmt.executeQuery();
            if (rs.next())
                return rs.getInt("id_atividade");
            
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return 0;
    }
    
    public ArrayList<Atividades> buscarTodasAtividades() {
        String sql = "SELECT * FROM atividade";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Atividades objAtividades = new Atividades();
                objAtividades.setId_atividade(rs.getInt("id_atividade"));
                objAtividades.setTipo(rs.getString("tipo"));
                objAtividades.setDescricao(rs.getString("descricao"));
                objAtividades.setData_inicio(rs.getDate("data_inicio"));
                objAtividades.setData_fim(rs.getDate("data_fim"));
                objAtividades.setTurma_id_turma(rs.getInt("Turma_id_turma"));

                this.lista.add(objAtividades);
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return this.lista;
    }

    public void deletarAtividade(int idAtividade) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse atividade é referenciado
        new Aluno_AtividadeDao().deletarAtividade(idAtividade);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM atividade WHERE id_atividade = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idAtividade
            stmt.setInt(1, idAtividade);


            // Executa e fecha o Statement
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        
    }



    public void deletarAtividadeTurma(int idTurma) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM atividade WHERE Turma_id_turma = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idTurma
            stmt.setInt(1, idTurma);


            // Executa e fecha o Statement
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        
    }

}

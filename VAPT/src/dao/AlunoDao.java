
package dao;
import GUI.popup.PopupCadasrSucesso;
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
            PopupCadasrSucesso popup = new PopupCadasrSucesso();
            popup.setVisible(true);

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
  























    public void deletarAluno(int idAluno) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        new Aluno_AtividadeDao().deletarAluno(idAluno);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM aluno WHERE id_aluno = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idAluno
            stmt.setInt(1, idAluno);


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






















    public void deletarAlunoTurma(int idTurma) {

                


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM aluno WHERE Turma_id_turma = ?";


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

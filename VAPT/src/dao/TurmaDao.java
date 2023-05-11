package dao;
import GUI.popup.PopupCadasrSucesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Turma;

/**
 * <h1>Classe de modificação na tabela Turma</h1>
 * <h2>Métodos</h2>
 * <ul>
 *      <li>adicionar()</li>
 * 
 * </ul>
 * 
 */

public class TurmaDao {





    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Turma> lista;









    public TurmaDao() {
        this.conexao = new Conection().getConnection();
        this.lista = new ArrayList<>();
    }










    /** 
     * 
     * <p>Esse método recebe como parâmetro um Objeto da Classe Turma que será inserido no banco de dados</p>
    */
    public void adicionar(Turma turma) {
        String sql = "INSERT INTO turma(nome, nome_escola) VALUES(?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, turma.getNome());
            stmt.setString(2, turma.getNome_escola());
            stmt.execute();
            stmt.close();
            PopupCadasrSucesso popup = new PopupCadasrSucesso();
            popup.setVisible(true);

         } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }
    public void alterar (Turma turma) {
        String sql = "`nome` = ?,\n" +
        "`nome_escola` = ?\n" +
        "WHERE `id_turma` = ?;\n";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, turma.getNome());
            stmt.setString(2, turma.getNome_escola());
            stmt.setInt(3, turma.getId_turma());
            stmt.execute();
            stmt.close();
            PopupCadasrSucesso popup = new PopupCadasrSucesso();
            popup.setVisible(true);

         } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }
    
    
















    // Pegar todas as turmas
    public ArrayList<Turma> getTurma(){
        String sql = "SELECT * FROM Turma";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        //Classe que vai recuperar os dados do banco ***SELECT***
        ResultSet rset = null;
        
        try{
            conn = new Conection().getConnection();
            
            stmt = conn.prepareStatement(sql);
            
            rset = stmt.executeQuery();
            
            while (rset.next()){
                Turma turma = new Turma();
                
                //Recuperar o id
                turma.setId_turma(rset.getInt("id_turma"));
                //Recuperar o nome
                turma.setNome(rset.getString("nome"));
                //Recuperar o nome da escola
                turma.setNome_escola(rset.getString("nome_escola"));
                
                this.lista.add(turma);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(rset!=null){
                rset.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if(conn!=null){
                conn.close();
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        }  
        return this.lista;
    }
    
















//    public ArrayList<Turma> pesquisar() {
//        String sql = "SELECT * FROM turma";
//        try {
//            this.conexao = new Conection().getConnection();
//            stmt = conexao.prepareStatement(sql);
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                Turma objTurma = new Turma();
//                objTurma.setId_turma(rs.getInt("id_turma"));
//                objTurma.setNome(rs.getString("nome"));
//                objTurma.setNome_escola(rs.getString("nome_escola"));
//
//                this.lista.add(objTurma);
//            }
//            
//        } catch (SQLException exception) {
//            // TODO: handle exception
//            throw new RuntimeException(exception);
//        }
//
//        return this.lista;
//    }
















    public int pesquisarPorNomeEEscola(String nome, String nomeEscola) {
        String sql = "SELECT * FROM turma where binary nome = ? and binary nome_escola = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, nomeEscola);
            rs = stmt.executeQuery();
            if (rs.next())
                return rs.getInt("id_turma");
            
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return 0;
    }














    public boolean jaExisteTurma(Turma turma) {
        String sql = "SELECT * FROM turma where binary nome = ? and binary nome_escola = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, turma.getNome());
            stmt.setString(2, turma.getNome_escola());
            rs = stmt.executeQuery();
            if (rs.next())
                return true;
            
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return false;
    }


















    public Turma buscarPorId(int id) {
        String sql = "SELECT * FROM turma where id_turma = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next())
            {
                Turma turma = new Turma();
                turma.setId_turma(id);
                turma.setNome(rs.getString("nome"));
                turma.setNome_escola(rs.getString("nome_escola"));
                return turma;
            }else
                return null;
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

    }
    

















    
    public ArrayList<Turma> buscarPorNome(String nome){
        String sql = "SELECT * FROM turma WHERE nome LIKE \"%"+nome+"%\"";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        //Classe que vai recuperar os dados do banco ***SELECT***
        ResultSet rset = null;
        
        try{
            conn = new Conection().getConnection();
            
            stmt = conn.prepareStatement(sql);


            
            rset = stmt.executeQuery();
            
            while (rset.next()){
                Turma turma = new Turma();
                
                //Recuperar o id
                turma.setId_turma(rset.getInt("id_turma"));
                //Recuperar o nome
                turma.setNome(rset.getString("nome"));
                //Recuperar o nome da escola
                turma.setNome_escola(rset.getString("nome_escola"));
                
                this.lista.add(turma);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(rset!=null){
                rset.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if(conn!=null){
                conn.close();
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    
        return this.lista;
    }


    public void deletarTurma(int idTurma) {

        new Aluno_AtividadeDao().deletarTurma(idTurma);
        new AlunoDao().deletarAlunoTurma(idTurma);
        new AtividadesDao().deletarAtividadeTurma(idTurma);
        new Dia_SemanaDao().deletarDia_semanaTurma(idTurma);        


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM turma WHERE id_turma = ?";


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

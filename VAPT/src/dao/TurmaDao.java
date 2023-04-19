package dao;
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
            JOptionPane.showMessageDialog(null,"Turma Cadastrada com Sucesso!");

         } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }

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

    


}

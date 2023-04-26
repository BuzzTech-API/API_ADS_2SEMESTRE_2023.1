package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Dia_Semana;


public class Dia_SemanaDao {
    
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;






    public Dia_SemanaDao() {
        this.conexao = new Conection().getConnection();
    }








    public void adicionar(Dia_Semana dia_Semana) {
        String sql = "INSERT INTO dia_semana(Turma_id_turma, dia, hora_inicio, hora_fim) VALUES(?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dia_Semana.getTurma_id_turma());
            stmt.setString(2, dia_Semana.getDia());
            stmt.setString(3, dia_Semana.getHora_inicio());
            stmt.setString(4, dia_Semana.getHora_fim());
            stmt.execute();
            stmt.close();
            //JOptionPane.showMessageDialog(null,"Dia_semana Cadastrada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }














    public int buscarTurmaDeAgora(String horaAtual, String dia) {
        String sql = "SELECT * FROM dia_semana WHERE hora_inicio <= ? and  hora_fim >= ? and dia = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, horaAtual);
            stmt.setString(2, horaAtual);
            stmt.setString(3, dia);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("Turma_id_turma");

                
            }
            return 0;
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        
    }















    public void deletarDia_semana(int idDia_semana) {



        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM dia-semana WHERE id_dia_semana = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idDia_semana
            stmt.setInt(1, idDia_semana);


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










    

    public void deletarDia_semanaTurma(int idTurma) {


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM dia_semana WHERE Turma_id_turma = ?";


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

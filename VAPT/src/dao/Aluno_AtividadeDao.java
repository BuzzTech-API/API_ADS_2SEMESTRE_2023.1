package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import java.util.Date;
import java.util.List;
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
            conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, aluno_Atividade.getAluno().getId_aluno());
            stmt.setInt(2,aluno_Atividade.getAtividade().getId_atividade());
            stmt.setBoolean(3,aluno_Atividade.getAluno_Ativadade_entrega());
            stmt.setDate(4,aluno_Atividade.getAluno_Atividade_data_entrega());
            stmt.execute();
            stmt.close();
            conexao.close();
            //JOptionPane.showMessageDialog(null,"Aluno_Atividade Cadastrado com Sucesso!");

        } catch (SQLException exception) {
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }
    















    public void atualizar(Aluno_Atividade aluno_Atividade){
        
        String sql = "UPDATE aluno_atividade SET Aluno_Atividade_entrega = ?, Aluno_Atividade_data_entrega = ? "+
        "WHERE Aluno_id_aluno = ? AND Atividade_id_atividade = ?";
        
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
            stmt.setInt(3, aluno_Atividade.getAluno().getId_aluno());
            stmt.setInt(4, aluno_Atividade.getAtividade().getId_atividade());
            
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
        }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
        













    public String pegarPorcentagemDeNaoEntreguesDaTurma(int id_turma) {
        String sql = "SELECT concat(Format(avg(CASE WHEN aluno_atividade.Atividade_id_atividade IN (SELECT id_atividade FROM atividade WHERE Turma_id_turma= ?) THEN aluno_atividade.Aluno_Atividade_entrega = false ELSE NULL END)*100 ,2),'%')  AS nao_entregou FROM aluno_atividade;";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            //Criar a conexão
            conn = new Conection().getConnection();
            
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_turma);
            
            //Executar a query
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("nao_entregou");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
        try{
            if(stmt!=null){
                stmt.close();
            }if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
                e.printStackTrace();
            }
        }
        

        return "";
    }

















    public String pegarPorcentagemDeEntreguesDaTurma(int idTurma) {
        String sql = "SELECT concat(Format(avg(CASE WHEN aluno_atividade.Atividade_id_atividade IN (SELECT id_atividade FROM atividade WHERE Turma_id_turma= ?) THEN atividade.data_fim < aluno_atividade.Aluno_Atividade_data_entrega ELSE NULL END)*100 ,2),'%') AS entregue_atrasados FROM aluno_atividade INNER JOIN atividade ON atividade.id_atividade = Atividade_id_atividade";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            //Criar a conexão
            conn = new Conection().getConnection();
            
            //Executar a query
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idTurma);
            
            
            //Executar a query
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("entregue_atrasados");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        try{
            if(stmt!=null){
                stmt.close();
            }if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
                e.printStackTrace();
            }
        }
        String retorno ="";

        return retorno;
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
        }finally{
        try{
            if(stmt!=null){
                stmt.close();
            }if(conexao!=null){
                conexao.close();
            }
        }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return this.lista;
        
    }
















    public ArrayList<Aluno_Atividade> buscarAtividadesDeUmAluno(int idAluno) {
        String sql = "SELECT * FROM aluno_atividade JOIN aluno ON aluno.id_aluno = aluno_atividade.Aluno_id_aluno JOIN atividade ON atividade.id_atividade = aluno_atividade.Atividade_id_atividade WHERE Aluno_id_aluno = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAluno);
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
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }if(conexao!=null){
                    conexao.close();
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        return this.lista;
        
    }











    public ArrayList<Aluno_Atividade> buscarAtividadesEntreguesAtrasadasDeUmAluno(int idAluno) {
        String sql = "SELECT * FROM aluno_atividade INNER JOIN atividade ON atividade.id_atividade = aluno_atividade.Atividade_id_atividade JOIN aluno ON aluno.id_aluno = aluno_atividade.Aluno_id_aluno  WHERE Aluno_id_aluno = ? and atividade.data_fim < aluno_atividade.Aluno_Atividade_data_entrega;";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAluno);
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
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }if(conexao!=null){
                    conexao.close();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
        return this.lista;
        
    }
    








    public List<Aluno> retornarAluno(Atividades atividade) throws SQLException{
        String sql = "select a.* from aluno as a\n" + "inner join aluno_atividade as aa\n" + "where aa.id_aluno = a.id\n" +"and aa.id_atividade = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,atividade.getId_atividade());
        ResultSet rs = stmt.executeQuery();
        stmt.close();
        List<Aluno> alunos = new ArrayList<>();
        while (rs.next()){
            Aluno a  = new Aluno();
            a.setId_aluno(rs.getInt("id_aluno"));
            a.setId_turma(rs.getInt("id_turma"));
            a.setNome(rs.getString("nome"));
            alunos.add(a);
        }
        return alunos;

    }   








    public void realizarEntrega (int id_atividade, int id_aluno) throws SQLException{
        String sql = "update aluno_atividade Aluno_Atividade_entregaAluno_Atividade_entrega\n" + "set Aluno_Atividade_entrega = 1,\n" + "Aluno_atividade_data_entrega = ?\n" + "where Aluno_id_aluno = ?\n" + "and Atividade_id_atividade = ?";
        stmt = conexao.prepareStatement(sql);
        Date date = new Date();
        stmt.setDate(1, new java.sql.Date(date.getTime()));
        stmt.setInt(2, id_aluno);
        stmt.setInt(3, id_atividade);
        stmt.execute();
        stmt.close();
        
    }









    
    public void deletarAluno(int idAluno) {
        String sql= "DELETE FROM aluno_atividade WHERE Aluno_id_aluno = ?";
        conexao = new Conection().getConnection();
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }if(conexao!=null){
                    conexao.close();
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        
    }












    public void deletarAtividade(int idAtividade) {
        String sql= "DELETE FROM aluno_atividade WHERE Atividade_id_atividade = ?";
        conexao = new Conection().getConnection();
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAtividade);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }if(conexao!=null){
                    conexao.close();
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        
    }










    public void deletarTurma(int idTurma) {
        String sql= "DELETE FROM aluno_atividade WHERE Aluno_id_aluno IN(SELECT id_aluno FROM aluno WHERE Turma_id_turma = ?) OR Atividade_id_atividade IN(SELECT id_atividade FROM atividade WHERE Turma_id_turma = ?)";
        conexao = new Conection().getConnection();
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idTurma);
            stmt.setInt(2, idTurma);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }if(conexao!=null){
                    conexao.close();
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }

        }
        
    }  

}


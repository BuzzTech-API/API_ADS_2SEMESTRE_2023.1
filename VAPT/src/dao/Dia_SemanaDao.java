package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexoes.Conection;
import java.util.ArrayList;
import modelo.Dia_Semana;

public class Dia_SemanaDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Dia_Semana> lista;

    public Dia_SemanaDao() {

    }

    public void adicionar(Dia_Semana dia_Semana) {
        this.conexao = new Conection().getConnection();
        String sql = "INSERT INTO dia_semana(Turma_id_turma, dia, hora_inicio, hora_fim) VALUES(?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dia_Semana.getTurma_id_turma());
            stmt.setString(2, dia_Semana.getDia());
            stmt.setString(3, dia_Semana.getHora_inicio());
            stmt.setString(4, dia_Semana.getHora_fim());
            stmt.execute();
            stmt.close();
            // JOptionPane.showMessageDialog(null,"Dia_semana Cadastrada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception

            JOptionPane.showMessageDialog(null, exception);
        } finally {

            try {
                // Verifica se o Statement está fechado se não tiver ele o fecha
                if (stmt != null) {
                    stmt.close();
                }
                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void alterar(Dia_Semana dia_Semana) {
        this.conexao = new Conection().getConnection();
        String sql = "UPDATE `vapt`.`dia_semana`\n" +
                "SET\n" +
                "`Turma_id_turma` = ?,\n" +
                "`dia` = ?,\n" +
                "`hora_inicio` =?,\n" +
                "`hora_fim` = ?\n" +
                "WHERE `id_dia` = ?;";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dia_Semana.getTurma_id_turma());
            stmt.setString(2, dia_Semana.getDia());
            stmt.setString(3, dia_Semana.getHora_inicio());
            stmt.setString(4, dia_Semana.getHora_fim());
            stmt.setInt(5, dia_Semana.getId_dia());
            stmt.execute();
            stmt.close();
            // JOptionPane.showMessageDialog(null,"Dia_semana Cadastrada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception

            JOptionPane.showMessageDialog(null, exception);
        } finally {

            try {
                // Verifica se o Statement está fechado se não tiver ele o fecha
                if (stmt != null) {
                    stmt.close();
                }
                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
        } finally {

            try {
                // Verifica se o Statement está fechado se não tiver ele o fecha
                if (stmt != null) {
                    stmt.close();
                }
                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deletarDia_semana(int idDia_semana) {

        // Cria a string que sera executado no banco de dados
        String sql = "DELETE FROM dia-semana WHERE id_dia_semana = ?";

        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {
            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);

            // Informa que aonde está o ponto de interrogação é para substituir pelo
            // idDia_semana
            stmt.setInt(1, idDia_semana);

            // Executa e fecha o Statement
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
                // Verifica se o Statement está fechado se não tiver ele o fecha
                if (stmt != null) {
                    stmt.close();
                }
                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deletarDia_semanaTurma(int idTurma) {

        // Cria a string que sera executado no banco de dados
        String sql = "DELETE FROM dia_semana WHERE Turma_id_turma = ?";

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
        } finally {

            try {

                // Verifica se o Statement está fechado se não tiver ele o fecha
                if (stmt != null) {
                    stmt.close();
                }

                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if (conexao != null) {
                    conexao.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public ArrayList<Dia_Semana> buscarDiasTurma(int id_turma) {

        lista = new ArrayList();
        String sql = "SELECT * FROM dia_semana WHERE Turma_id_turma = ?";

        Connection conn = null;
        PreparedStatement stmt = null;
        // Classe que vai recuperar os dados do banco ***SELECT***
        ResultSet rset = null;

        try {
            conn = new Conection().getConnection();

            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id_turma);

            rset = stmt.executeQuery();

            while (rset.next()) {
                Dia_Semana dia_semana = new Dia_Semana();

                // Recuperar o id do Dia
                dia_semana.setId_dia(rset.getInt("id_dia"));
                // Recuperar o id da Turma
                dia_semana.setTurma_id_turma(rset.getInt("Turma_id_turma"));
                // Recuperar o dia da semana
                dia_semana.setDia(rset.getString("dia"));
                // Recuperar hora do inicio
                dia_semana.setHora_inicio(rset.getString("hora_inicio"));
                // Recuperar hora do fim
                dia_semana.setHora_fim(rset.getString("hora_fim"));

                this.lista.add(dia_semana);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.lista;
    }

}

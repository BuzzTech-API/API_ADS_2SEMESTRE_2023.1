package conexoes;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import dao.AtividadesDao;
import modelo.Atividades;

public class TestaConexao {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = new Conection().getConnection();
        System.out.println("Conexão Aberta");
        AtividadesDao atividadesDao = new AtividadesDao();
        Atividades atividades = new Atividades();
        String dataString = "23/03/2023"; 
        String dataString1 = "23/05/2023"; 
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); 
        java.sql.Date data_inicio;
        java.sql.Date data_fim;
        try {
            data_inicio = new java.sql.Date(fmt.parse(dataString).getTime());
            data_fim = new java.sql.Date(fmt.parse(dataString1).getTime());
           
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        conexao.close();
    }
}

package conexoes;

import java.sql.Connection;
import java.sql.SQLException;

import dao.AtividadesDao;
import modelo.Atividades;

public class TestaConexao {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = new Conection().getConnection();
        System.out.println("Conexão Aberta");
        AtividadesDao atividadesDao = new AtividadesDao();
        atividadesDao.adicionar(new Atividades());
        conexao.close();
    }
}

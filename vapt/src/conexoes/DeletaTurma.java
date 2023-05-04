/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexoes;

import dao.TurmaDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import dao.AtividadesDao;
import dao.TurmaDao;
import modelo.Atividades;
import modelo.Turma;

public class DeletaTurma {
    public static void main(String[] args) throws SQLException {
        Connection conexao = new Conection().getConnection();
        System.out.println("Conexão Aberta");

        TurmaDao turmadao = new TurmaDao();
        turmadao.deletarTurma(1);   
    }
}
   

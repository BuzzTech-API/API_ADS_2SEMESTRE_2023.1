/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.componentes;

import java.util.ArrayList;

import GUI.swing.CheckBoxCustom;
import GUI.telasInternas.AtividadeDadosAluno;
import dao.Aluno_AtividadeDao;
import dao.TurmaDao;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import modelo.Aluno_Atividade;
import modelo.Aluno;
import modelo.Atividades;
import modelo.Turma;

/**
 *
 * @author isaqu
 */
public class AtividadesPedentes extends javax.swing.JPanel {

    private int id;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public AtividadesPedentes() {
        initComponents();
        setOpaque(false);
        
    }
    JDesktopPane jDesktopPane;
    
    private ArrayList<Aluno> listaAluno;
    public AtividadesPedentes(int id, JDesktopPane jDesktopPane) {
        this.id = id;
        TurmaDao turmaDao = new TurmaDao();
        Turma turma = turmaDao.buscarPorId(id);
        turma.buscarAtividades();
        listaAluno = turma.getAlunosDaTurma();
        initComponents();
        setOpaque(false);
        preencherPanel();
        this.jDesktopPane=jDesktopPane;
        
        
        
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 31, 54));
        jLabel1.setText("Atividades Pendentes:");

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void preencherPanel() {
        TurmaDao turmaDao = new TurmaDao();
        Turma turma = turmaDao.buscarPorId(id);
        turma.buscarAtividades();
        ArrayList<Aluno> listaAluno = turma.getAlunosDaTurma();
        for (Aluno aluno : listaAluno) {
            CheckBoxContainer checkBoxContainer = new CheckBoxContainer(aluno);
            checkBoxContainer.getjLabel1().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jDesktopPane.removeAll();
                    jDesktopPane.add(new AtividadeDadosAluno(aluno)).setVisible(true);
                }
                
            });
            jLayeredPane1.add(checkBoxContainer);
        }
        String atividadesNumeros = jLabel1.getText();
        for (int i = atividadesNumeros.length(); i < 36; i++) {
            atividadesNumeros+=" ";
        }
        for (int i = 1; i <= turma.getAtividadesDaTurma().size(); i++) {
            atividadesNumeros+=i+"  ";
        }
        jLabel1.setText(atividadesNumeros);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}

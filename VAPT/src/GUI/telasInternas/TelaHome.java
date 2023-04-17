/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.card.CardAtividadesAlunosDevendo;
import GUI.card.CardDeTurma;
import GUI.swing.ScrollBarCustom;
import dao.AtividadesDao;
import dao.Dia_SemanaDao;
import dao.TurmaDao;
import modelo.Atividades;
import modelo.Turma;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Fatec
 */
public class TelaHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaHome
     */

    private Turma turma = new Turma();
    
    private int novoGapConteiner=259;
    private int componentPref = 259;
    public TelaHome() {
        pegarTurmaDeAgora();
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);
        if (turma.getId_turma()!=0) {
            preencherTela();
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 217));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1018, 639));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(911, 482));

        jLayeredPane1.setBackground(new java.awt.Color(217, 217, 217));
        jLayeredPane1.setName(""); // NOI18N
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(165,  482));
        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 4, 55, 40));
        jScrollPane1.setViewportView(jLayeredPane1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 131, 84));
        jLabel1.setText("Turma: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schoolred.png"))); // NOI18N
        jLabel2.setText("Escola:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(270, 270, 270))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, componentPref, Short.MAX_VALUE)
                .addContainerGap(novoGapConteiner, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void pegarTurmaDeAgora() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        int horaAgora =calendario.get(Calendar.HOUR_OF_DAY);
        dia =6;
        horaAgora=7;
        Dia_SemanaDao dia_SemanaDao = new Dia_SemanaDao();
        int turmaId = 0;
        switch (dia) {
            case 2:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Segunda");
                break;
        
            case 3:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Terça");
                break;
        
            case 4:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Quarta");
                break;
        
            case 5:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Quinta");
                break;
        
            case 6:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Sexta");
                break;
        
            default:
                break;
        }
        if (turmaId!=0) {
            TurmaDao turmaDao = new TurmaDao();
            turma = turmaDao.buscarPorId(turmaId);
        
        turma.buscarAtividades();
        
        if(turma.getAtividadesDaTurma().size()>4){
            novoGapConteiner=30;
            componentPref = 482;
        }
        }
    }
    
    public void preencherTela() {
        jLabel1.setText(jLabel1.getText()+turma.getNome());
        jLabel2.setText(jLabel2.getText()+turma.getNome_escola());
        ArrayList<Atividades> listaAtividades = turma.getAtividadesDaTurma();
        if(listaAtividades.size()<=4){
            jLayeredPane1.setPreferredSize(new Dimension(WIDTH, 276));
        }
        for (int i = 0; i < listaAtividades.size(); i++) {
            Atividades atividade = listaAtividades.get(i);
            CardAtividadesAlunosDevendo card = new CardAtividadesAlunosDevendo(atividade, i+1);
            jLayeredPane1.add(card);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

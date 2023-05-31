/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import java.util.ArrayList;

import javax.swing.JDesktopPane;

import dao.AlunoDao;
import dao.TurmaDao;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Aluno;
import modelo.Turma;

/**
 *
 * @author Lima
 */
public class BuscarAlunoParaEdicao extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarAlunoParaEdicao
     */
    private ArrayList<Turma> lista;
    private ArrayList<Aluno> listaAluno;
    private Aluno aluno;
    private Turma turma;
    javax.swing.JDesktopPane jDesktopPanel;
    
    public BuscarAlunoParaEdicao(JDesktopPane jDesktopPanel) {
        this.jDesktopPanel = jDesktopPanel;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        initComponents();
        preecherComboBoxTurma();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    public void prencherComboBox2(Turma turma) {
        
        this.aluno = new Aluno();
        jComboBox2.removeAllItems();
        int idTurma = turma.getId_turma();
        AlunoDao alunoDao = new AlunoDao();
        listaAluno = alunoDao.buscarTodasAlunoDaTurma(idTurma);
        if (!listaAluno.isEmpty()){
            this.aluno = listaAluno.get(0);
        }
        for (int i = 0; i < listaAluno.size(); i++) {
            Aluno aluno = listaAluno.get(i);
            jComboBox2.addItem("Aluno: "+ aluno.getNome()); 
        }
    }

    private void preecherComboBoxTurma() {
        TurmaDao turmaDao = new TurmaDao();
        lista = turmaDao.getTurma();
        if (!lista.isEmpty()){
            this.turma = lista.get(0);  
        }
        for (Turma turma : lista) {
            jComboBox1.addItem("Turma: "+ turma.getNome() + " - Escola: " + turma.getNome_escola());
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myButton1 = new GUI.swing.MyButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(246, 246, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(545, 232));
        jPanel1.setMinimumSize(new java.awt.Dimension(545, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(545, 232));

        myButton1.setBackground(new java.awt.Color(255, 255, 255));
        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(2, 30, 54));
        myButton1.setText("Buscar");
        myButton1.setBorderColor(new java.awt.Color(204, 204, 204));
        myButton1.setColor(new java.awt.Color(255, 255, 255));
        myButton1.setColorClicked(new java.awt.Color(204, 204, 204));
        myButton1.setColorOver(new java.awt.Color(244, 244, 244));
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton1.setMaximumSize(new java.awt.Dimension(157, 40));
        myButton1.setMinimumSize(new java.awt.Dimension(157, 40));
        myButton1.setPreferredSize(new java.awt.Dimension(157, 40));
        myButton1.setRadius(10);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 210, 130));
        jLabel1.setText("Buscar aluno para edição:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setMaximumSize(new java.awt.Dimension(72, 30));
        jComboBox1.setMinimumSize(new java.awt.Dimension(72, 30));
        jComboBox1.setPreferredSize(new java.awt.Dimension(72, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setMaximumSize(new java.awt.Dimension(72, 30));
        jComboBox2.setMinimumSize(new java.awt.Dimension(72, 30));
        jComboBox2.setPreferredSize(new java.awt.Dimension(72, 30));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(246, 246, 249));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Aluno:");

        jLabel4.setBackground(new java.awt.Color(246, 246, 249));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Turma:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        
        
        aluno= listaAluno.get(jComboBox2.getSelectedIndex());
        
        if (aluno != null && turma!= null){
            EditarAluno editarAluno = new EditarAluno(aluno);
            jDesktopPanel.removeAll();
            jDesktopPanel.add(editarAluno).setVisible(true);
            
        }
        
       
    }//GEN-LAST:event_myButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int id = jComboBox1.getSelectedIndex();
        this.turma = this.lista.get(id);
        prencherComboBox2(turma);
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int id = jComboBox1.getSelectedIndex();
        if (listaAluno.isEmpty()) {
            this.aluno = this.listaAluno.get(id);
        } else {
        }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private GUI.swing.MyButton myButton1;
    // End of variables declaration//GEN-END:variables
}

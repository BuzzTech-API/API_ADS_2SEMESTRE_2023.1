/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.popup.PopupAltAluno;
import GUI.popup.PopupConfirmCadastAluno;
import GUI.popup.PopupExcluAluno;

import dao.TurmaDao;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Aluno;
import modelo.Atividades;
import modelo.LengthRestrictedDocument;
import modelo.Turma;

public class EditarAluno extends javax.swing.JInternalFrame {

    private Aluno aluno = new Aluno();
    private EditarAluno editarAluno;
    private ArrayList<Turma> lista = new ArrayList<>();

    public EditarAluno(Aluno aluno) {

        this.aluno = aluno;

        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        editAlu();
        preecherComboBoxTurma();
    }

    public void editAlu() {

        alunoNome.setText(this.aluno.getNome());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alunoNome = new javax.swing.JTextField();
        turmaAlu = new javax.swing.JComboBox<>();
        excluirAlu = new GUI.swing.MyButton();
        salvarAlu = new GUI.swing.MyButton();

        jPanel2.setBackground(new java.awt.Color(246, 246, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(114, 133, 165)));

        jLabel1.setBackground(new java.awt.Color(4, 210, 130));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 210, 130));
        jLabel1.setText("Alterar Aluno:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome aluno:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Turma:");

        alunoNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        alunoNome.setMaximumSize(new java.awt.Dimension(64, 30));
        alunoNome.setMinimumSize(new java.awt.Dimension(64, 30));
        alunoNome.setPreferredSize(new java.awt.Dimension(64, 30));

        turmaAlu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        turmaAlu.setMaximumSize(new java.awt.Dimension(64, 30));
        turmaAlu.setMinimumSize(new java.awt.Dimension(64, 30));
        turmaAlu.setPreferredSize(new java.awt.Dimension(64, 30));
        turmaAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmaAluActionPerformed(evt);
            }
        });

        excluirAlu.setBackground(new java.awt.Color(255, 255, 255));
        excluirAlu.setForeground(new java.awt.Color(2, 30, 54));
        excluirAlu.setText("Excluir  aluno(a)");
        excluirAlu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        excluirAlu.setMaximumSize(new java.awt.Dimension(157, 40));
        excluirAlu.setMinimumSize(new java.awt.Dimension(157, 40));
        excluirAlu.setPreferredSize(new java.awt.Dimension(157, 40));
        excluirAlu.setRadius(10);
        excluirAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirAluActionPerformed(evt);
            }
        });

        salvarAlu.setForeground(new java.awt.Color(2, 30, 54));
        salvarAlu.setText("Salvar");
        salvarAlu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salvarAlu.setMaximumSize(new java.awt.Dimension(157, 40));
        salvarAlu.setMinimumSize(new java.awt.Dimension(157, 40));
        salvarAlu.setPreferredSize(new java.awt.Dimension(157, 40));
        salvarAlu.setRadius(10);
        salvarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarAluActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(salvarAlu,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(alunoNome,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(turmaAlu, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))
                                                .addGap(35, 35, 35))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(excluirAlu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 217, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(alunoNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(turmaAlu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(excluirAlu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salvarAlu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turmaAluActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_turmaAluActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_turmaAluActionPerformed

    private void excluirAluActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_excluirAluActionPerformed

        PopupExcluAluno popup = new PopupExcluAluno(aluno, this);
        popup.setVisible(true);

    }// GEN-LAST:event_excluirAluActionPerformed

    private void salvarAluActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salvarAluActionPerformed

        int id = turmaAlu.getSelectedIndex();

        Turma turma = this.lista.get(id);
        turma.buscarAtividades();
        aluno.setNome(alunoNome.getText());
        aluno.setId_turma(turma.getId_turma());

        PopupAltAluno popup = new PopupAltAluno(aluno);
        popup.setVisible(true);

    }// GEN-LAST:event_salvarAluActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alunoNome;
    private GUI.swing.MyButton excluirAlu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private GUI.swing.MyButton salvarAlu;
    private javax.swing.JComboBox<String> turmaAlu;
    // End of variables declaration//GEN-END:variables

    public void preecherComboBoxTurma() {
        TurmaDao turmaDao = new TurmaDao();
        lista = turmaDao.getTurma();
        for (Turma turma : lista) {

            turmaAlu.addItem("Turma: " + turma.getNome() + " - Escola: " + turma.getNome_escola());
            if (turma.getId_turma() == aluno.getId_turma()) {
                turmaAlu.setSelectedItem("Turma: " + turma.getNome() + " - Escola: " + turma.getNome_escola());
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import dao.AtividadesDao;
import dao.TurmaDao;
import modelo.Aluno_Atividade;
import modelo.Turma;
/**
 *
 * @author joice
 */
public class AtividadeDadosAlunosPendentes extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtividadeDadosAlunosPendentes
     */
     javax.swing.JDesktopPane jDesktopPanel;
     
     
    private Turma turmaInfo = new Turma();
    
    public AtividadeDadosAlunosPendentes() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public AtividadeDadosAlunosPendentes(JDesktopPane jDesktopPanel , ArrayList<Aluno_Atividade> listaAluno_Atividades, int atividadeNum, Turma turma) {
        this.jDesktopPanel = jDesktopPanel;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ativNum.setText(ativNum.getText()+atividadeNum);
        this.turmaInfo=turma;
        this.turma.setText(this.turma.getText() + turmaInfo.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recebDataEntrega = new javax.swing.JFormattedTextField();
        recebDataSolicitacao1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        editAlunosPendesntes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        recebPorcentagemAlunosPendentes = new javax.swing.JTextField();
        ativNum = new javax.swing.JTextField();
        turma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomeEscola = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 730));

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Data da Entrega:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Data da Solicitação:");

        recebDataEntrega.setBackground(new java.awt.Color(236, 236, 236));
        try {
            recebDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        recebDataEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        recebDataSolicitacao1.setBackground(new java.awt.Color(236, 236, 236));
        try {
            recebDataSolicitacao1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        recebDataSolicitacao1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebDataSolicitacao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebDataSolicitacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebDataSolicitacao1ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(236, 236, 236));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(236, 236, 236));

        editAlunosPendesntes.setBackground(new java.awt.Color(236, 236, 236));
        editAlunosPendesntes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        editAlunosPendesntes.setBorder(null);
        editAlunosPendesntes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editAlunosPendesntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlunosPendesntesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("pendente");

        recebPorcentagemAlunosPendentes.setBackground(new java.awt.Color(236, 236, 236));
        recebPorcentagemAlunosPendentes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        recebPorcentagemAlunosPendentes.setForeground(new java.awt.Color(255, 0, 0));
        recebPorcentagemAlunosPendentes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebPorcentagemAlunosPendentes.setText("10%");
        recebPorcentagemAlunosPendentes.setBorder(null);

        jDesktopPane1.setLayer(editAlunosPendesntes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(recebPorcentagemAlunosPendentes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(recebPorcentagemAlunosPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(editAlunosPendesntes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(recebPorcentagemAlunosPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(editAlunosPendesntes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recebDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(recebDataSolicitacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(recebDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recebDataSolicitacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 200, 850, 450));

        ativNum.setEditable(false);
        ativNum.setBackground(new java.awt.Color(217, 217, 217));
        ativNum.setFont(new java.awt.Font("Segoe UI", 1, 46)); // NOI18N
        ativNum.setForeground(new java.awt.Color(4, 210, 130));
        ativNum.setText("Atividade ");
        ativNum.setBorder(null);
        ativNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativNumActionPerformed(evt);
            }
        });
        jPanel3.add(ativNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        turma.setEditable(false);
        turma.setBackground(new java.awt.Color(217, 217, 217));
        turma.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        turma.setForeground(new java.awt.Color(239, 131, 84));
        turma.setText("Turma ");
        turma.setBorder(null);
        turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmaActionPerformed(evt);
            }
        });
        jPanel3.add(turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Escola:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        nomeEscola.setBackground(new java.awt.Color(217, 217, 217));
        nomeEscola.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nomeEscola.setBorder(null);
        nomeEscola.setMinimumSize(new java.awt.Dimension(46, 22));
        nomeEscola.setPreferredSize(new java.awt.Dimension(46, 22));
        nomeEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEscolaActionPerformed(evt);
            }
        });
        jPanel3.add(nomeEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 300, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escola.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 120, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ativNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativNumActionPerformed

    private void recebDataSolicitacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebDataSolicitacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebDataSolicitacao1ActionPerformed

    private void nomeEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEscolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEscolaActionPerformed


    private void turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turmaActionPerformed

    private void editAlunosPendesntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlunosPendesntesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editAlunosPendesntesActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ativNum;
    private javax.swing.JButton editAlunosPendesntes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nomeEscola;
    private javax.swing.JFormattedTextField recebDataEntrega;
    private javax.swing.JFormattedTextField recebDataSolicitacao1;
    private javax.swing.JTextField recebPorcentagemAlunosPendentes;
    private javax.swing.JTextField turma;
    // End of variables declaration//GEN-END:variables
}

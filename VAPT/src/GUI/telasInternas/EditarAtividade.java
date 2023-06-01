/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.popup.PopupAltAtividade;
import GUI.swing.RedmensionadorImagens;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.MaskFormatter;

import modelo.Atividades;
import modelo.Turma;

import dao.TurmaDao;
import modelo.LengthRestrictedDocument;

public class EditarAtividade extends javax.swing.JInternalFrame {

    private Atividades atividade;
    private Turma turma = new Turma();
    private ArrayList<Turma> lista = new ArrayList<>();
    MaskFormatter mfdata;
    private int id;

    public EditarAtividade(Atividades atividade, int id) {
        this.atividade = atividade;
        this.id = id;
        this.turma = turma;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        dataSolicitacaoBut.setIcon(
                RedmensionadorImagens.iconeRedemensionado(getClass().getResource("/img/calendar.png"), 20, 20));
        dataEntregaBut.setIcon(
                RedmensionadorImagens.iconeRedemensionado(getClass().getResource("/img/calendar.png"), 20, 20));

        editarAtiv();
        preecherComboBoxTurma();

    }

    @SuppressWarnings("unchecked")

    public void editarAtiv() {

        tipoAtv.setText(this.atividade.getTipo());
        descAtv.setText(this.atividade.getDescricao());
        dateChooser1.setSelectedDate(this.atividade.getData_inicio());
        dateChooser2.setSelectedDate(this.atividade.getData_fim());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            diaSolicitado.setText(sdf.format(this.atividade.getData_inicio()));
            diaEntregue.setText(sdf.format(this.atividade.getData_fim()));
        } catch (Exception e) {
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser2 = new GUI.datechooser.DateChooser();
        dateChooser1 = new GUI.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        turmas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipoAtv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descAtv = new javax.swing.JTextArea();
        descAtv.setLineWrap(true);
        descAtv.setWrapStyleWord(true);
        diaEntregue = new javax.swing.JFormattedTextField();
        diaSolicitado = new javax.swing.JFormattedTextField(mfdata);
        dataSolicitacaoBut = new GUI.swing.MyButton();
        dataEntregaBut = new GUI.swing.MyButton();
        jButton1 = new GUI.swing.MyButton();

        dateChooser2.setForeground(new java.awt.Color(0, 0, 255));
        dateChooser2.setTextRefernce(diaEntregue);

        dateChooser1.setForeground(new java.awt.Color(0, 0, 255));
        dateChooser1.setTextRefernce(diaSolicitado);

        jPanel1.setBackground(new java.awt.Color(246, 246, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(114, 133, 165)));
        jPanel1.setMaximumSize(new java.awt.Dimension(856, 582));
        jPanel1.setMinimumSize(new java.awt.Dimension(856, 582));
        jPanel1.setPreferredSize(new java.awt.Dimension(856, 582));

        jLabel1.setBackground(new java.awt.Color(246, 246, 249));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 210, 130));
        jLabel1.setText("Atualizar Atividades:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Turma:");

        turmas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        turmas.setMaximumSize(new java.awt.Dimension(430, 30));
        turmas.setMinimumSize(new java.awt.Dimension(430, 30));
        turmas.setPreferredSize(new java.awt.Dimension(430, 30));
        turmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Data da Solicitação:");

        tipoAtv.setDocument(new LengthRestrictedDocument(45));
        tipoAtv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoAtv.setMaximumSize(new java.awt.Dimension(139, 30));
        tipoAtv.setMinimumSize(new java.awt.Dimension(139, 30));
        tipoAtv.setPreferredSize(new java.awt.Dimension(139, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Dia:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Data de Entrega:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Dia:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Descrição:");

        descAtv.setColumns(20);
        descAtv.setDocument(new LengthRestrictedDocument(300));
        descAtv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descAtv.setRows(5);
        descAtv.setMaximumSize(new java.awt.Dimension(292, 114));
        descAtv.setMinimumSize(new java.awt.Dimension(292, 114));
        jScrollPane1.setViewportView(descAtv);

        try {
            diaEntregue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        diaEntregue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        diaEntregue.setMaximumSize(new java.awt.Dimension(72, 28));
        diaEntregue.setMinimumSize(new java.awt.Dimension(72, 28));
        diaEntregue.setPreferredSize(new java.awt.Dimension(72, 28));
        diaEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaEntregueActionPerformed(evt);
            }
        });

        try {
            diaSolicitado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        diaSolicitado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        diaSolicitado.setMaximumSize(new java.awt.Dimension(72, 28));
        diaSolicitado.setMinimumSize(new java.awt.Dimension(72, 28));
        diaSolicitado.setPreferredSize(new java.awt.Dimension(72, 28));
        diaSolicitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaSolicitadoActionPerformed(evt);
            }
        });

        dataSolicitacaoBut.setBorderColor(new java.awt.Color(246, 246, 249));
        dataSolicitacaoBut.setColor(new java.awt.Color(246, 246, 249));
        dataSolicitacaoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSolicitacaoButActionPerformed(evt);
            }
        });

        dataEntregaBut.setBorderColor(new java.awt.Color(246, 246, 249));
        dataEntregaBut.setColor(new java.awt.Color(246, 246, 249));
        dataEntregaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEntregaButActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(2, 30, 54));
        jButton1.setText("Salvar");
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(157, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(157, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(157, 40));
        jButton1.setRadius(10);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(diaSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(diaEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(dataEntregaBut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel8)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(120, 120, 120)
                                                    .addComponent(dataSolicitacaoBut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addComponent(jLabel3)
                                    .addGap(9, 9, 9)
                                    .addComponent(tipoAtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(turmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tipoAtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataSolicitacaoBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaSolicitado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(dataEntregaBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diaEntregue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turmasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_turmasActionPerformed

    }// GEN-LAST:event_turmasActionPerformed

    private void dataSolicitacaoButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dataSolicitacaoButActionPerformed
        // TODO add your handling code here:
        dateChooser1.showPopup();
    }// GEN-LAST:event_dataSolicitacaoButActionPerformed

    private void dataEntregaButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dataEntregaButActionPerformed
        // TODO add your handling code here:
        dateChooser2.showPopup();
    }// GEN-LAST:event_dataEntregaButActionPerformed

    private void diaSolicitadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_diaSolicitadoActionPerformed
        // TODO add your handling code here:
        dateChooser1.showPopup();
    }// GEN-LAST:event_diaSolicitadoActionPerformed

    private void diaEntregueActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_diaEntregueActionPerformed
        // TODO add your handling code here:
        dateChooser2.showPopup();
    }// GEN-LAST:event_diaEntregueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        int id = turmas.getSelectedIndex();
        Turma turma = this.lista.get(id);
        atividade.setTipo(tipoAtv.getText());
        atividade.setDescricao(descAtv.getText());
        atividade.setTurma_id_turma(turma.getId_turma());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date dataEntrega = df.parse(diaEntregue.getText());
            java.util.Date dataSolicitacao = df.parse(diaSolicitado.getText());
            java.sql.Date sqlDate = new java.sql.Date(dataEntrega.getTime());
            java.sql.Date sqlDate2 = new java.sql.Date(dataSolicitacao.getTime());
            atividade.setData_inicio(sqlDate2);
            atividade.setData_fim(sqlDate);

            PopupAltAtividade popup = new PopupAltAtividade(atividade, " " + this.id);
            popup.setVisible(true);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton dataEntregaBut;
    private GUI.swing.MyButton dataSolicitacaoBut;
    private GUI.datechooser.DateChooser dateChooser1;
    private GUI.datechooser.DateChooser dateChooser2;
    private javax.swing.JTextArea descAtv;
    private javax.swing.JFormattedTextField diaEntregue;
    private javax.swing.JFormattedTextField diaSolicitado;
    private GUI.swing.MyButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tipoAtv;
    private javax.swing.JComboBox<String> turmas;
    // End of variables declaration//GEN-END:variables

    private void preecherComboBoxTurma() {
        TurmaDao turmaDao = new TurmaDao();
        lista = turmaDao.getTurma();
        for (Turma turma : lista) {
            turmas.addItem("Turma: " + turma.getNome() + " - Escola: " + turma.getNome_escola());
            if (turma.getId_turma() == atividade.getTurma_id_turma()) {
                turmas.setSelectedItem("Turma: " + turma.getNome() + " - Escola: " + turma.getNome_escola());
            }
        }

    }

}

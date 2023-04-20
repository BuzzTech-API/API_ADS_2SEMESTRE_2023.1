/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import dao.AtividadesDao;
import dao.TurmaDao;
import java.util.Locale;
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
        nomeEscola.setText(turma.getNome_escola());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        recebDataEntrega.setText(sdf.format(listaAluno_Atividades.get(atividadeNum-1).getAtividade().getData_inicio()));
        recebDataSolicitacao1.setText(sdf.format(listaAluno_Atividades.get(atividadeNum-1).getAtividade().getData_fim()));
        jTextArea1.setText(listaAluno_Atividades.get(atividadeNum-1).getAtividade().getDescricao());
        VisuAtivDadosAlunosPendentes visuAluPendente = new VisuAtivDadosAlunosPendentes(listaAluno_Atividades, recebNomesPend, jDesktopPanel);
        recebNomesPend.add(visuAluPendente).setVisible(true);
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
        recebNomesPend = new javax.swing.JDesktopPane();
        ativNum = new javax.swing.JTextField();
        turma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nomeEscola = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 730));

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Data da Entrega:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Data da Solicitação:");

        recebDataEntrega.setEditable(false);
        recebDataEntrega.setBackground(new java.awt.Color(236, 236, 236));
        try {
            recebDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        recebDataEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        recebDataSolicitacao1.setEditable(false);
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

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(236, 236, 236));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        recebNomesPend.setBackground(new java.awt.Color(236, 236, 236));
        recebNomesPend.setPreferredSize(new java.awt.Dimension(742, 240));

        javax.swing.GroupLayout recebNomesPendLayout = new javax.swing.GroupLayout(recebNomesPend);
        recebNomesPend.setLayout(recebNomesPendLayout);
        recebNomesPendLayout.setHorizontalGroup(
            recebNomesPendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        recebNomesPendLayout.setVerticalGroup(
            recebNomesPendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recebNomesPend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(recebNomesPend, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 850, 450));

        ativNum.setEditable(false);
        ativNum.setBackground(new java.awt.Color(217, 217, 217));
        ativNum.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        ativNum.setForeground(new java.awt.Color(4, 210, 130));
        ativNum.setText("Atividade ");
        ativNum.setBorder(null);
        ativNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativNumActionPerformed(evt);
            }
        });
        jPanel3.add(ativNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        turma.setEditable(false);
        turma.setBackground(new java.awt.Color(217, 217, 217));
        turma.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        turma.setForeground(new java.awt.Color(239, 131, 84));
        turma.setText("Turma ");
        turma.setBorder(null);
        jPanel3.add(turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 40));

        jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Escola:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escola.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 120, 80));

        nomeEscola.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nomeEscola.setText("jLabel4");
        jPanel3.add(nomeEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ativNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativNumActionPerformed

    private void recebDataSolicitacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebDataSolicitacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebDataSolicitacao1ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ativNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nomeEscola;
    private javax.swing.JFormattedTextField recebDataEntrega;
    private javax.swing.JFormattedTextField recebDataSolicitacao1;
    private javax.swing.JDesktopPane recebNomesPend;
    private javax.swing.JTextField turma;
    // End of variables declaration//GEN-END:variables
}

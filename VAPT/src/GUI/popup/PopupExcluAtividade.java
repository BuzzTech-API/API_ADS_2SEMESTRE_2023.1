/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.popup;

import GUI.telasInternas.VisualizarCardsAtividade;
import dao.AtividadesDao;
import modelo.Atividades;



public class PopupExcluAtividade extends javax.swing.JFrame {
    
    private Atividades atividades;
    private VisualizarCardsAtividade visualizarCardsAtividade;
            
            
    public PopupExcluAtividade() {
        initComponents();
    }  
    
    public PopupExcluAtividade(Atividades atividades, VisualizarCardsAtividade visualizarCardsAtividade) {
        this.atividades = atividades;
        this.visualizarCardsAtividade = visualizarCardsAtividade;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texto1 = new javax.swing.JLabel();
        nomeAtividade = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        setMinimumSize(new java.awt.Dimension(410, 173));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 93, 117), 2, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(410, 173));
        jPanel1.setMinimumSize(new java.awt.Dimension(410, 173));
        jPanel1.setOpaque(false);

        texto1.setBackground(new java.awt.Color(217, 217, 217));
        texto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto1.setText("Tem certeza que deseja excluir \"");

        nomeAtividade.setBackground(new java.awt.Color(217, 217, 217));
        nomeAtividade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeAtividade.setText("Atividade 01");
        nomeAtividade.setOpaque(true);

        texto2.setBackground(new java.awt.Color(217, 217, 217));
        texto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto2.setText("\"?");

        botaoExcluir.setBackground(new java.awt.Color(239, 131, 84));
        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(1, 30, 84));
        botaoExcluir.setText("Excluir");
        botaoExcluir.setMaximumSize(new java.awt.Dimension(95, 27));
        botaoExcluir.setMinimumSize(new java.awt.Dimension(95, 27));
        botaoExcluir.setPreferredSize(new java.awt.Dimension(95, 27));
        botaoExcluir.setSelected(true);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(1, 30, 84));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(texto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botaoCancelar)
                        .addGap(53, 53, 53)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1)
                    .addComponent(nomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        new AtividadesDao().deletarAtividade(atividades.getId_atividade());
        visualizarCardsAtividade.preencherPane(atividades.getTurma_id_turma());
        
        this.dispose();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopupExcluAtividade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeAtividade;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}

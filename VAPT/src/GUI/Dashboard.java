/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author isaqu
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
 
    Color DefaultColor, ClickColor;
    
    
    public Dashboard() {
        initComponents();
        DefaultColor= new Color(13,36,70);
        ClickColor = new Color(220,141,77);
        
        
        HomeButton.setBackground(DefaultColor);
        AtividadesButton.setBackground(DefaultColor);
        CadastrosButton.setBackground(DefaultColor);

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
        jPanel5 = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        AtividadesButton = new javax.swing.JButton();
        CadastrosButton = new javax.swing.JButton();
        jDesktopPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 725));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(13, 36, 70));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(13, 36, 70));
        HomeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home        ");
        HomeButton.setBorder(null);
        HomeButton.setBorderPainted(false);
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeButtonMousePressed(evt);
            }
        });
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 60));

        AtividadesButton.setBackground(new java.awt.Color(13, 36, 70));
        AtividadesButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AtividadesButton.setForeground(new java.awt.Color(255, 255, 255));
        AtividadesButton.setText("Atividades");
        AtividadesButton.setBorder(null);
        AtividadesButton.setBorderPainted(false);
        AtividadesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AtividadesButtonMousePressed(evt);
            }
        });
        AtividadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtividadesButtonActionPerformed(evt);
            }
        });
        jPanel5.add(AtividadesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, 60));

        CadastrosButton.setBackground(new java.awt.Color(13, 36, 70));
        CadastrosButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CadastrosButton.setForeground(new java.awt.Color(255, 255, 255));
        CadastrosButton.setText("Cadastrar");
        CadastrosButton.setBorder(null);
        CadastrosButton.setBorderPainted(false);
        CadastrosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CadastrosButtonMousePressed(evt);
            }
        });
        CadastrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrosButtonActionPerformed(evt);
            }
        });
        jPanel5.add(CadastrosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 300, 57));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 730));

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMousePressed
        // TODO add your handling code here:
        HomeButton.setBackground(ClickColor);
        AtividadesButton.setBackground(DefaultColor);
        CadastrosButton.setBackground(DefaultColor);
    }//GEN-LAST:event_HomeButtonMousePressed

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
        HomeButton.setBackground(ClickColor);
        AtividadesButton.setBackground(DefaultColor);
        CadastrosButton.setBackground(DefaultColor);
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void AtividadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtividadesButtonActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_AtividadesButtonActionPerformed

    private void AtividadesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtividadesButtonMousePressed
        // TODO add your handling code here:
        HomeButton.setBackground(DefaultColor);
        AtividadesButton.setBackground(ClickColor);
        CadastrosButton.setBackground(DefaultColor);
    }//GEN-LAST:event_AtividadesButtonMousePressed

    private void CadastrosButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrosButtonMousePressed
        // TODO add your handling code here:
        HomeButton.setBackground(DefaultColor);
        AtividadesButton.setBackground(DefaultColor);
        CadastrosButton.setBackground(ClickColor);
    }//GEN-LAST:event_CadastrosButtonMousePressed

    private void CadastrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrosButtonActionPerformed
        // TODO add your handling code here:
        TiposDeCadastro tipoDeCadastro = new TiposDeCadastro();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(tipoDeCadastro).setVisible(true);
    }//GEN-LAST:event_CadastrosButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtividadesButton;
    private javax.swing.JButton CadastrosButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.popup;

import GUI.telasInternas.EditarAluno;
import dao.AlunoDao;
import modelo.Aluno;

/**
 *
 * @author Alicea
 */
public class PopupExcluAluno extends javax.swing.JFrame {

    private Aluno aluno;
    private EditarAluno editarAluno;
   
    
    
    
     public PopupExcluAluno(Aluno aluno, EditarAluno editarAluno) {
        this.aluno = aluno;
        this.editarAluno = editarAluno;
        initComponents();
        nomeAluno.setText(this.aluno.getNome());
    }
    
    
    
    public PopupExcluAluno() {
       
        initComponents();
    }
    
    
   
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texto1 = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        botaoExcluir = new GUI.swing.MyButton();
        myButton2 = new GUI.swing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        setMinimumSize(new java.awt.Dimension(410, 173));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(246, 246, 249));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 93, 117), 2, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(410, 173));
        jPanel1.setMinimumSize(new java.awt.Dimension(410, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 173));

        texto1.setBackground(new java.awt.Color(217, 217, 217));
        texto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto1.setText("Tem certeza que deseja excluir ");

        nomeAluno.setEditable(false);
        nomeAluno.setBackground(new java.awt.Color(246, 246, 249));
        nomeAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        texto2.setBackground(new java.awt.Color(217, 217, 217));
        texto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto2.setText("\"");

        texto3.setBackground(new java.awt.Color(217, 217, 217));
        texto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto3.setText("\"?");

        botaoExcluir.setForeground(new java.awt.Color(2, 30, 54));
        botaoExcluir.setText("Excluir");
        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botaoExcluir.setMaximumSize(new java.awt.Dimension(117, 35));
        botaoExcluir.setMinimumSize(new java.awt.Dimension(117, 35));
        botaoExcluir.setPreferredSize(new java.awt.Dimension(117, 35));
        botaoExcluir.setRadius(10);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        myButton2.setBackground(new java.awt.Color(255, 255, 255));
        myButton2.setForeground(new java.awt.Color(2, 30, 54));
        myButton2.setText("Cancelar");
        myButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        myButton2.setMaximumSize(new java.awt.Dimension(117, 35));
        myButton2.setMinimumSize(new java.awt.Dimension(117, 35));
        myButton2.setPreferredSize(new java.awt.Dimension(117, 35));
        myButton2.setRadius(10);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(texto1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(texto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto3)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto2)
                    .addComponent(texto3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        
        new AlunoDao().deletarAluno(aluno.getId_aluno());
        editarAluno.preecherComboBoxTurma();
        this.dispose();    
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_myButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PopupExcluAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupExcluAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopupExcluAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton botaoExcluir;
    private javax.swing.JPanel jPanel1;
    private GUI.swing.MyButton myButton2;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    // End of variables declaration//GEN-END:variables
}

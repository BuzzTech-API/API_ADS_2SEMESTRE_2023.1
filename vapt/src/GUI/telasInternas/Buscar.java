/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

/**
 *
 * @author DELL
 */
public class Buscar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BuscarAluno = new javax.swing.JTextField();
        button1 = new java.awt.Button();

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1189, 550));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1189, 550));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1189, 550));

        BuscarAluno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BuscarAluno.setForeground(new java.awt.Color(102, 102, 102));
        BuscarAluno.setToolTipText("Buscar Aluno");
        BuscarAluno.setName("BuscarAluno"); // NOI18N
        BuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAlunoActionPerformed(evt);
            }
        });

        button1.setActionCommand("Pesquisar");
        button1.setBackground(new java.awt.Color(239, 131, 84));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button1.setLabel("Pesquisar");
        button1.setName("Pesquisar"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(BuscarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarAluno)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarAluno;
    private java.awt.Button button1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
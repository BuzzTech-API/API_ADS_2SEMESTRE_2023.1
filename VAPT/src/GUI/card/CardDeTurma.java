/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.card;

import GUI.popup.PopupExcluTurma;
import GUI.telasInternas.Buscar;
import GUI.telasInternas.VisualizarCardEditarTurma;
import dao.TurmaDao;
import modelo.Turma;

/**
 *
 * @author Fatec
 */
public class CardDeTurma extends javax.swing.JPanel {
    
    private Buscar buscar;
    private Turma turma;
    private VisualizarCardEditarTurma visualizarCardEditarTurma;
    
    
    public CardDeTurma() {
        initComponents();
        setOpaque(false);
    }

    public CardDeTurma(Turma turma, Buscar buscar) {
        this.buscar = buscar;
        this.turma = turma;
        initComponents();
        setOpaque(false);
        jLabel1.setText("Turma "+ turma.getNome());
        jLabel3.setText(turma.getNome_escola());
    }
    
    public CardDeTurma(Turma turma, VisualizarCardEditarTurma visualizarCardEditarTurma) {
        this.visualizarCardEditarTurma = visualizarCardEditarTurma;
        this.turma = turma;
        initComponents();
        setOpaque(false);
        jLabel1.setText("Turma "+turma.getNome());
        jLabel3.setText(turma.getNome_escola());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordaArredondadaComLinha1 = new GUI.swing.PanelBordaArredondadaComLinha();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        myButton1 = new GUI.swing.MyButton();
        myButton2 = new GUI.swing.MyButton();

        setPreferredSize(new java.awt.Dimension(220, 240));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBordaArredondadaComLinha1.setBackground(new java.awt.Color(252, 252, 252));
        panelBordaArredondadaComLinha1.setMinimumSize(new java.awt.Dimension(220, 191));
        panelBordaArredondadaComLinha1.setPreferredSize(new java.awt.Dimension(220, 191));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 131, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Turma 7º D");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schoolred.png"))); // NOI18N
        jLabel2.setText("Escola:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EEF João Macedo");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        myButton1.setBackground(new java.awt.Color(252, 252, 252));
        myButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        myButton1.setForeground(new java.awt.Color(51, 51, 51));
        myButton1.setText("Excluir");
        myButton1.setColor(new java.awt.Color(252, 252, 252));
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        myButton2.setBackground(new java.awt.Color(252, 252, 252));
        myButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        myButton2.setForeground(new java.awt.Color(4, 210, 130));
        myButton2.setText("Editar");
        myButton2.setColor(new java.awt.Color(252, 252, 252));
        myButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelBordaArredondadaComLinha1Layout = new javax.swing.GroupLayout(panelBordaArredondadaComLinha1);
        panelBordaArredondadaComLinha1.setLayout(panelBordaArredondadaComLinha1Layout);
        panelBordaArredondadaComLinha1Layout.setHorizontalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBordaArredondadaComLinha1Layout.setVerticalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(panelBordaArredondadaComLinha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        
        if (buscar == null) {
            PopupExcluTurma popup = new PopupExcluTurma(turma, visualizarCardEditarTurma);
            popup.setVisible(true);
        } 
        else {
            PopupExcluTurma popup = new PopupExcluTurma(turma, buscar);
            popup.setVisible(true);
        }

        

    }//GEN-LAST:event_myButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private GUI.swing.MyButton myButton1;
    private GUI.swing.MyButton myButton2;
    private GUI.swing.PanelBordaArredondadaComLinha panelBordaArredondadaComLinha1;
    // End of variables declaration//GEN-END:variables
}

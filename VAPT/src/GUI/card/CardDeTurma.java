/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.card;

import GUI.popup.PopupExcluTurma;
import GUI.telasInternas.Buscar;
import GUI.telasInternas.EditarAtividade;
import GUI.telasInternas.EditarTurma;
import GUI.telasInternas.VisualizarCardEditarTurma;
import dao.TurmaDao;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JDesktopPane;
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
        nomeTurma.setText("Turma "+ turma.getNome());
        nomeEscola.setText(turma.getNome_escola());
    }
    
    public CardDeTurma(Turma turma, VisualizarCardEditarTurma visualizarCardEditarTurma) {
        this.visualizarCardEditarTurma = visualizarCardEditarTurma;
        this.turma = turma;
        initComponents();
        setOpaque(false);
        nomeTurma.setText("Turma "+turma.getNome());
        nomeEscola.setText(turma.getNome_escola());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordaArredondadaComLinha1 = new GUI.swing.PanelBordaArredondadaComLinha();
        nomeTurma = new javax.swing.JLabel();
        escola = new javax.swing.JLabel();
        nomeEscola = new javax.swing.JLabel();
        excluiBut = new GUI.swing.MyButton();
        editBut = new GUI.swing.MyButton();

        setMaximumSize(new java.awt.Dimension(220, 240));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(220, 240));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBordaArredondadaComLinha1.setBackground(new java.awt.Color(252, 252, 252));
        panelBordaArredondadaComLinha1.setMaximumSize(new java.awt.Dimension(220, 191));
        panelBordaArredondadaComLinha1.setMinimumSize(new java.awt.Dimension(220, 191));
        panelBordaArredondadaComLinha1.setPreferredSize(new java.awt.Dimension(220, 191));

        nomeTurma.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        nomeTurma.setForeground(new java.awt.Color(239, 131, 84));
        nomeTurma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeTurma.setText("Turma: 7º D");
        nomeTurma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        escola.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        escola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schoolred.png"))); // NOI18N
        escola.setText("Escola:");

        nomeEscola.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nomeEscola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeEscola.setText("EEF João Macedo");
        nomeEscola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        excluiBut.setBackground(new java.awt.Color(252, 252, 252));
        excluiBut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        excluiBut.setForeground(new java.awt.Color(51, 51, 51));
        excluiBut.setText("Excluir");
        excluiBut.setColor(new java.awt.Color(252, 252, 252));
        excluiBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        excluiBut.setMaximumSize(new java.awt.Dimension(85, 27));
        excluiBut.setMinimumSize(new java.awt.Dimension(85, 27));
        excluiBut.setPreferredSize(new java.awt.Dimension(85, 27));
        excluiBut.setRadius(8);
        excluiBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                excluiButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                excluiButMouseExited(evt);
            }
        });
        excluiBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiButActionPerformed(evt);
            }
        });

        editBut.setBackground(new java.awt.Color(252, 252, 252));
        editBut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        editBut.setForeground(new java.awt.Color(4, 210, 130));
        editBut.setText("Editar");
        editBut.setColor(new java.awt.Color(252, 252, 252));
        editBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editBut.setMaximumSize(new java.awt.Dimension(85, 27));
        editBut.setMinimumSize(new java.awt.Dimension(85, 27));
        editBut.setPreferredSize(new java.awt.Dimension(85, 27));
        editBut.setRadius(8);
        editBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButMouseExited(evt);
            }
        });
        editBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBordaArredondadaComLinha1Layout = new javax.swing.GroupLayout(panelBordaArredondadaComLinha1);
        panelBordaArredondadaComLinha1.setLayout(panelBordaArredondadaComLinha1Layout);
        panelBordaArredondadaComLinha1Layout.setHorizontalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(excluiBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(escola, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBordaArredondadaComLinha1Layout.setVerticalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(nomeTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(escola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEscola)
                .addGap(29, 29, 29)
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluiBut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(panelBordaArredondadaComLinha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void excluiButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiButActionPerformed
        
        if (buscar == null) {
            PopupExcluTurma popup = new PopupExcluTurma(turma, visualizarCardEditarTurma);
            popup.setVisible(true);
        } 
        else {
            PopupExcluTurma popup = new PopupExcluTurma(turma, buscar);
            popup.setVisible(true);
        }

        

    }//GEN-LAST:event_excluiButActionPerformed

    private void editButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButActionPerformed
        // TODO add your handling code here:
        if (buscar == null) {
            JDesktopPane desktopPane =  visualizarCardEditarTurma.getJDesktopPane();
            EditarTurma editarturma = new EditarTurma(turma);
            desktopPane.removeAll();
            desktopPane.add(editarturma).setVisible(true);
        } 
        else {
            JDesktopPane desktopPane =  buscar.getJDesktopPane();
            EditarTurma editarturma = new EditarTurma(turma);
            desktopPane.removeAll();
            desktopPane.add(editarturma).setVisible(true);
        }
    }//GEN-LAST:event_editButActionPerformed

    private void excluiButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluiButMouseEntered
        excluiBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_excluiButMouseEntered

    private void excluiButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluiButMouseExited
        excluiBut.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_excluiButMouseExited

    private void editButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButMouseEntered
        editBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        editBut.setForeground(new Color(41,41,41));
    }//GEN-LAST:event_editButMouseEntered

    private void editButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButMouseExited
        editBut.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        editBut.setForeground(new Color(4,210,130));
    }//GEN-LAST:event_editButMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton editBut;
    private javax.swing.JLabel escola;
    private GUI.swing.MyButton excluiBut;
    private javax.swing.JLabel nomeEscola;
    private javax.swing.JLabel nomeTurma;
    private GUI.swing.PanelBordaArredondadaComLinha panelBordaArredondadaComLinha1;
    // End of variables declaration//GEN-END:variables
}

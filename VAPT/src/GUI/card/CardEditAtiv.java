/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.card;

import GUI.popup.PopupExcluAtividade;
import GUI.swing.ScrollBarCustom;
import GUI.telasInternas.EditarAtividade;
import GUI.telasInternas.VisualizarCardsAtividade;
import dao.AtividadesDao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import modelo.Atividades;
import modelo.Aluno_Atividade;



public class CardEditAtiv extends javax.swing.JPanel {

    private Atividades atividades;
    private int id;
    private VisualizarCardsAtividade visualizarCardsAtividade;
    
    public CardEditAtiv(Atividades atividades, int id, VisualizarCardsAtividade visualizarCardsAtividade) {
        this.visualizarCardsAtividade = visualizarCardsAtividade;
        this.atividades = atividades;
        this.id = id;
        initComponents();
        setOpaque(false);

        
        preecherCardaNEntregue(id);
        
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane2.setVerticalScrollBar(sp);
        jScrollPane2.setHorizontalScrollBar(spHorizontal);
        
        
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordaArredondadaComLinha1 = new GUI.swing.PanelBordaArredondadaComLinha();
        atvNum1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataDeEntrega = new javax.swing.JLabel();
        excluirButton = new GUI.swing.MyButton();
        editarButton = new GUI.swing.MyButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(204, 269));

        panelBordaArredondadaComLinha1.setBackground(new java.awt.Color(246, 246, 249));
        panelBordaArredondadaComLinha1.setPreferredSize(new java.awt.Dimension(204, 269));

        atvNum1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        atvNum1.setForeground(new java.awt.Color(73, 93, 117));
        atvNum1.setText("Atividade ");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setText("Descrição");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel2.setText("Data da Entrega:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        dataDeEntrega.setBackground(new java.awt.Color(252, 252, 252));
        dataDeEntrega.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        dataDeEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        excluirButton.setForeground(new java.awt.Color(2, 30, 54));
        excluirButton.setText("Excluir");
        excluirButton.setColor(new java.awt.Color(246, 246, 249));
        excluirButton.setColorClicked(new java.awt.Color(153, 0, 51));
        excluirButton.setColorOver(new java.awt.Color(255, 51, 102));
        excluirButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        excluirButton.setMaximumSize(new java.awt.Dimension(78, 30));
        excluirButton.setMinimumSize(new java.awt.Dimension(78, 30));
        excluirButton.setPreferredSize(new java.awt.Dimension(78, 30));
        excluirButton.setRadius(10);
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        editarButton.setForeground(new java.awt.Color(2, 30, 54));
        editarButton.setText("Editar");
        editarButton.setColorClicked(new java.awt.Color(0, 102, 0));
        editarButton.setColorOver(new java.awt.Color(102, 204, 0));
        editarButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editarButton.setMaximumSize(new java.awt.Dimension(78, 30));
        editarButton.setMinimumSize(new java.awt.Dimension(78, 30));
        editarButton.setPreferredSize(new java.awt.Dimension(78, 30));
        editarButton.setRadius(10);
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBordaArredondadaComLinha1Layout = new javax.swing.GroupLayout(panelBordaArredondadaComLinha1);
        panelBordaArredondadaComLinha1.setLayout(panelBordaArredondadaComLinha1Layout);
        panelBordaArredondadaComLinha1Layout.setHorizontalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(atvNum1))
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataDeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelBordaArredondadaComLinha1Layout.setVerticalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(atvNum1)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataDeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordaArredondadaComLinha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordaArredondadaComLinha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        PopupExcluAtividade popup = new PopupExcluAtividade(atividades, visualizarCardsAtividade, id);
        popup.setVisible(true);
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        if (visualizarCardsAtividade.getJDesktopPane() !=null) {
            JDesktopPane desktopPane =  visualizarCardsAtividade.getJDesktopPane();
            EditarAtividade editarAtividade = new EditarAtividade(this.atividades, id);
            desktopPane.removeAll();
            desktopPane.add(editarAtividade).setVisible(true);
        }
    }//GEN-LAST:event_editarButtonActionPerformed
        
    private void preecherCardaNEntregue(int id){
        atvNum1.setText("Atividade "+id);
        jTextArea2.setText(this.atividades.getDescricao());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataDeEntrega.setText(sdf.format(this.atividades.getData_fim()));
       

    }
     
    @Override
         protected void paintComponent(Graphics grphcs) {
             
            Graphics2D g2 =(Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
            super.paintChildren(grphcs);
    }  
   
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atvNum1;
    private javax.swing.JLabel dataDeEntrega;
    private GUI.swing.MyButton editarButton;
    private GUI.swing.MyButton excluirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private GUI.swing.PanelBordaArredondadaComLinha panelBordaArredondadaComLinha1;
    // End of variables declaration//GEN-END:variables
}

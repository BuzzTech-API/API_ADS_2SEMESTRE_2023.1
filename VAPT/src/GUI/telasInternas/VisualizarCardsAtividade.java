/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import GUI.card.CardEditAtiv;
import GUI.swing.ScrollBarCustom;
import dao.AtividadesDao;
import dao.TurmaDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import modelo.Atividades;

import modelo.Turma;


public class VisualizarCardsAtividade extends javax.swing.JInternalFrame {
    
    private JDesktopPane jDesktopPane;
    
    public VisualizarCardsAtividade(JDesktopPane jDesktopPane, int idTurma) {
        this.jDesktopPane = jDesktopPane;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        initComponents();
        
        
        //Cria a scrollbar customizada vertical
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);
        
        preencherPane(idTurma);
    }

    public void preencherPane(int idTurma) {
        jLayeredPane1.removeAll();
        AtividadesDao atividadesDao = new AtividadesDao();
        int contador = 0;
        ArrayList<Atividades> listaAtividades = atividadesDao.buscarTodasAtividadesDaTurma(idTurma);
        for (int i = 0; i < listaAtividades.size() ; i++)
        {
            CardEditAtiv cardEditAtiv = new CardEditAtiv(listaAtividades.get(i), i+1, this);
            jLayeredPane1.add(cardEditAtiv);
            contador++;
        }
        
        jLayeredPane1.setPreferredSize(new Dimension(981, 584*contador/4));
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();    
    }
    
    public JDesktopPane getJDesktopPane() {
        return jDesktopPane;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setPreferredSize(new java.awt.Dimension(1018, 638));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(923, 481));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(981, 0));
        jLayeredPane1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 15));
        jScrollPane1.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

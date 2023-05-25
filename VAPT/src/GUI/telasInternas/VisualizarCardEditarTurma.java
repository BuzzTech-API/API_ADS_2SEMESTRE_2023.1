/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.card.CardDeTurma;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import GUI.card.CardEditarTurma;
import GUI.swing.ScrollBarCustom;
import dao.TurmaDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import modelo.Turma;

public class VisualizarCardEditarTurma extends javax.swing.JInternalFrame {

    private JDesktopPane jDesktopPane;
    
    public VisualizarCardEditarTurma(JDesktopPane jDesktopPane) {
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
        
        preencherPane();
        
    }

        public void preencherPane() {
        jLayeredPane1.removeAll();
        TurmaDao turmaDao = new TurmaDao();
        int contador = 0;
        ArrayList<Turma> listaTurma = turmaDao.getTurma();
        for (int i = 0; i < listaTurma.size() ; i++)
        {
            CardDeTurma cardDeTurma = new CardDeTurma(listaTurma.get(i), this);
            jLayeredPane1.add(cardDeTurma);
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

        setMaximumSize(new java.awt.Dimension(1018, 638));
        setMinimumSize(new java.awt.Dimension(1018, 638));
        setPreferredSize(new java.awt.Dimension(1018, 638));

        jScrollPane1.setBorder(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1018, 638));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1018, 638));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1018, 638));

        jLayeredPane1.setLayout(new java.awt.FlowLayout(20, 27, 25));
        jScrollPane1.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

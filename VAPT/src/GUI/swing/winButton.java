/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.swing;

import GUI.componentes.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 *
 * @author isaqu
 */
public class winButton extends javax.swing.JPanel {


    public winButton() {
        initComponents();
        setOpaque(false);
    }

    

    public void initEvent(JFrame frame, PanelBorda panel, Menu menu) {
          cmdClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
          });
          cmdMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setState(JFrame.ICONIFIED);
            }
          });
          cmdRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    menu.setRound(15);
                    panel.setRound(15);
                    frame.setExtendedState(JFrame.NORMAL);
                    
                } else {
                    menu.setRound(0);
                    panel.setRound(0);
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    
                }
            }
          });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdClose = new GUI.swing.MyButton();
        cmdMi = new GUI.swing.MyButton();
        cmdRe = new GUI.swing.MyButton();

        cmdClose.setColor(new java.awt.Color(255, 0, 0));
        cmdClose.setColorClicked(new java.awt.Color(255, 0, 0));
        cmdClose.setColorOver(new java.awt.Color(255, 51, 51));
        cmdClose.setPreferredSize(new java.awt.Dimension(20, 20));
        cmdClose.setRadius(20);

        cmdMi.setColor(new java.awt.Color(255, 204, 0));
        cmdMi.setColorClicked(new java.awt.Color(255, 255, 51));
        cmdMi.setColorOver(new java.awt.Color(255, 255, 0));
        cmdMi.setPreferredSize(new java.awt.Dimension(20, 20));
        cmdMi.setRadius(20);

        cmdRe.setColor(new java.awt.Color(0, 204, 0));
        cmdRe.setColorClicked(new java.awt.Color(51, 153, 0));
        cmdRe.setColorOver(new java.awt.Color(51, 255, 51));
        cmdRe.setPreferredSize(new java.awt.Dimension(20, 20));
        cmdRe.setRadius(20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton cmdClose;
    private GUI.swing.MyButton cmdMi;
    private GUI.swing.MyButton cmdRe;
    // End of variables declaration//GEN-END:variables
}

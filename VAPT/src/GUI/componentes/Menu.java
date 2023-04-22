/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.componentes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import GUI.swing.PanelBorda;
import GUI.telasInternas.Buscar;
import GUI.telasInternas.DetalheTurma;
import GUI.telasInternas.Editar;
import GUI.telasInternas.TelaHome;
import GUI.telasInternas.TiposDeCadastro;

/**
 *
 * @author isaqu
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    
    private JDesktopPane jDesktopPanel;
    
    private int round = 15;
    public Menu() {
        initComponents();
    }
    
    public Menu(JDesktopPane jDesktopPanel) {
        this.jDesktopPanel = jDesktopPanel;
        initComponents();
    }

    

    public void initWinButton(JFrame frame, PanelBorda panel) {
        winButton.initEvent(frame, panel, Menu.this);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        homeBtn = new GUI.swing.MyButton();
        cadastrarBtn = new GUI.swing.MyButton();
        editarBtn = new GUI.swing.MyButton();
        buscarBtn = new GUI.swing.MyButton();
        jLabel2 = new javax.swing.JLabel();
        winButton = new GUI.swing.winButton();

        setBackground(new java.awt.Color(2, 31, 54));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-Vindo!");

        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home2.png"))); // NOI18N
        homeBtn.setText("Home");
        homeBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        homeBtn.setMargin(new java.awt.Insets(2, -4, 3, 14));
        homeBtn.setRadius(15);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar2.png"))); // NOI18N
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadastrarBtn.setMargin(new java.awt.Insets(2, 26, 3, 14));
        cadastrarBtn.setRadius(15);
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        editarBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar2.png"))); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        editarBtn.setIconTextGap(9);
        editarBtn.setMargin(new java.awt.Insets(2, 0, 3, 14));
        editarBtn.setRadius(15);
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa2.png"))); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buscarBtn.setMargin(new java.awt.Insets(2, 0, 3, 14));
        buscarBtn.setRadius(15);
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 =(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        super.paintChildren(grphcs);
    }

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        TelaHome telaHome = new TelaHome(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(telaHome).setVisible(true);
        
    }//GEN-LAST:event_homeBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Buscar buscar = new Buscar();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(buscar).setVisible(true);
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        Editar editaBut = new Editar(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(editaBut).setVisible(true);
    }//GEN-LAST:event_editarBtnActionPerformed

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        TiposDeCadastro tipoDeCadastro = new TiposDeCadastro(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(tipoDeCadastro).setVisible(true);
    }//GEN-LAST:event_cadastrarBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton buscarBtn;
    private GUI.swing.MyButton cadastrarBtn;
    private GUI.swing.MyButton editarBtn;
    private GUI.swing.MyButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private GUI.swing.winButton winButton;
    // End of variables declaration//GEN-END:variables

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.componentes.CheckBoxContainer;
import GUI.swing.ScrollBarCustom;
import dao.TurmaDao;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Turma;

/**
 *
 * @author Fatec
 */
public class DetalheTurma extends javax.swing.JInternalFrame {

    private int id;
    private JDesktopPane jDesktopPane;
    
    public DetalheTurma() {
        initComponents();
        
    }
    
    public DetalheTurma(int id, JDesktopPane jDesktopPane) {
        this.jDesktopPane = jDesktopPane;
        initComponents();
        this.id = id;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);
        jScrollPane1.setHorizontalScrollBar(spHorizontal);
        TurmaDao turmaDao = new TurmaDao();
        Turma turma = turmaDao.buscarPorId(id);
        jLabel1.setText(jLabel1.getText()+ turma.getNome());
        jLabel2.setText(jLabel2.getText() + turma.getNome_escola());
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/Vector.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance( 25, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        myButton1.setIcon(scaledIcon);
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorda1 = new GUI.swing.PanelBorda();
        myButton1 = new GUI.swing.MyButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelBordaArredondadaComLinha1 = new GUI.swing.PanelBordaArredondadaComLinha();
        jScrollPane1 = new javax.swing.JScrollPane();
        atividadesPedentes1 = new GUI.componentes.AtividadesPedentes(2);
        panelBorda2 = new GUI.swing.PanelBorda();
        myButton2 = new GUI.swing.MyButton();

        setPreferredSize(new java.awt.Dimension(1018, 639));

        panelBorda1.setRound(30);

        myButton1.setBackground(new java.awt.Color(242, 242, 242));
        myButton1.setBorder(null);
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector.png"))); // NOI18N
        myButton1.setBorderColor(new java.awt.Color(242, 242, 242));
        myButton1.setBorderPainted(false);
        myButton1.setColor(new java.awt.Color(242, 242, 242));
        myButton1.setColorClicked(new java.awt.Color(102, 102, 102));
        myButton1.setColorOver(new java.awt.Color(204, 204, 204));
        myButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        myButton1.setRadius(30);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schoolred.png"))); // NOI18N
        jLabel2.setText("Escola:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 131, 84));
        jLabel1.setText("Turma: ");

        panelBordaArredondadaComLinha1.setPreferredSize(new java.awt.Dimension(937, 532));

        jScrollPane1.setViewportView(atividadesPedentes1);

        panelBorda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelBorda2Layout = new javax.swing.GroupLayout(panelBorda2);
        panelBorda2.setLayout(panelBorda2Layout);
        panelBorda2Layout.setHorizontalGroup(
            panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBorda2Layout.setVerticalGroup(
            panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBordaArredondadaComLinha1Layout = new javax.swing.GroupLayout(panelBordaArredondadaComLinha1);
        panelBordaArredondadaComLinha1.setLayout(panelBordaArredondadaComLinha1Layout);
        panelBordaArredondadaComLinha1Layout.setHorizontalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addGroup(panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelBorda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBordaArredondadaComLinha1Layout.setVerticalGroup(
            panelBordaArredondadaComLinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaArredondadaComLinha1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myButton2.setBackground(new java.awt.Color(239, 131, 84));
        myButton2.setForeground(new java.awt.Color(2, 30, 54));
        myButton2.setText("Salvar");
        myButton2.setColor(new java.awt.Color(239, 131, 84));
        myButton2.setColorClicked(new java.awt.Color(239, 131, 83));
        myButton2.setColorOver(new java.awt.Color(255, 139, 89));
        myButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        myButton2.setRadius(20);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorda1Layout = new javax.swing.GroupLayout(panelBorda1);
        panelBorda1.setLayout(panelBorda1Layout);
        panelBorda1Layout.setHorizontalGroup(
            panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorda1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addGroup(panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorda1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorda1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(panelBordaArredondadaComLinha1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(366, 366, 366))
        );
        panelBorda1Layout.setVerticalGroup(
            panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBordaArredondadaComLinha1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        TelaHome telaHome = new TelaHome(jDesktopPane);
        jDesktopPane.removeAll();
        jDesktopPane.add(telaHome).setVisible(true);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        
        JLayeredPane panelAtividadesPendentes = (JLayeredPane) atividadesPedentes1.getComponent(1);
        for (int i = 0; i < panelAtividadesPendentes.getComponentCount(); i++) {
            CheckBoxContainer checkBoxContainer = (CheckBoxContainer) panelAtividadesPendentes.getComponent(i);
            checkBoxContainer.alterarSelecionados();
        }
        
        
    }//GEN-LAST:event_myButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.componentes.AtividadesPedentes atividadesPedentes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.swing.MyButton myButton1;
    private GUI.swing.MyButton myButton2;
    private GUI.swing.PanelBorda panelBorda1;
    private GUI.swing.PanelBorda panelBorda2;
    private GUI.swing.PanelBordaArredondadaComLinha panelBordaArredondadaComLinha1;
    // End of variables declaration//GEN-END:variables
}

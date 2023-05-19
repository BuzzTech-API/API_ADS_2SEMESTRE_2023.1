/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import dao.AtividadesDao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.MaskFormatter;
import modelo.Atividades;
import modelo.Turma;

/**
 *
 * @author joice
 */
public class Editar extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroAtividades
     */
    MaskFormatter mfdata;
    javax.swing.JDesktopPane jDesktopPanel;
    private ArrayList<Turma> lista = new ArrayList<>();
    public Editar() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    
    public Editar(javax.swing.JDesktopPane jDesktopPanel) {
        this.jDesktopPanel = jDesktopPanel;
        initComponents();        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarTurma = new GUI.swing.MyButton();
        editarAtividade = new GUI.swing.MyButton();
        editarAluno = new GUI.swing.MyButton();

        setPreferredSize(new java.awt.Dimension(1018, 638));

        editarTurma.setBackground(new java.awt.Color(239, 131, 84));
        editarTurma.setBorder(new javax.swing.border.SoftBevelBorder(0));
        editarTurma.setForeground(new java.awt.Color(255, 255, 255));
        editarTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lapisbranco40px.png"))); // NOI18N
        editarTurma.setText("Editar Turma");
        editarTurma.setBorderPainted(false);
        editarTurma.setColor(new java.awt.Color(239, 131, 84));
        editarTurma.setColorClicked(new java.awt.Color(4, 171, 69));
        editarTurma.setColorOver(new java.awt.Color(4, 210, 130));
        editarTurma.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        editarTurma.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        editarTurma.setIconTextGap(28);
        editarTurma.setMargin(new java.awt.Insets(2, 30, 2, 14));
        editarTurma.setMaximumSize(new java.awt.Dimension(405, 78));
        editarTurma.setMinimumSize(new java.awt.Dimension(405, 78));
        editarTurma.setPreferredSize(new java.awt.Dimension(405, 78));
        editarTurma.setRadius(12);
        editarTurma.setRolloverEnabled(false);
        editarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTurmaActionPerformed(evt);
            }
        });

        editarAtividade.setBackground(new java.awt.Color(239, 131, 84));
        editarAtividade.setBorder(new javax.swing.border.SoftBevelBorder(0));
        editarAtividade.setForeground(new java.awt.Color(255, 255, 255));
        editarAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lapisbranco40px.png"))); // NOI18N
        editarAtividade.setText("Editar Atividade");
        editarAtividade.setBorderPainted(false);
        editarAtividade.setColor(new java.awt.Color(239, 131, 84));
        editarAtividade.setColorClicked(new java.awt.Color(4, 210, 130));
        editarAtividade.setColorOver(new java.awt.Color(4, 210, 130));
        editarAtividade.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        editarAtividade.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        editarAtividade.setIconTextGap(28);
        editarAtividade.setMargin(new java.awt.Insets(2, 30, 2, 14));
        editarAtividade.setPreferredSize(new java.awt.Dimension(397, 78));
        editarAtividade.setRadius(12);
        editarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAtividadeActionPerformed(evt);
            }
        });

        editarAluno.setBackground(new java.awt.Color(239, 131, 84));
        editarAluno.setBorder(new javax.swing.border.SoftBevelBorder(0));
        editarAluno.setForeground(new java.awt.Color(255, 255, 255));
        editarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lapisbranco40px.png"))); // NOI18N
        editarAluno.setText("Editar Aluno");
        editarAluno.setBorderPainted(false);
        editarAluno.setColor(new java.awt.Color(239, 131, 84));
        editarAluno.setColorClicked(new java.awt.Color(4, 210, 130));
        editarAluno.setColorOver(new java.awt.Color(4, 210, 130));
        editarAluno.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        editarAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        editarAluno.setIconTextGap(28);
        editarAluno.setMargin(new java.awt.Insets(2, 30, 2, 14));
        editarAluno.setPreferredSize(new java.awt.Dimension(397, 78));
        editarAluno.setRadius(12);
        editarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(editarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editarAluno, editarAtividade, editarTurma});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(editarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(editarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(editarAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editarAluno, editarAtividade, editarTurma});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTurmaActionPerformed
        VisualizarCardEditarTurma visualizarCardEditarTurma = new VisualizarCardEditarTurma(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add( visualizarCardEditarTurma).setVisible(true);
        
    }//GEN-LAST:event_editarTurmaActionPerformed

    private void editarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAtividadeActionPerformed
        BuscaAtivEdicao buscaAtivEdicao = new BuscaAtivEdicao(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add( buscaAtivEdicao).setVisible(true);

    }//GEN-LAST:event_editarAtividadeActionPerformed

    private void editarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAlunoActionPerformed
        BuscarAlunoParaEdicao buscaAluEdit = new BuscarAlunoParaEdicao(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add( buscaAluEdit).setVisible(true);
    }//GEN-LAST:event_editarAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton editarAluno;
    private GUI.swing.MyButton editarAtividade;
    private GUI.swing.MyButton editarTurma;
    // End of variables declaration//GEN-END:variables
}

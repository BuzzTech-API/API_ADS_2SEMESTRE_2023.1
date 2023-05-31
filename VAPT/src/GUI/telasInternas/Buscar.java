/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import GUI.card.CardDeTurma;
import GUI.swing.ScrollBarCustom;
import dao.TurmaDao;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import modelo.Turma;

/**
 *
 * @author DELL
 */
public class Buscar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Buscar
     */
    
    JDesktopPane jDesktopPane;
    public Buscar(JDesktopPane jDesktopPane) {
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
        for (Turma turma : turmaDao.getTurma()) {
            CardDeTurma cardDeTurma = new CardDeTurma(turma,this);
            cardDeTurma.addMouseListener(new  MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    DetalheTurma detalheTurma = new DetalheTurma(turma.getId_turma(), jDesktopPane);
                    jDesktopPane.removeAll();
                    jDesktopPane.add(detalheTurma).setVisible(true);
                }
                public void mouseEntered(MouseEvent e) {
                    cardDeTurma.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    cardDeTurma.setBackground(new Color(204,204,204));
                }
                public void mouseExited(MouseEvent e) {
                    cardDeTurma.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    cardDeTurma.setBackground(new Color(252,252,252));
                }
            });
            jLayeredPane1.add(cardDeTurma);
            contador++;
        }
        
        jLayeredPane1.setPreferredSize(new Dimension(1006, 291*contador/4));
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();  
    }
    
    public void preencherPane(ArrayList<Turma> listaTurma) {
        jLayeredPane1.removeAll();
        int contador = 0;
        for (Turma turma : listaTurma) {
            CardDeTurma cardDeTurma = new CardDeTurma(turma, this);
            cardDeTurma.addMouseListener(new  MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    DetalheTurma detalheTurma = new DetalheTurma(turma.getId_turma(), jDesktopPane);
                    jDesktopPane.removeAll();
                    jDesktopPane.add(detalheTurma).setVisible(true);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    cardDeTurma.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    cardDeTurma.setBackground(new Color(204,204,204));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    cardDeTurma.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    cardDeTurma.setBackground(new Color(252,252,252));
                }
            });
            jLayeredPane1.add(cardDeTurma);
            contador++;
        }
        
        jLayeredPane1.setPreferredSize(new Dimension(1006, 200*contador/4));
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarAluno = new javax.swing.JTextField();
        pesquisaBut = new GUI.swing.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setPreferredSize(new java.awt.Dimension(1018, 638));

        buscarAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscarAluno.setForeground(new java.awt.Color(102, 102, 102));
        buscarAluno.setToolTipText("Buscar Aluno");
        buscarAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 122, 163), 1, true));
        buscarAluno.setName("buscarAluno"); // NOI18N
        buscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlunoActionPerformed(evt);
            }
        });

        pesquisaBut.setText("Pesquisar");
        pesquisaBut.setColorOver(new java.awt.Color(204, 204, 204));
        pesquisaBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pesquisaBut.setRadius(10);
        pesquisaBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pesquisaButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pesquisaButMouseExited(evt);
            }
        });
        pesquisaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaButActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(923, 481));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1006, 0));
        jLayeredPane1.setLayout(new java.awt.FlowLayout(0, 15, 15));
        jScrollPane1.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(buscarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisaBut, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarAluno)
                    .addComponent(pesquisaBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlunoActionPerformed
        TurmaDao turmaDao = new TurmaDao();
        jLayeredPane1.removeAll();
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
        if (buscarAluno.equals("")) {
            preencherPane();
        } else {
            preencherPane(turmaDao.buscarPorNome(buscarAluno.getText()));
        }
        
    }//GEN-LAST:event_buscarAlunoActionPerformed

    private void pesquisaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaButActionPerformed
        TurmaDao turmaDao = new TurmaDao();
        jLayeredPane1.removeAll();
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint(); 
        if (buscarAluno.equals("")) {
            preencherPane();
        } else {
            preencherPane(turmaDao.buscarPorNome(buscarAluno.getText()));
        }
    }//GEN-LAST:event_pesquisaButActionPerformed

    private void pesquisaButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaButMouseEntered
        pesquisaBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pesquisaButMouseEntered

    private void pesquisaButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaButMouseExited
        pesquisaBut.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_pesquisaButMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarAluno;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.swing.MyButton pesquisaBut;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getJDesktopPane() {
        return this.jDesktopPane;
    }
}

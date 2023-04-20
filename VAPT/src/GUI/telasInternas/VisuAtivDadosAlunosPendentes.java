/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.swing.ScrollBarCustom;
import dao.Aluno_AtividadeDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Aluno_Atividade;
import modelo.Atividades;
import modelo.Turma;

/**
 *
 * @author joice
 */
public class VisuAtivDadosAlunosPendentes extends javax.swing.JInternalFrame {
    /*peguei dos cards*/
    private Atividades atividade = new Atividades();
    private JDesktopPane jDesktopPane;
    private JDesktopPane jDesktopPanePrincipal;
    private ArrayList<Aluno_Atividade> listaAluno_Atividades = new ArrayList<>();
    private Turma turma = new Turma();

    /**
     * Creates new form VisuAtivDadosAlunosPendentes
     */
    public VisuAtivDadosAlunosPendentes(ArrayList<Aluno_Atividade> listaAluno_Atividades, JDesktopPane jDesktopPane , JDesktopPane jDesktopPanePrincipal ) {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        /*importado do card*/
         this.jDesktopPane = jDesktopPane;
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);
        jScrollPane1.setHorizontalScrollBar(spHorizontal);
        this.jDesktopPanePrincipal = jDesktopPanePrincipal;
        this.listaAluno_Atividades = listaAluno_Atividades;
        prencherTextArea();
        
        /*importado do card até aqui*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editAlunosPendesntes = new javax.swing.JButton();
        recebPorcentagemAlunosPendentes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(742, 240));

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        editAlunosPendesntes.setBackground(new java.awt.Color(236, 236, 236));
        editAlunosPendesntes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        editAlunosPendesntes.setBorder(null);
        editAlunosPendesntes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editAlunosPendesntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlunosPendesntesActionPerformed(evt);
            }
        });

        recebPorcentagemAlunosPendentes.setBackground(new java.awt.Color(236, 236, 236));
        recebPorcentagemAlunosPendentes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        recebPorcentagemAlunosPendentes.setForeground(new java.awt.Color(255, 0, 0));
        recebPorcentagemAlunosPendentes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebPorcentagemAlunosPendentes.setText("10%");
        recebPorcentagemAlunosPendentes.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("pendente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(editAlunosPendesntes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(recebPorcentagemAlunosPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(recebPorcentagemAlunosPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(editAlunosPendesntes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.setBackground(new java.awt.Color(236, 236, 236));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(455, 256));
        jLayeredPane1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane1.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editAlunosPendesntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlunosPendesntesActionPerformed
        
    }//GEN-LAST:event_editAlunosPendesntesActionPerformed
 private void prencherTextArea(){
      int contador=0;
        for (Aluno_Atividade aluno_Atividade : listaAluno_Atividades) {
            if (!aluno_Atividade.getAluno_Ativadade_entrega()) {
                JLabel jlabel = new JLabel();
                jlabel.setFont(new Font("Arial", 1 ,16));
                jlabel.setBackground(new Color(236,236,236));
                jlabel.setHorizontalAlignment(JLabel.LEFT);
                jlabel.setText(aluno_Atividade.getAluno().getNome());
                for (int i = jlabel.getText().length(); i < 50; i++) {
                    jlabel.setText(jlabel.getText()+" ");
                }
                jlabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        AtividadeDadosAluno atividadeDadosAluno = new AtividadeDadosAluno(aluno_Atividade.getAluno());
                        jDesktopPanePrincipal.removeAll();
                        jDesktopPanePrincipal.add(atividadeDadosAluno).setVisible(true);
                    }
                    
                });
                
                jLayeredPane1.add(jlabel);
                contador++;
            }
        } 
        
         float porcentagem = (float) contador / listaAluno_Atividades.size();
        porcentagem *= 100;
        if(porcentagem == 0.0){
        recebPorcentagemAlunosPendentes.setText("100% Entregue");
        }else{
        String porcetagemString = String.format("%.2f ", porcentagem);
        porcetagemString+="%";
        recebPorcentagemAlunosPendentes.setText(porcetagemString);
        }
 
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editAlunosPendesntes;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recebPorcentagemAlunosPendentes;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.popup;

import GUI.telasInternas.CadastrarTurma;
import dao.Dia_SemanaDao;
import dao.TurmaDao;
import modelo.Dia_Semana;
import modelo.Turma;

/**
 *
 * @author Alicea
 */
public class PopupConfirmCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form PopupConfirmCadastrar
     */
    public PopupConfirmCadastrar() {
        initComponents();
    
    }
    
    private Turma turma;
    private CadastrarTurma cadastrarTurma;
    
    public PopupConfirmCadastrar(Turma turma, CadastrarTurma cadastrarTurma){
        this.turma = turma;
        
        this.cadastrarTurma = cadastrarTurma;
        
        initComponents();
        nomeTurma.setText(turma.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myButton1 = new GUI.swing.MyButton();
        jPanel1 = new javax.swing.JPanel();
        texto1 = new javax.swing.JLabel();
        nomeTurma = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        botaoCadastrar = new GUI.swing.MyButton();
        botaoCancelar = new GUI.swing.MyButton();

        myButton1.setText("myButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 93, 117), 2, true));
        jPanel1.setForeground(new java.awt.Color(79, 93, 117));
        jPanel1.setMaximumSize(new java.awt.Dimension(410, 173));
        jPanel1.setMinimumSize(new java.awt.Dimension(410, 173));

        texto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto1.setText("Tem certeza que deseja cadastrar \"");

        nomeTurma.setEditable(false);
        nomeTurma.setBackground(new java.awt.Color(242, 242, 242));
        nomeTurma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeTurma.setText("Turma 6 A");
        nomeTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTurmaActionPerformed(evt);
            }
        });

        texto2.setBackground(new java.awt.Color(217, 217, 217));
        texto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto2.setText("\" ? ");

        botaoCadastrar.setBackground(new java.awt.Color(239, 131, 84));
        botaoCadastrar.setForeground(new java.awt.Color(2, 30, 54));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setColor(new java.awt.Color(239, 131, 84));
        botaoCadastrar.setColorOver(new java.awt.Color(204, 204, 204));
        botaoCadastrar.setFocusPainted(false);
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(98, 30));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(98, 30));
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(98, 30));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCancelar.setForeground(new java.awt.Color(2, 30, 54));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setColor(new java.awt.Color(255, 255, 255));
        botaoCancelar.setColorOver(new java.awt.Color(204, 204, 204));
        botaoCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCancelar.setMaximumSize(new java.awt.Dimension(98, 30));
        botaoCancelar.setMinimumSize(new java.awt.Dimension(98, 30));
        botaoCancelar.setPreferredSize(new java.awt.Dimension(98, 30));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(texto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1)
                    .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTurmaActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        TurmaDao turmaDao = new TurmaDao();
        if (!turmaDao.jaExisteTurma(turma)) {
            turmaDao.adicionar(turma);

            turma.setId_turma(turmaDao.pesquisarPorNomeEEscola(turma.getNome(), turma.getNome_escola()));
            Dia_SemanaDao dia_SemanaDao = new Dia_SemanaDao();
            if (cadastrarTurma.getjCheckBox1().isSelected()) {
                Dia_Semana dia_Semana = new Dia_Semana();
                dia_Semana.setTurma_id_turma(turma.getId_turma());
                dia_Semana.setDia("Segunda");
                dia_Semana.setHora_inicio(cadastrarTurma.getSegIni().getText());
                dia_Semana.setHora_fim(cadastrarTurma.getSegFim().getText());
                dia_SemanaDao.adicionar(dia_Semana);
            }
            if (cadastrarTurma.getjCheckBox2().isSelected()) {
                Dia_Semana dia_Semana = new Dia_Semana();
                dia_Semana.setTurma_id_turma(turma.getId_turma());
                dia_Semana.setDia("Terça");
                dia_Semana.setHora_inicio(cadastrarTurma.getTerIni().getText());
                dia_Semana.setHora_fim(cadastrarTurma.getTerFim().getText());
                dia_SemanaDao.adicionar(dia_Semana);
            }
            if (cadastrarTurma.getjCheckBox3().isSelected()) {
                Dia_Semana dia_Semana = new Dia_Semana();
                dia_Semana.setTurma_id_turma(turma.getId_turma());
                dia_Semana.setDia("Quarta");
                dia_Semana.setHora_inicio(cadastrarTurma.getQuaIni().getText());
                dia_Semana.setHora_fim(cadastrarTurma.getQuaFim().getText());
                dia_SemanaDao.adicionar(dia_Semana);
            }
            if (cadastrarTurma.getjCheckBox4().isSelected()) {
                Dia_Semana dia_Semana = new Dia_Semana();
                dia_Semana.setTurma_id_turma(turma.getId_turma());
                dia_Semana.setDia("Quinta");
                dia_Semana.setHora_inicio(cadastrarTurma.getQuiIni().getText());
                dia_Semana.setHora_fim(cadastrarTurma.getQuiFim().getText());
                dia_SemanaDao.adicionar(dia_Semana);
            }
            if (cadastrarTurma.getjCheckBox5().isSelected()) {
                Dia_Semana dia_Semana = new Dia_Semana();
                dia_Semana.setTurma_id_turma(turma.getId_turma());
                dia_Semana.setDia("Sexta");
                dia_Semana.setHora_inicio(cadastrarTurma.getSexIni().getText());
                dia_Semana.setHora_fim(cadastrarTurma.getSexFim().getText());
                dia_SemanaDao.adicionar(dia_Semana);
            }
        } 
        cadastrarTurma.getNomeTurma().setText("");
        cadastrarTurma.getNomeDaEscola().setText("");
        cadastrarTurma.getjCheckBox1().setSelected(false);
        cadastrarTurma.getjCheckBox2().setSelected(false);
        cadastrarTurma.getjCheckBox3().setSelected(false);
        cadastrarTurma.getjCheckBox4().setSelected(false);
        cadastrarTurma.getjCheckBox5().setSelected(false);
        cadastrarTurma.getQuaFim().setText("");
        cadastrarTurma.getQuaIni().setText("");
        cadastrarTurma.getQuiFim().setText("");
        cadastrarTurma.getQuiIni().setText("");
        cadastrarTurma.getSegFim().setText("");
        cadastrarTurma.getSegIni().setText("");
        cadastrarTurma.getSexFim().setText("");
        cadastrarTurma.getSexIni().setText("");
        cadastrarTurma.getTerFim().setText("");
        cadastrarTurma.getTerIni().setText("");
       
        
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopupConfirmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupConfirmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupConfirmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupConfirmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopupConfirmCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton botaoCadastrar;
    private GUI.swing.MyButton botaoCancelar;
    private javax.swing.JPanel jPanel1;
    private GUI.swing.MyButton myButton1;
    private javax.swing.JTextField nomeTurma;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}

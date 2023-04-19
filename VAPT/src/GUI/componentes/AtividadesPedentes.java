/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.componentes;

import java.util.ArrayList;

import GUI.swing.CheckBox;
import dao.Aluno_AtividadeDao;
import dao.TurmaDao;
import modelo.Aluno_Atividade;
import modelo.Aluno;
import modelo.Atividades;
import modelo.Turma;

/**
 *
 * @author isaqu
 */
public class AtividadesPedentes extends javax.swing.JPanel {

    private int id;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public AtividadesPedentes() {
        initComponents();
        setOpaque(false);
        
    }


    public AtividadesPedentes(int id) {
        initComponents();
        setOpaque(false);
        preencherPanel();
        this.id = id;
        
        
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorda1 = new GUI.swing.PanelBorda();
        panelBorda2 = new GUI.swing.PanelBorda();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelBorda3 = new GUI.swing.PanelBorda();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        

        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        jTextArea1.setSelectedTextColor(new java.awt.Color(242, 242, 242));
        jTextArea1.setSelectionColor(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelBorda2Layout = new javax.swing.GroupLayout(panelBorda2);
        panelBorda2.setLayout(panelBorda2Layout);
        panelBorda2Layout.setHorizontalGroup(
            panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
            .addGroup(panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        panelBorda2Layout.setVerticalGroup(
            panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(panelBorda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        javax.swing.GroupLayout panelBorda3Layout = new javax.swing.GroupLayout(panelBorda3);
        panelBorda3.setLayout(panelBorda3Layout);
        panelBorda3Layout.setHorizontalGroup(
            panelBorda3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        panelBorda3Layout.setVerticalGroup(
            panelBorda3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 30, 54));
        jLabel1.setText("Atividades Pendentes:");

        javax.swing.GroupLayout panelBorda1Layout = new javax.swing.GroupLayout(panelBorda1);
        panelBorda1.setLayout(panelBorda1Layout);
        panelBorda1Layout.setHorizontalGroup(
            panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addGroup(panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorda1Layout.createSequentialGroup()
                        .addComponent(panelBorda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panelBorda3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorda1Layout.setVerticalGroup(
            panelBorda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorda1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelBorda3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBorda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void preencherPanel() {
        TurmaDao turmaDao = new TurmaDao();
        Turma turma = turmaDao.buscarPorId(id);
        turma.buscarAtividades();
        ArrayList<Aluno> listaAlundo = turma.getAlunosDaTurma();
        ArrayList<Atividades> listaAtividades = turma.getAtividadesDaTurma();
        for (Aluno aluno : listaAlundo) {
            jTextArea1.setText(jTextArea1.getText()+aluno.getNome()+"\n");
        }
        for (int i = 0; i < listaAtividades.size(); i++ ) {
            Aluno_AtividadeDao aluno_AtividadeDao = new Aluno_AtividadeDao();
            Atividades atividades = listaAtividades.get(i);
            ArrayList<Aluno_Atividade> aluno_Atividade = aluno_AtividadeDao.buscarAlunosDeUmaAtividade(atividades.getId_atividade());  
            CheckBoxContainer checkBoxContainer = new CheckBoxContainer(i+1);
            checkBoxContainer.preencherLayeredPane(aluno_Atividade);
            jLayeredPane2.add(checkBoxContainer);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private GUI.swing.PanelBorda panelBorda1;
    private GUI.swing.PanelBorda panelBorda2;
    private GUI.swing.PanelBorda panelBorda3;
    // End of variables declaration//GEN-END:variables
}

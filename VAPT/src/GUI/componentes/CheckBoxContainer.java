

package GUI.componentes;

import java.util.ArrayList;

import GUI.swing.CheckBox;
import modelo.Aluno_Atividade;

public class CheckBoxContainer extends javax.swing.JPanel {

    

    public CheckBoxContainer(int numeroAtividade) {
        initComponents();
        jLabel1.setText(""+numeroAtividade);
    }

    public void preencherLayeredPane(ArrayList<Aluno_Atividade> listaAluno_Atividades) {
        
        for (Aluno_Atividade aluno_Atividade : listaAluno_Atividades) {
            CheckBox checkBox = new CheckBox();
            checkBox.setAluno_id(aluno_Atividade.getAluno().getId_aluno());
            checkBox.setAtividade_id(aluno_Atividade.getAluno().getId_aluno());
            checkBox.setText("");
            if (aluno_Atividade.getAluno_Ativadade_entrega()) {
                checkBox.setSelected(true);
            }
            jLayeredPane1.add(checkBox);
        }
    }

    public void alterarSelecionados() {
        for (int i = 0; i < jLayeredPane1.getComponentCount(); i++) {
            CheckBox checkBoxContainer = (CheckBox) jLayeredPane1.getComponent(i);
            if (checkBoxContainer.isSelected()) {
                System.out.println("isaque é lindo");
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}

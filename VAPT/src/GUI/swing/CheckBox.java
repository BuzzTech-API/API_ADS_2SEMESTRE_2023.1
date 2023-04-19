
package GUI.swing;

import javax.swing.JCheckBox;

public class CheckBox extends JCheckBox{
    private int aluno_id;
    private int atividade_id;


    public CheckBox() {
    }


    public CheckBox(int aluno_id, int atividade_id) {
        this.aluno_id = aluno_id;
        this.atividade_id = atividade_id;
    }


    public int getAluno_id() {
        return this.aluno_id;
    }

    public void setAluno_id(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public int getAtividade_id() {
        return this.atividade_id;
    }

    public void setAtividade_id(int atividade_id) {
        this.atividade_id = atividade_id;
    }

}

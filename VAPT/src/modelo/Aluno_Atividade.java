package modelo;

public class Aluno_Atividade {
    
    private int aluno_id_aluno;
    private int atividade_id_atividade;
    private boolean aluno_Ativadade_entrega;
    private java.sql.Date aluno_Atividade_data_entrega;


    public Aluno_Atividade() {
    }


    public Aluno_Atividade(int aluno_id_aluno, int atividade_id_atividade, boolean aluno_Ativadade_entrega, java.sql.Date aluno_Atividade_data_entrega) {
        this.aluno_id_aluno = aluno_id_aluno;
        this.atividade_id_atividade = atividade_id_atividade;
        this.aluno_Ativadade_entrega = aluno_Ativadade_entrega;
        this.aluno_Atividade_data_entrega = aluno_Atividade_data_entrega;
    }


    public int getAluno_id_aluno() {
        return this.aluno_id_aluno;
    }

    public void setAluno_id_aluno(int aluno_id_aluno) {
        this.aluno_id_aluno = aluno_id_aluno;
    }

    public int getAtividade_id_atividade() {
        return this.atividade_id_atividade;
    }

    public void setAtividade_id_atividade(int atividade_id_atividade) {
        this.atividade_id_atividade = atividade_id_atividade;
    }

    public boolean isAluno_Ativadade_entrega() {
        return this.aluno_Ativadade_entrega;
    }

    public boolean getAluno_Ativadade_entrega() {
        return this.aluno_Ativadade_entrega;
    }

    public void setAluno_Ativadade_entrega(boolean aluno_Ativadade_entrega) {
        this.aluno_Ativadade_entrega = aluno_Ativadade_entrega;
    }

    public java.sql.Date getAluno_Atividade_data_entrega() {
        return this.aluno_Atividade_data_entrega;
    }

    public void setAluno_Atividade_data_entrega(java.sql.Date aluno_Atividade_data_entrega) {
        this.aluno_Atividade_data_entrega = aluno_Atividade_data_entrega;
    }


}

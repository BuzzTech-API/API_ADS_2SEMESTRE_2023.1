package modelo;

public class Aluno_Atividade {
    
    private Aluno aluno;
    private Atividades atividade;
    private boolean aluno_Ativadade_entrega;
    private java.sql.Date aluno_Atividade_data_entrega;



    public Aluno_Atividade() {
    }

    public Aluno_Atividade(Aluno aluno, Atividades atividade, boolean aluno_Ativadade_entrega, java.sql.Date aluno_Atividade_data_entrega) {
        this.aluno = aluno;
        this.atividade = atividade;
        this.aluno_Ativadade_entrega = aluno_Ativadade_entrega;
        this.aluno_Atividade_data_entrega = aluno_Atividade_data_entrega;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividades getAtividade() {
        return this.atividade;
    }

    public void setAtividade(Atividades atividade) {
        this.atividade = atividade;
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


    @Override
    public String toString() {
        return "{" +
            " aluno='" + getAluno() + "'" +
            ", atividade='" + getAtividade() + "'" +
            ", aluno_Ativadade_entrega='" + isAluno_Ativadade_entrega() + "'" +
            ", aluno_Atividade_data_entrega='" + getAluno_Atividade_data_entrega() + "'" +
            "}";
    }

    public Aluno_Atividade get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

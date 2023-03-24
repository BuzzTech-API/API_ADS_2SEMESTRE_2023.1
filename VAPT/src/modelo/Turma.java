package modelo;

public class Turma {
    private int id_turma;
    private String nome;
    private String nome_escola;



    public Turma() {
    }

    public Turma(int id_turma, String nome, String nome_escola) {
        this.id_turma = id_turma;
        this.nome = nome;
        this.nome_escola = nome_escola;
    }

    public int getId_turma() {
        return this.id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_escola() {
        return this.nome_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }


}

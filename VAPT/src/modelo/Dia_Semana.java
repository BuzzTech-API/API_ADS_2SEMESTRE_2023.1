package modelo;

public class Dia_Semana {
    
    private int id_dia;
    private int turma_id_turma;
    private String dia;
    private String hora_inicio;
    private String hora_fim;




    public Dia_Semana() {
    }


    public Dia_Semana(int id_dia, int turma_id_turma, String dia, String hora_inicio, String hora_fim) {
        this.id_dia = id_dia;
        this.turma_id_turma = turma_id_turma;
        this.dia = dia;
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
    }


    public int getId_dia() {
        return this.id_dia;
    }

    public void setId_dia(int id_dia) {
        this.id_dia = id_dia;
    }

    public int getTurma_id_turma() {
        return this.turma_id_turma;
    }

    public void setTurma_id_turma(int turma_id_turma) {
        this.turma_id_turma = turma_id_turma;
    }

    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora_inicio() {
        return this.hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fim() {
        return this.hora_fim;
    }

    public void setHora_fim(String hora_fim) {
        this.hora_fim = hora_fim;
    }



}

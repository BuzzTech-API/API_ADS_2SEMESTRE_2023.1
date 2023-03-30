package modelo;

import java.sql.Date;

import dao.AtividadesDao;

public class Atividades {
    private int id_atividade;
    private String tipo;
    private String descricao;
    private Date data_inicio;
    private Date data_fim;
    private int turma_id_turma;


    public Atividades() {
    }



    public Atividades(int id_atividade, String tipo, String descricao, Date data_inicio, Date data_fim, int turma_id_turma) {
        this.id_atividade = id_atividade;
        this.tipo = tipo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.turma_id_turma = turma_id_turma;
    }

    public int getTurma_id_turma() {
        return this.turma_id_turma;
    }

    public void setTurma_id_turma(int turma_id_turma) {
        this.turma_id_turma = turma_id_turma;
    }


    public int getId_atividade() {
        return this.id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_inicio() {
        return this.data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return this.data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public void puxarIdDoBanco() {
        AtividadesDao atividadesDao = new AtividadesDao();
        this.setId_atividade(atividadesDao.pesquisarPorDadosDaAtividade(getTipo(), getDescricao(), getData_inicio(), getData_fim(),getTurma_id_turma()));
    }

}

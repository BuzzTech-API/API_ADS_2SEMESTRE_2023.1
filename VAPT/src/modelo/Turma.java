package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dao.AlunoDao;
import dao.AtividadesDao;
import dao.TurmaDao;

public class Turma {


    private int id_turma;
    private String nome;
    private String nome_escola;
    private ArrayList<Atividades> atividadesDaTurma;
    private ArrayList<Aluno> alunosDaTurma;



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


    public ArrayList<Atividades> getAtividadesDaTurma() {
        return this.atividadesDaTurma;
    }

    public void setAtividadesDaTurma(ArrayList<Atividades> atividadesDaTurma) {
        this.atividadesDaTurma = atividadesDaTurma;
    }

    public void atribuirIdDoBanco() {
        TurmaDao turmaDao = new TurmaDao();
        setId_turma(turmaDao.pesquisarPorNomeEEscola(this.getNome(), this.getNome_escola()));
        if (id_turma==0) {
            JOptionPane.showMessageDialog(null, "Turma não cadastrada");
        }
    }

    public void buscarAtividades() {
        atribuirIdDoBanco();
        if (id_turma!=0) {
            AtividadesDao atividadesDao = new AtividadesDao();
            this.atividadesDaTurma = atividadesDao.buscarTodasAtividadesDaTurma(this.id_turma);
            
        }

    }

    public ArrayList<Aluno> getAlunosDaTurma() {
        AlunoDao alunoDao = new AlunoDao();
        this.alunosDaTurma = alunoDao.buscarTodasAlunoDaTurma(id_turma);
        return this.alunosDaTurma;
    }


}

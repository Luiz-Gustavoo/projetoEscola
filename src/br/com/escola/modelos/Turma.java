package br.com.escola.modelos;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private String nome;
    private List<Materia> materias;
    private List<Aluno> alunos;

    public Turma(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.materias = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setAlunos(Aluno aluno) {
       alunos.add(aluno);
    }

    public void setMaterias(Materia materia) {
        materias.add(materia);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}

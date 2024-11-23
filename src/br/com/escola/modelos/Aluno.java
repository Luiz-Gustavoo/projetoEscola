package br.com.escola.modelos;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Turma turma;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return this.getNome().compareTo(outroAluno.getNome());
    }

    @Override
    public String toString() {
        return turma.getNome() + " " + this.nome;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


}

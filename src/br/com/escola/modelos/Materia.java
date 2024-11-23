package br.com.escola.modelos;

public class Materia implements Comparable<Materia> {
    private String nome;

    public Materia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Materia outraMateria) {
        return this.getNome().compareTo(outraMateria.getNome());
    }
}

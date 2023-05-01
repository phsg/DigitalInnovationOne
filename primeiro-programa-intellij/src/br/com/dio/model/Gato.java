package br.com.dio.model;

import java.util.Objects;

public class Gato {

    private String cor;
    private String nome;
    private Integer idade;

    public Gato(String cor, String nome, Integer idade) {
        this.cor = cor;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gato)) return false;
        Gato gato = (Gato) o;
        return getCor().equals(gato.getCor()) && getNome().equals(gato.getNome()) && getIdade().equals(gato.getIdade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCor(), getNome(), getIdade());
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

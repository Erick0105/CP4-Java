package models;

import enums.GeneroJogoEnum;
import java.util.ArrayList;

public class Jogos {

    //Atributos
    private String nome;
    private int lancamento;
    private double preco;
    private GeneroJogoEnum genero;
    private Boolean sequencia;
    private ArrayList<String> plataforma;


    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getLancamento() {
        return lancamento;
    }
    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }


    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


    public GeneroJogoEnum getGenero() {
        return genero;
    }
    public void setGenero(GeneroJogoEnum genero) {
        this.genero = genero;
    }


    public Boolean getSequencia() {
        return sequencia;
    }
    public void setSequencia(Boolean sequencia) {
        this.sequencia = sequencia;
    }


    public ArrayList<String> getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(ArrayList<String> plataforma) {
        this.plataforma = plataforma;
    }
}

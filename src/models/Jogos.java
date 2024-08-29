package models;

import enums.GeneroJogoEnum;
import enums.PlataformasEnum;

import java.util.ArrayList;

public class Jogos {

    //Atributos
    private int id;
    private String nome;
    private int lancamento;
    private double preco;
    private GeneroJogoEnum genero;
    private Boolean sequencia;
    private PlataformasEnum plataforma;

    //Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public PlataformasEnum getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformasEnum plataforma) {
        this.plataforma = plataforma;
    }
}

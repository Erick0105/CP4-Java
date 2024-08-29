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

    public Jogos(int id, String nome, int lancamento, double preco, GeneroJogoEnum genero, PlataformasEnum plataforma){
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
        this.preco = preco;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public int getLancamento() {
        return lancamento;
    }

    public double getPreco() {
        return preco;
    }

    public GeneroJogoEnum getGenero() {
        return genero;
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
}

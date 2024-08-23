package models;

import enums.GeneroJogoEnum;
import java.util.ArrayList;

public class Jogos {

    //Atributos
    private String id;
    private String nome;
    private int lancamento;
    private double preco;
    private GeneroJogoEnum genero;
    private Boolean sequencia;
    private ArrayList<String> plataforma;
    private ArrayList<String> games;


    //Getters e Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
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


    public ArrayList<String> getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(ArrayList<String> plataforma) {
        this.plataforma = plataforma;
    }

    public ArrayList<String> getGames() {return games;}
    public void setGames(ArrayList<String> games) {
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
        this.preco = preco;
        this.genero = genero;
        this.sequencia = sequencia;
    }
}

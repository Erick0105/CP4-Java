package models;


import java.util.ArrayList;


public class ContagemRegistros {

    //Atributos
    private static int qtdJogos;
    private static ArrayList<Jogos> listaJogos = new ArrayList<>();

    //Getters e Setters
    public static int getQtdJogos() {
        return qtdJogos;
    }
    public static void setQtdJogos(int qtdJogos) {
        ContagemRegistros.qtdJogos = qtdJogos;
    }

    public static ArrayList<Jogos> getListaJogos() {
        return listaJogos;
    }
    public static void setListaJogos(ArrayList<Jogos> listaJogos) {
        ContagemRegistros.listaJogos = listaJogos;
    }

    //Metodos Gerais
    public static void resgistrarJogo(Jogos novoJogo){
        qtdJogos += 1;
        listaJogos.add(novoJogo);
    }
}

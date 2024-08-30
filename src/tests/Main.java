package tests;

import enums.GeneroJogoEnum;
import enums.PlataformasEnum;
import models.ContagemRegistros;
import models.Jogos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogos> listGames = new ArrayList<>();
        Jogos novoJogo = new Jogos();

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println();
            String msg = "------------------- MENU ----------------------";
            System.out.println(msg +
                    "\n0- Sair" +
                    "\n1- Cadastrar" +
                    "\n2- Listar" +
                    "\n3- Consultar por codigo" +
                    "\n4- Consultar por xxx" +
                    "\n5- Alterar" +
                    "\n6- Excluir" +
                    "\n----------------------------------------------" +
                    "\nDigite a opção desejada: ");
            int op = leitor.nextInt();

            if (op == 0) {
                System.out.println("Volte sempre :) ");
                break;

            } else if (op == 1) {
                novoJogo.cadastrarJogo();
                ContagemRegistros.resgistrarJogo(novoJogo);

            } else if (op == 2) {
                System.out.println("Jogos listados:");
                listGames = ContagemRegistros.getListaJogos();
                for (Jogos jogos : listGames){
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println( jogos.getId() + " - " + jogos.getNome() + " - " + jogos.getLancamento() + " - " + jogos.getPreco() + " - " + jogos.getGenero() + " - " + jogos.getPlataforma());
                    System.out.println("------------------------------------------------------------------------------------\n");
                }
            } else if (op == 3) {
                System.out.println("Digite o ID ou Codigo do jogo: ");
                int id = leitor.nextInt();
                for (Jogos jogos : listGames){
                    if (jogos.getId() == id){
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println( jogos.getId() + " - " + jogos.getNome() + " - " + jogos.getLancamento() + " - " + jogos.getPreco() + " - " + jogos.getGenero() + " - " + jogos.getPlataforma());
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }else {
                        System.out.println("\nEsse jogo não foi encontrado!\n");
                    }
                }
            } else if (op == 4) {

            } else if (op == 5) {

            } else if (op == 6) {
                System.out.println("Digite o ID ou Codigo do jogo para exclui-lo!!: ");
                int id = leitor.nextInt();
                for (Jogos jogos : listGames) {
                    if (jogos.getId() == id) {
                        System.out.println("------------------------------------------------------------------------------------");
                        listGames.remove(jogos);
                        System.out.println("Jogo apagado");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    } else {
                        System.out.println("\nEsse jogo não foi encontrado!\n");
                    }
                }
            } else {
                System.out.println("Opção invalida, Por favor tente novamente");
            }
        }
    }
}
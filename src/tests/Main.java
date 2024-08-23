package tests;

import models.Jogos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<>();
        Jogos game = new Jogos();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Menu" +
                "\n0- Sair" +
                "\n1- Cadastrar" +
                "\n2- Listar" +
                "\n3- Consultar por codigo" +
                "\n4- Consultar por xxx" +
                "\n5- Alterar" +
                "\n6- Excluir" +
                "\nDigite a operação desejada: ");
        int op = leitor.nextInt();

        switch (op) {
            case 0:
                System.out.println("Sair");
                break;
            case 1:
                System.out.println("Cadastrar");
                System.out.println("Digite o ID do jogo para cadastrar:\n");
                game.setId(leitor.nextLine());
                games.add(game.getId());
                System.out.println("Digite o nome do jogo para cadastrar:\n");
                game.setNome(leitor.nextLine());
                games.add(game.getNome());
                System.out.println("Digite a data de lançamento do jogo para cadastrar:\n");
                game.setLancamento(leitor.nextInt());
                games.add(game.getLancamento());
                break;
            case 2:
                System.out.println(games);
                break;
            case 3:
                System.out.println("\n3- Consultar por codigo");
                break;
            case 4:
                System.out.println("Consultar por xxx");
                break;
            case 5:
                System.out.println("alterar");
                break;
        }
    }
}
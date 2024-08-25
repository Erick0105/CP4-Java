package tests;

import enums.GeneroJogoEnum;
import models.Jogos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogos> listGames = new ArrayList<>();
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

        if (op == 0) {
            System.out.println("Até logo");

        } else if (op == 1) {
            System.out.println("--------CADASTRAR----------");
            System.out.println("Digite o nome do jogo: ");
            game.setNome(leitor.nextLine());
            System.out.println("Digite o ID do jogo: ");
            game.setId(leitor.nextInt());
            System.out.println("Digite a data de lançamento do jogo: ");
            game.setLancamento(leitor.nextInt());
            System.out.println("Digite o preço do Jogo: ");
            game.setPreco(leitor.nextDouble());

            GeneroJogoEnum genero = null;
            while (genero == null){
                System.out.println("Digite o genero do Jogo:\nACAO, SANDBOX, TERROR, RPG, FPS, CORRIDA, SOBREVIVENCIA, LUTA, SIMULACAO, AVENTURA, RITMO, ESPORTS, EDUCACIONAL: ");
                String opGenero = leitor.nextLine().toUpperCase();

                switch (opGenero){
                    case "AC":
                         genero = GeneroJogoEnum.ACAO;
                        break;
                    case "SA":
                        genero = GeneroJogoEnum.SANDBOX;
                        break;
                    case "TE":
                        genero = GeneroJogoEnum.TERROR;
                        break;
                    case "RP":
                        genero = GeneroJogoEnum.RPG;
                        break;
                    case "FP":
                        genero = GeneroJogoEnum.FPS;
                        break;
                    case "CO":
                        genero = GeneroJogoEnum.CORRIDA;
                        break;
                    case "SO":
                        genero = GeneroJogoEnum.SOBREVIVENCIA;
                        break;
                    case "LU":
                        genero = GeneroJogoEnum.LUTA;
                        break;
                    case "SI":
                        genero = GeneroJogoEnum.SIMULACAO;
                        break;
                    case "AV":
                        genero = GeneroJogoEnum.AVENTURA;
                        break;
                    case "RI":
                        genero = GeneroJogoEnum.RITMO;
                        break;
                    case "ES":
                        genero = GeneroJogoEnum.ESPORTS;
                        break;
                    case "ED":
                        genero = GeneroJogoEnum.EDUCACIONAL;
                        break;
                    default:
                        System.out.println("Esse genero invalido. Por Favor, tente novamente!");
                        break;
                }
            }

            leitor.close();
            listGames.add(game);
            System.out.println("Jogo Listado");

        } else if (op == 2) {
            System.out.println("Jogos listados");


        }
    }
}
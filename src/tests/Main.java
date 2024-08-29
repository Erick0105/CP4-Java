package tests;

import enums.GeneroJogoEnum;
import enums.PlataformasEnum;
import models.Jogos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogos> listGames = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("------------------- MENU ----------------------" +
                    "\n0- Sair" +
                    "\n1- Cadastrar" +
                    "\n2- Listar" +
                    "\n3- Consultar por codigo" +
                    "\n4- Consultar por xxx" +
                    "\n5- Alterar" +
                    "\n6- Excluir" +
                    "\n----------------------------------------------" +
                    "\nDigite a operação desejada: ");
            int op = leitor.nextInt();

            if (op == 0) {
                System.out.println("Até logo");
                break;

            } else if (op == 1) {
                System.out.println("--------CADASTRAR----------");
                System.out.println("Digite o nome do jogo: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o ID do jogo: ");
                int id = leitor.nextInt();
                System.out.println("Digite a data de lançamento do jogo: ");
                int lancamento = leitor.nextInt();
                System.out.println("Digite o preço do Jogo: ");
                double preco = leitor.nextDouble();

                GeneroJogoEnum genero = null;
                while (genero == null) {
                    System.out.println("Digite o genero do Jogo:\n(1)ACAO, (2)SANDBOX, (3)TERROR, (4)RPG, (5)FPS, (6)CORRIDA, (7)SOBREVIVENCIA, (8)LUTA, (9)SIMULACAO, (10)AVENTURA, (11)RITMO, (12)ESPORTS, (13)EDUCACIONAL: ");
                    int opGenero = leitor.nextInt();

                    switch (opGenero) {
                        case 1:
                            genero = GeneroJogoEnum.ACAO;
                            break;
                        case 2:
                            genero = GeneroJogoEnum.SANDBOX;
                            break;
                        case 3:
                            genero = GeneroJogoEnum.TERROR;
                            break;
                        case 4:
                            genero = GeneroJogoEnum.RPG;
                            break;
                        case 5:
                            genero = GeneroJogoEnum.FPS;
                            break;
                        case 6:
                            genero = GeneroJogoEnum.CORRIDA;
                            break;
                        case 7:
                            genero = GeneroJogoEnum.SOBREVIVENCIA;
                            break;
                        case 8:
                            genero = GeneroJogoEnum.LUTA;
                            break;
                        case 9:
                            genero = GeneroJogoEnum.SIMULACAO;
                            break;
                        case 10:
                            genero = GeneroJogoEnum.AVENTURA;
                            break;
                        case 11:
                            genero = GeneroJogoEnum.RITMO;
                            break;
                        case 12:
                            genero = GeneroJogoEnum.ESPORTS;
                            break;
                        case 13:
                            genero = GeneroJogoEnum.EDUCACIONAL;
                            break;
                        default:
                            System.out.println("Esse genero invalido. Por Favor, tente novamente!");
                    }
                }
                PlataformasEnum plataforma = null;
                while (plataforma == null){
                    System.out.println("Digite a plataforma do Jogo:\n(1)PC, (2)Celular, (3)Console, (4)Todas : ");
                    int opPlataforma = leitor.nextInt();

                    switch (opPlataforma){

                        case 1:
                            plataforma = PlataformasEnum.PC;
                            break;
                        case 2:
                            plataforma = PlataformasEnum.CELULAR;
                            break;
                        case 3:
                            plataforma = PlataformasEnum.CONSOLE;
                            break;
                        case 4:
                            plataforma = PlataformasEnum.TODAS;
                            break;
                        default:
                            System.out.println("Opção escolhida é invalida");
                    }
                }

                Jogos game = new Jogos(id, nome, lancamento, preco, genero, plataforma);
                listGames.add(game);
                System.out.println("--------- Jogo Listado com Sucesso!! ---------\n\n");

            } else if (op == 2) {
                System.out.println("Jogos listados:");
                for (Jogos jogos : listGames){
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println(jogos.getNome() + " - " + jogos.getId() + " - " + jogos.getLancamento() + " - " + jogos.getPreco() + " - " + jogos.getGenero() + " - " + jogos.getPlataforma());
                    System.out.println("------------------------------------------------------------------------------------");
                }
            }
        }
    }
}
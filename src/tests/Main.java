package tests;

import enums.GeneroJogoEnum;
import enums.PlataformasEnum;
import models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogos> listGames = new ArrayList<>();
        Jogos novoJogo = new Jogos();

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println();
            String msg = "------------------- MENU ----------------------";
            System.out.print(msg +
                    "\n[0] - Sair" +
                    "\n[1] - Cadastrar" +
                    "\n[2] - Listar" +
                    "\n[3] - Consultar por codigo" +
                    "\n[4] - Listar jogos por plataforma" +
                    "\n[5] - Alterar" +
                    "\n[6] - Excluir" +
                    "\n----------------------------------------------" +
                    "\nDigite a opção desejada: ");
            int op = leitor.nextInt();

            if (op == 0) {
                System.out.println("Volte sempre :) ");
                break;

            } else if (op == 1) {
                if (ContagemRegistros.getQtdJogos() == 0){
                    novoJogo.cadastrarJogo();
                    ContagemRegistros.resgistrarJogo(novoJogo);
                }else {
                    Jogos jogo2 = novoJogo.clone();
                    jogo2.cadastrarJogo();
                    ContagemRegistros.resgistrarJogo(jogo2);
                }

            } else if (op == 2) {
                if (ContagemRegistros.getQtdJogos() == 0){
                    System.out.println("Nenhum Jogo Cadastrado/Registrado");
                }else {
                    System.out.println("----------------------LISTA-DE-JOGOS-------------------------");
                    for (Jogos jogo : ContagemRegistros.getListaJogos()){
                        System.out.println("\nID: " + jogo.getId() +
                                "\nNome: " + jogo.getNome() +
                                "\nPreço: " + jogo.getPreco() +
                                "\nGenero: " + jogo.getGenero() +
                                "\nPlataformas: " + jogo.getPlataforma() +
                                "\nData de Lançamento: " + jogo.getLancamento() +
                                "\n-----------------------------------------------");
                    }
                }
            } else if (op == 3) {
                System.out.println("Digite o ID do jogo: ");
                int id = leitor.nextInt();
                for (Jogos jogo : ContagemRegistros.getListaJogos()){
                    if (jogo.getId() == id){
                        System.out.println("----------------------JOGO-ENCONTRADO-------------------------" +
                                "\nID: " + jogo.getId() +
                                "\nNome: " + jogo.getNome() +
                                "\nPreço: " + jogo.getPreco() +
                                "\nGenero: " + jogo.getGenero() +
                                "\nPlataformas: " + jogo.getPlataforma() +
                                "\nData de Lançamento: " + jogo.getLancamento() +
                                "\n-----------------------------------------------");
                    }else {
                        System.out.println("\nnão foi encontrado um jogo com o ID passado!!!\n");
                    }
                }
            } else if (op == 4) {
                do {
                    System.out.println("----------------------PLATAFORMAS-------------------------\n" +
                            "[1] - Pc \n"+
                            "[2] - Mobile \n"+
                            "[3] - Console \n"+
                            "[4] - Todos" +
                            "\n-----------------------------------------------" +
                            "\nDigite o nome correspondente a opção que você deseja");
                    int opc = leitor.nextInt();
                    if (opc == 3) {
                        Console.adicionarJogo(ContagemRegistros.getListaJogos());
                        Console.mostrarLista();
                        break;
                    } else if (opc == 1) {
                        Pc.adicionarJogo(ContagemRegistros.getListaJogos());
                        Pc.mostrarLista();
                        break;
                    } else if (opc == 2) {
                        Mobile.adicionarJogo(ContagemRegistros.getListaJogos());
                        Mobile.mostrarLista();
                        break;
                    } else if (opc == 4) {
                        Todas.adicionarJogo(ContagemRegistros.getListaJogos());
                        Todas.mostrarLista();
                        break;
                    } else {
                        System.out.println("Opção invalida");
                    }
                } while (true);

            } else if (op == 5) {
                System.out.println("Digite o ID do jogo que deseja alterar: ");
                int id = leitor.nextInt();
                for (Jogos jogo : ContagemRegistros.getListaJogos()){
                    if (jogo.getId() == id){
                        System.out.println("----------------------OPÇÕES-------------------------" +
                                "\n[1] - Nome;" +
                                "\n[2] - Data de Lançamento;" +
                                "\n[3] - Preço;" +
                                "\n[4] - Genero;" +
                                "\n[5] - Plataforma;" +
                                "-----------------------------------------------" +
                                "\nDigite o número correspondente a opção que você deseja:");
                        int opAlter = leitor.nextInt();
                        switch (opAlter){
                            case 1:
                                System.out.println("Qual o novo nome do jogo?");
                                String novoNome = leitor.next();
                                jogo.setNome(novoNome);
                                break;
                            case 2:
                                System.out.println("Qual a data de lançamento do jogo?");
                                int novoLancamento = leitor.nextInt();
                                jogo.setLancamento(novoLancamento);
                                break;
                            case 3:
                                System.out.println("Qual o preço do jogo?");
                                double novoPreco = leitor.nextDouble();
                                leitor.nextLine();
                                jogo.setPreco(novoPreco);
                                break;
                            case 4:
                                do {
                                    System.out.println("------------------- OPÇÕES GENERO ----------------------" +
                                            "\n(1) - Ação;" +
                                            "\n(2) - Sandbox;" +
                                            "\n(3) - Terror;"+
                                            "\n(4) - Rpg," +
                                            "\n(5) - Fps;" +
                                            "\n(6) - Corrida;" +
                                            "\n(7) - SobrevivÊncia;" +
                                            "\n(8) - Luta;" +
                                            "\n(9) - Simulação;" +
                                            "\n(10) - Aventura;" +
                                            "\n(11) - Ritmo;" +
                                            "\n(12) - Esports;" +
                                            "\n(13) - Educacional." +
                                            "\nDigite a opção do novo tipo do jogo");
                                    int opGenero = leitor.nextInt();

                                    switch (opGenero) {
                                        case 1:
                                            jogo.setGenero(GeneroJogoEnum.ACAO);
                                            break;
                                        case 2:
                                            jogo.setGenero(GeneroJogoEnum.SANDBOX);
                                            break;
                                        case 3:
                                            jogo.setGenero(GeneroJogoEnum.TERROR);
                                            break;
                                        case 4:
                                            jogo.setGenero(GeneroJogoEnum.RPG);
                                            break;
                                        case 5:
                                            jogo.setGenero(GeneroJogoEnum.FPS);
                                            break;
                                        case 6:
                                            jogo.setGenero(GeneroJogoEnum.CORRIDA);
                                            break;
                                        case 7:
                                            jogo.setGenero(GeneroJogoEnum.SOBREVIVENCIA);
                                            break;
                                        case 8:
                                            jogo.setGenero(GeneroJogoEnum.LUTA);
                                            break;
                                        case 9:
                                            jogo.setGenero(GeneroJogoEnum.SIMULACAO);
                                            break;
                                        case 10:
                                            jogo.setGenero(GeneroJogoEnum.AVENTURA);
                                            break;
                                        case 11:
                                            jogo.setGenero(GeneroJogoEnum.RITMO);
                                            break;
                                        case 12:
                                            jogo.setGenero(GeneroJogoEnum.ESPORTS);
                                            break;
                                        case 13:
                                            jogo.setGenero(GeneroJogoEnum.EDUCACIONAL);
                                            break;
                                        default:
                                            System.out.println("Essa opção de genero é invalido. Por Favor, tente novamente!");
                                    }
                                } while (true);
                            case 5:

                                do {
                                    System.out.println("-------------------OPÇÕES-PLATAFORMA----------------------" +
                                            "\n(1) - Pc;" +
                                            "\n(2) - Mobile;" +
                                            "\n(3) - Console;" +
                                            "\n(4) - Todas" +
                                            "\nDigite qual das opções é a plataforma do jogo:");
                                    int opPlataforma = leitor.nextInt();

                                    switch (opPlataforma){

                                        case 1:
                                            jogo.setPlataforma(PlataformasEnum.PC);
                                            break;
                                        case 2:
                                            jogo.setPlataforma(PlataformasEnum.MOBILE);
                                            break;
                                        case 3:
                                            jogo.setPlataforma(PlataformasEnum.CONSOLE);
                                            break;
                                        case 4:
                                            jogo.setPlataforma(PlataformasEnum.TODAS);
                                            break;
                                        default:
                                            System.out.println("Opção escolhida é invalida");
                                    }
                                }while (true);
                        }
                    }else {
                        System.out.println("\nnão foi encontrado um jogo com o ID passado!!!\n");
                    }
                }
            } else if (op == 6) {
                System.out.println("Digite o ID ou Codigo do jogo para exclui-lo!!: ");
                int idJogoAlvo = leitor.nextInt();
                ContagemRegistros.removerJogo(idJogoAlvo);
                System.out.println("----------------------JOGO-EXCLUIDO-------------------------");
            } else {
                System.out.println("Opção invalida, Por favor tente novamente");
            }
        }
    }
}
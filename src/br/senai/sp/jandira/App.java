package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Jogador;
import br.senai.sp.jandira.model.Juiz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean exit = false;

        Scanner scanner = new Scanner(System.in);
        Jogador jogadores = new Jogador();
        Juiz juizes = new Juiz();

        while(!exit){
            System.out.println("/----------- Menu ------------/");
            System.out.println("1 - Cadastrar Jogador");
            System.out.println("2 - Cadastrar Juiz");
            System.out.println("3 - Exibir informações do jogador");
            System.out.println("4 - Exibir informações Juiz");
            System.out.println("5 - Pesquisar Jogador");
            System.out.println("6- Sair");

            int decision = scanner.nextInt();
            scanner.nextLine();

            switch (decision){
                case 1:
                    Jogador jogador = new Jogador();
                    jogador.cadastrarJogador();
                    jogadores.adicionarJogador(jogador);
                    break;
                case 2:
                    Juiz juiz = new Juiz();
                    juiz.cadastrarJuiz();
                    break;
                case 3:
                   jogadores.exibirJogadores();
                    break;
                case 4:
                    System.out.println("Qual o cpf a ser buscado?");
                    long pesquisa = scanner.nextLong();
                    jogadores.deletarJogadores(pesquisa);
                    jogadores.exibirJogadores();
                    break;
                case 5:
                    System.out.println("Qual o cpf do jogador a ser buscado?");
                    long pesquisaCpf = scanner.nextLong();
                    jogadores.pesquisarJogadores(pesquisaCpf);
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}

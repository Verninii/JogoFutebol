package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador extends Pessoas{

    private int numeroCamisa;
    private String posicao;

    Scanner scanner = new Scanner(System.in);

    List<Jogador> listPlayers = new ArrayList<>();

    public void adicionarJogador (Jogador novoJogador){
        listPlayers.add(novoJogador);
    }

    public void exibirJogadores (){
        for (Jogador jogador : listPlayers){      //imprime todos os jogadores dentro da lista
            jogador.exibirInformacoes();
        }
    }
    public void pesquisarJogadores(long pesquisa){
        for (Jogador jogador : listPlayers){
            if (jogador.getCpf() == pesquisa){
                System.out.println("As informações buscadas através do cpf são:");
                jogador.exibirInformacoes();
            }else {
                System.out.println("CPF não encontrado");
            }
        }
    }

    public void deletarJogadores(long pesquisa){
        for (Jogador jogador : listPlayers){
            if (jogador.getCpf() == pesquisa){
                listPlayers.remove(jogador);
                System.out.println("O jogador " + jogador.getNome() + " foi removido!" );
            }else {
                System.out.println("Esse cpf não foi encontrado");
            }
        }
    }

    public void cadastrarJogador(){
        System.out.println("/------------- Cadastro -------------/");
        System.out.println("/- Qual o nome do jogador: -/");
        this.setNome(scanner.nextLine());
        System.out.println("/- Qual o cpf do Jogador: -/");
        this.setCpf(scanner.nextLong());
        System.out.println("/- Qual o rg do Jogador: -/");
        this.setRg(scanner.nextLong());
        System.out.println("/- Qual a idade do jogador: -/");
        this.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("/- Qual a posição do jogador -/");
        posicao = scanner.nextLine();
        System.out.println("/- Qual o número da camisa do jogador: -/");
        numeroCamisa = scanner.nextInt();
        System.out.println("/------------ Cadastro Finalizado -------------/");
    }
    public void exibirInformacoes(){
        System.out.println("/------------- Informações do Jogador ---------------/");
        System.out.println("O nome do jogador é: " + this.getNome());
        System.out.println("O CPF do jogador é: " + this.getCpf());
        System.out.println("O RG do jogador é: " + this.getRg());
        System.out.println("A idade do jogador é: " + this.getIdade());
        System.out.println("A posição do jogador é: " + posicao);
        System.out.println("O número da camisa é: " + numeroCamisa);
    }
}

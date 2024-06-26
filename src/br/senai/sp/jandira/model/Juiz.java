package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Juiz extends Pessoas {

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJuiz(){
        System.out.println("/------------- Cadastro -------------/");
        System.out.println("/- Qual o nome do Juiz: -/");
        this.setNome(scanner.nextLine());
        System.out.println("/- Qual o cpf do Juiz: -/");
        this.setCpf(scanner.nextLong());
        System.out.println("/- Qual o rg do Juiz: -/");
        this.setRg(scanner.nextLong());
        System.out.println("/- Qual a idade do juiz: -/");
        this.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("/------------ Cadastro Finalizado -------------/");
    }
    public void exibirInformacoes(){
        System.out.println("/------------- Informações do Jogador ---------------/");
        System.out.println("O nome do juiz é: " + this.getNome());
        System.out.println("O CPF do juiz é: " + this.getCpf());
        System.out.println("O RG do juiz é: " + this.getRg());
        System.out.println("A idade do juiz é: " + this.getIdade());
    }
}

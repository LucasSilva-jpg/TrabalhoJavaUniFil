package com.company;

import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao = 1;


        System.out.println("\n[ Seja bem vindo! ]\nInsira a quantidade de índices do vetor:");
            tamanho = scanner.nextInt();
            scanner.nextLine();

        while (tamanho <= 0) {
            System.out.println("O valor informado não é positivo");
            System.out.println("Informe um valor inteiro e positivo para ser o tamanho do vetor: ");
                tamanho = scanner.nextInt();
                scanner.nextLine();}

        System.out.println("\nPara navegar pelo menu, insira o número da operação.\n");
        System.out.println("Pressione ENTER para continuar");
            scanner.nextLine();

        int[] vetor = new int[tamanho];

        do {
            if (operacao > 5 || operacao < 1) {
                System.out.println("A operação inserida é inválida");
                System.out.println("Pressione ENTER para continuar");
                    scanner.nextLine();}

            System.out.println("[ Menu ]");
            System.out.println("1 - Inserir todos elementos do vetor.");
            System.out.println("2 - Mostrar todos elementos do vetor.");
            System.out.println("3 - Buscar um elemento do vetor pelo seu índice.");
            System.out.println("4 - Remover um elemento do vetor pelo seu índice.");
            System.out.println("5 - Finalizar o programa.\n");
            System.out.println("[ Informe uma operação ]");
                operacao = scanner.nextInt();
                scanner.nextLine();

            if (operacao == 1) {
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Insira o valor no índice " + i + ".");
                    vetor[i] = scanner.nextInt();
                    scanner.nextLine();
                }

                for (int i = 0; i < tamanho; i++) {
                    System.out.println("índice["+i+"]: "+vetor[i]);
                }

                System.out.println("\nPressione Enter para continuar.");
                    scanner.nextLine();
            }

            else if (operacao == 2) {
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("O valor do vetor no índice " + i + " é igual a : " + vetor[i]);
                }
                System.out.println("\nPressione Enter para continuar.");
                    scanner.nextLine();
            }

            else if (operacao == 3) {
                for (int i = 0; i < tamanho; ) {
                    System.out.println("Qual índice você deseja buscar? ");
                        i = scanner.nextInt();
                        scanner.nextLine();

                    if (i>tamanho-1||i<0){
                        System.out.println("\nEste índice não existe.");
                        break;
                    }

                    System.out.println("O índice " + i + " tem o valor de " + vetor[i]);
                    break;
                }

                System.out.println("\nPressione Enter para continuar.");
                    scanner.nextLine();
            }

            else if (operacao == 4) {

                for (int i = 0; i < tamanho; i++) {
                    System.out.println("índice["+i+"]: "+vetor[i]);
                }

                for (int i = 0; i < tamanho; ) {
                    System.out.println("Qual índice você deseja remover o valor? ");
                        i = scanner.nextInt();
                        scanner.nextLine();

                    if (i>tamanho-1||i<0){
                        System.out.println("\nEste índice não existe");
                        break;
                    }

                        vetor[i] = 0;
                    System.out.println("O valor do índice "+i+" foi removido com sucesso:\níndice["+i+"] = "+vetor[i]);
                    break;
                }

                System.out.println("\nPressione Enter para continuar.");
                    scanner.nextLine();
            }
        }
        while (operacao != 5);
        System.out.println("Trabalho feito por: \nLucas Vinicius.\nVictória Rezende.\nMuito obrigado por testar!");
    }
}
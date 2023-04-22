package com.mycompany.ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public EntradaDeDados entradaDeDados;

    public Menu() {
        entradaDeDados = new EntradaDeDados();
    }

    public void exibirMenu() {
        int[] vetor = entradaDeDados.obterVetor();

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(vetor));

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nEscolha um metodo de ordenacao:");
            System.out.println("1 - Ordenacao por insercao");
            System.out.println("2 - Ordenacao por selecao");
            System.out.println("3 - Ordenacao bolha");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            long tempoInicial = System.currentTimeMillis();

            switch (opcao) {
                case 1:
                    int[] vetorOrdenadoInsercao = OrdenaçãoInsercao.ordenarPorInsercao(vetor);
                    System.out.println("Vetor ordenado por insercao:");
                    System.out.println(Arrays.toString(vetorOrdenadoInsercao));
                    break;
                case 2:
                    int[] vetorOrdenadoSelecao = OrdenacaoSelecao.ordenarPorSelecao(vetor);
                    System.out.println("Vetor ordenado por selecao:");
                    System.out.println(Arrays.toString(vetorOrdenadoSelecao));
                    break;
                case 3:
                    int[] vetorOrdenadoBolha = OrdenacaoBolha.ordenarPorBolha(vetor);
                    System.out.println("Vetor ordenado por bolha:");
                    System.out.println(Arrays.toString(vetorOrdenadoBolha));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        }
    }




}


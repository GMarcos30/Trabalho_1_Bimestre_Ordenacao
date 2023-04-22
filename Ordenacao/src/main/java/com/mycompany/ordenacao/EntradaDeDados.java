package com.mycompany.ordenacao;

import java.util.Scanner;

public class EntradaDeDados {
    private Scanner scanner;
    
    public EntradaDeDados(){
        scanner = new Scanner(System.in);
    }
    
    public int[] obterVetor(){
        System.out.println("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();
        
        int[] vetor = new int[n];
        
        System.out.println("Informe os elementos do vetor: ");
        for(int i = 0; i < n; i++){
            vetor[i] = scanner.nextInt();
        }
        
        return vetor;
    }
}
package com.mycompany.ordenacao;
import java.util.Scanner;

public class Menu {
    
    private Scanner scanner;
    
    public Menu(){
        scanner = new Scanner(System.in);
    }
    
    public int exibirMenu(){
        System.out.println("Selecione o metodo de ordenação que voce deseja:");
        System.out.println(" 1. Ordenação por inserção ");
        System.out.println(" 2. Ordenação por seleção ");
        System.out.println(" 3. Ordenação por bolha ");
        
        return scanner.nextInt();
    }
            
}

package com.mycompany.ordenacao;


public class OrdenacaoInsercao {
    public void ordenar(int[]vetor){
        for(int i = 1; i < vetor.length; i++){
            int chave = vetor[i];
            int j = i - 1;
            
            while (j >= 0 && vetor[j] > chave){
                
            }
            
            vetor[j +1] = chave;
        }
    }
}

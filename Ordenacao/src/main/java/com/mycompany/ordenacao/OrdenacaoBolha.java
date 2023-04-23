package com.mycompany.ordenacao;

    public class OrdenacaoBolha {

        public static int[] ordenarPorBolha(int[] vetor) {
            boolean houseTrocar;
            do {
                houseTrocar = false;
                for (int i = 0; i < vetor.length - 1; i++) {
                    if (vetor[i] > vetor[i + 1]) {
                        int temp = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = temp;
                        houseTrocar = true;
                    }
                }
            } while (houseTrocar);
            return vetor;
        }
    }

package com.example.Questoes;

public class Questao1 {
    public static void executar() {
        double soma = 0;
        int k = 0;
        int indice = 13;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println("Resultado da soma: " + soma);
    }
}

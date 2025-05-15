package com.example.Questoes;

import com.example.App;

public class Questao2 {
    public static void executar() {
        System.out.print("Informe um número: ");
        int numero = App.SCANNER.nextInt();

        int a = 0, b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == numero || numero == 0) {
            System.out.println("O número pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número NÃO pertence à sequência de Fibonacci.");
        }
    }
}

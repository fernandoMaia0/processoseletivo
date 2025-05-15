package com.example.Questoes;

import com.example.App;

public class Questao5 {
    public static void executar() {
        System.out.print("Digite uma string: ");
        App.SCANNER.nextLine();
        String texto = App.SCANNER.nextLine(); 

        String invertida = new StringBuilder(texto).reverse().toString();
        System.out.println("String invertida: " + invertida);
    }
}

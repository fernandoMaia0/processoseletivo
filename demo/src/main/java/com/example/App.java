package com.example;

import java.util.Scanner;

import com.example.Questoes.*;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Executando questão 1");
        Questao1.executar();
        System.out.println("Executando questão 2");
        Questao2.executar();
        System.out.println("Executando questão 3");
        Questao3.executar();
        System.out.println("Executando questão 4");
        Questao4.executar();
        System.out.println("Executando questão 5");
        Questao5.executar();
    }
}

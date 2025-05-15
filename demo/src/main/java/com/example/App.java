package com.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Executando questão 1");
        questao1();
        System.out.println("Executando questão 2");
        questao2();
        System.out.println("Executando questão 3");
        questao3();
        System.out.println("Executando questão 4");
        questao4();
        System.out.println("Executando questão 5");
        questao5();
    }

    private static void questao5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        scanner.close();

        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }

    private static void questao4() {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.printf("SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Outros: %.2f%%\n", (outros / total) * 100);
    }

    private static void questao3() throws IOException {
        String json = Files.readString(Path.of("../docs/dados.json"));
        JsonArray dados = JsonParser.parseString(json).getAsJsonArray();

        List<Double> valores = new ArrayList<>();

        for (JsonElement elem : dados) {
            double valor = elem.getAsJsonObject().get("valor").getAsDouble();
            if (valor > 0) {
                valores.add(valor);
            }
        }

        double menor = Collections.min(valores);
        double maior = Collections.max(valores);
        double media = valores.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        long diasAcimaDaMedia = valores.stream().filter(v -> v > media).count();

        System.out.println("Menor valor: R$" + menor);
        System.out.println("Maior valor: R$" + maior);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }
    
    private static void questao2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

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

    public static void questao1(){
        double soma = 0;
        int k = 0;
        int indice = 13;

        while (k < indice) {
            k+=1;
            soma+=k;
        }

        System.out.println("Resultado  da soma : "+soma);

    }

}

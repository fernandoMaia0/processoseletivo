package com.example.Questoes;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import com.google.gson.*;

public class Questao3 {
    public static void executar() throws IOException {
        InputStream is = Questao3.class.getClassLoader().getResourceAsStream("dados.json");
        if (is == null) {
            System.out.println("Arquivo dados.json não encontrado.");
            return;
        }

        String json = new String(is.readAllBytes(), StandardCharsets.UTF_8);
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
}

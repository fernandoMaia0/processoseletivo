# 📊 Análise de Faturamento

Este projeto Java realiza uma análise estatística com base em um arquivo JSON de faturamento diário. Os resultados incluem:

- Menor valor de faturamento diário
- Maior valor de faturamento diário
- Número de dias com faturamento acima da média

---

## 📁 Estrutura do Projeto

Este projeto segue a estrutura padrão de um projeto Maven:

```
demo/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       ├── App.java
│   │   │       └── Questoes/
│   │   │           ├── Questao1.java
│   │   │           ├── Questao2.java
│   │   │           ├── Questao3.java
│   │   │           ├── Questao4.java
│   │   │           └── Questao5.java
│   │   └── resources/
│   │       ├── dados.json
│   │       └── dados (2).xml
│   └── test/
│       └── java/
└── target/
    ├── classes/
    │   ├── com/example/...
    │   ├── dados.json
    │   └── dados (2).xml
    └── test-classes/
```

---

## ✅ Pré-requisitos

- JDK 11 ou superior
- Terminal com `javac` e `java` disponíveis
- [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) (caso não esteja usando Maven)

---

## 🛠️ Compilando e Executando (Sem Maven)

### 1. Compilar

No terminal, navegue até a pasta `demo` e execute:

```bash
javac -cp "libs/gson-2.10.1.jar" -d target/classes \
src/main/java/com/example/App.java \
src/main/java/com/example/Questoes/Questao*.java
```

> Certifique-se de que a biblioteca `gson-2.10.1.jar` está presente na pasta `libs/`.

### 2. Executar

Execute a classe principal (por exemplo, `App.java`) com:

```bash
java -cp "libs/gson-2.10.1.jar:target/classes" com.example.App
```

> No Windows, troque `:` por `;`:
```bash
java -cp "libs/gson-2.10.1.jar;target/classes" com.example.App
```

---

## 📝 Exemplo do arquivo `dados.json`

O arquivo `dados.json` deve estar localizado em `src/main/resources` e pode conter:

```json
[
  { "dia": 1, "valor": 22174.1664 },
  { "dia": 2, "valor": 24537.6698 },
  { "dia": 3, "valor": 0.0 },
  { "dia": 4, "valor": 26139.6134 }
]
```

Durante a compilação, o arquivo será copiado automaticamente para `target/classes` e pode ser lido com:

```java
Path path = Paths.get("target/classes/dados.json");
```

---

## ℹ️ Observações

- O projeto pode ser convertido em um projeto Maven completo com a inclusão de dependências no `pom.xml`.
- Se estiver utilizando Maven, a leitura de arquivos pode ser feita diretamente de `src/main/resources` com `getResourceAsStream()`.

---
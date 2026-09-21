# Estudos de Java — Fundamentos

Repositório de estudos pessoais de Java, começando do zero: variáveis, tipos primitivos, operadores, estruturas condicionais e de repetição.

## Estrutura do projeto

Os exercícios são organizados em pacotes por assunto, dentro de `src/`:

- **`variaveis`** — tipos primitivos (`int`, `double`, `String`, `boolean`), operadores aritméticos, concatenação, cast, e leitura de dados com `Scanner`.
- **`condicionais`** — estruturas `if` / `else if` / `else`, operadores relacionais (`==`, `<`, `>=`...) e lógicos (`&&`, `||`).
- **`loops`** — estruturas de repetição (`for`, `while`), acumuladores.

Cada exercício é uma classe independente (`Exercicio01`, `Exercicio02`, ...), com `main` executável.

## Como rodar

Pelo VS Code, com a extensão *Extension Pack for Java* instalada:

1. Abra a classe desejada (ex: `src/loops/Exercicio02.java`)
2. Clique em **Run** acima do método `main`, ou use `F5` pra debugar

Pelo terminal, a partir da pasta do projeto:

```bash
javac -d bin src/**/*.java
java -cp bin loops.Exercicio02
```

## Convenções seguidas

- Pacotes em minúsculas (`variaveis`, `condicionais`, `loops`)
- Classes com inicial maiúscula (`Exercicio01`, `Exercicio02`, ...)
- Cada commit representa um bloco de progresso nos estudos

## Dependências

O projeto usa apenas a biblioteca padrão do Java (`java.util.Scanner`), sem dependências externas.

---

*Repositório em construção — próximos assuntos: arrays, métodos, orientação a objetos.*
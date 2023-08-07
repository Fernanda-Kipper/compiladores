## Analisador Léxico da Linguagem Karloff
Este é o analisador léxico da linguagem Karloff. A linguagem Karloff é uma linguagem de programação simples e didática, projetada para fins de aprendizado e prática em compiladores.

## Para executar
1. Compile o analisador usando Javacc 
```bash
cd src
javacc Karloff.jj
```
2. Compile o programa Java
```bash
javac Karloff.java
```
3. Execute o analisador com os códigos de exemplo
```bash
java Karloff resources/input-1.kar
```

## Linguagem Karloff

A linguagem Karloff suporta declaração de variáveis, comandos de controle de fluxo como `if`, `while` e `repeat`, e também possui funções definidas pelo usuário. 

O analisador léxico é a primeira etapa do compilador Karloff, responsável por analisar o código fonte e produzir uma sequência de tokens que serão utilizados nas etapas subsequentes do processo de compilação. Cada token representa uma unidade léxica da linguagem, como palavras-chave, identificadores, números, operadores e símbolos especiais.
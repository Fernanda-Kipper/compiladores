## Parser da Linguagem Karloff
Este é o analisador sintático da linguagem Karloff. A linguagem Karloff é uma linguagem de programação simples e didática, projetada para fins de aprendizado e prática em compiladores.

## Para executar
1. Compile o analisador usando Javacc 
```bash
cd src
javacc Karloff.jj
```
2. Compile o programa Java
```bash
javac KarloffParser.java
```
3. Execute o analisador com os códigos de exemplo
```bash
java KarloffParser resources/input-1.kar
```

## Linguagem Karloff

A linguagem Karloff suporta declaração de variáveis, comandos de controle de fluxo como `if`, `while` e `repeat`, e também possui funções definidas pelo usuário. 

O analisador sintático identifica a estrutura gramatical do código, construindo uma árvore de sintaxe abstrata que representa a hierarquia das instruções do programa. Se o código estiver correto, o programa executará até o fim sem nenhum log, permitindo que as etapas subsequentes do compilador continuem o processo de compilação. Caso contrário, serão relatados erros de sintaxe, indicando que o código fonte não está de acordo com a gramática da linguagem Karloff.
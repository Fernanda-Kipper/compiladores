## Analisador Léxico linguagem Karloff

## Para rodar
1. Compile o analisador usando Javacc 
```bash
cd src
javacc Karloff.jj
```
2. Compile o programa Java
```bash
javac KarloffParser.java
```
3. Execute o analisador com os códigos de exemplos
```bash
java KarloffParser resources/input-1.kar
```
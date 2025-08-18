# zenvor
o Java para geração de anagramas utilizando algoritmo de backtracking. O sistema gera todas as permutações possíveis de uma string de entrada contendo apenas letras.


# AnagramZenvor

## Descrição
Projeto Java para geração de anagramas utilizando algoritmo de backtracking. O sistema gera todas as permutações possíveis de uma string de entrada contendo apenas letras.

## Funcionalidades
- Geração de todos os anagramas possíveis de uma palavra
- Validação de entrada (apenas letras, não nulo/vazio)
- Implementação eficiente usando backtracking recursivo
- Retorno de lista vazia para entradas inválidas

## Tecnologias
- Java
- Algoritmo de Backtracking
- Collections Framework (ArrayList)

## Como usar
```java
List<String> anagramas = AnagramZenvor.generateAnagrams("abc");
// Resultado: [abc, acb, bac, bca, cab, cba]

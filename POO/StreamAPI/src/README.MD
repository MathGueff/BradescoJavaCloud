# Stream API

## Consumer
> Recebe um valor e não retorna valor, sendo utilizado principalmente para ações
````java
 Consumer<Integer> imprimirNumeroPar = numero -> {
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
    };
````

## Supplier
> Não recebe argumento e retorna um resultado, utilizando principalmente para criação ou fornecimento de novos objetos
````java
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();
````
## Function
> Recebe um argumento T e retorna um valor do tipo R, utilizado principalmente para mapear
````java
Function<Integer, Integer> dobrar = numero -> numero * 2;
````
## Predicate
> Aceita argumento do tipo T e retorna booleano, usado para filtragem

## Binary Operator
> Aceita dois argumentos do tipo T e retorna do mesmo tipo, útil para somas ou subtrações acumulativas
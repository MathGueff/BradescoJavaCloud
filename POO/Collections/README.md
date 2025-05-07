## Collections

---
### Diferença entre List e ArrayList

- List é uma classe abstrata ao qual ArrayList e outras classes o implementam, por isso não é possível instanciar, devido a isso, um uso recorrente de uma lista é da forma vista abaixo.
> List<String> lista = new ArrayList<>();

- List: interface abstrata
- ArrayList: implementa a interface List

### Generics

> Generics (representado por diamond <>) permite que possamos definir a tipagem de um objeto, como por exemplo:

`ArrayList<String> = new ArrayList<>();`

Estamos definindo que a lista será de String

---

### Comparable x Comparator

> Utilizados para manusear as collections, ordenando e comparando.

| Comparable                                                                                                | Comparator                                                                                                        |
|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| Utiliza apenas uma forma de ordenação, afeta a classe original | Pode utilizar várias formas para ordenação, não afeta a classe original |

#### Comparable
> Define a ordem natural (como nome, id)

> A forma de usar Comparable é implementando na classe que queremos ordenar

Utilizando a ordenação em um ArrayList
```
    import java.util.ArrayList;
    import java.util.Collections;

    List<String> listaComparable;
    Collections.sort(listaComparable); 
``` 

Precisa do método compareTo na classe que deve ser os elementos

#### Comparator
> Define a ordem alternativa (como por preço ou idade)

> Para o Comparator, é necessário criar uma outra classe que implemente-o, nessa classe podemos criar nossos métodos de comparação.

Utilizando a ordenação em um ArrayList
```
    import java.util.ArrayList;
    import java.util.Collections;

    List<String> listaComparator;
    Collections.sort(listaComparator, new ComparatorExemplo()); 
``` 

É necessário criar uma classe que extanda de Comparator para criar um novo Comparator 
---
## Set

> As classes que implementam de Set são HashSet e LinkedHashSet

> O Set não permite elementos repetidos, como um conjunto matemático. Implementa Collection
- A detecção de duplicadas é definida pelo método hashCode da interface Set (na classe que será T do Set), no exemplo abaixo, seria a classe String

### HashSet

`Set<String> = new HashSet<>();`

> Não pode ordenar elementos

### TreeSet

`Set<String> = new TreeSet<>();`

> Pode ordenar elementos
---
## Map

- Chave e valor
- Não pode conter chaves duplicadas
> Classes que implementam: HashMap, TreeMap e LinkedHashMap

| put()                             | get()                                 | containsKey()                | containsValue()                             | size()          | isEmpty()                    |
|-----------------------------------|---------------------------------------|------------------------------|---------------------------------------------|-----------------|------------------------------|
| Adiciona ou altera um chave valor | procura por um valor passando a chave | verifica se uma chave existe | verifica se o valor existe passando a chave | retorna tamanho | retorna se está vazio ou não |

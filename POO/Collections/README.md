## Collections

---

### Generics

> Generics (representado por diamond <>) permite que possamos definir a tipagem de um objeto, como por exemplo:

`ArrayList<String> = new ArrayList<>(); `

Estamos definindo que a lista será de String


---

### Comparable x Comparator

> Utilizados para manusear as collections, ordenando e comparando.

| Comparable                                                                                                  | Comparator                                                                                                                  |
|-------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| Utiliza apenas uma forma de ordenação, afeta a classe original, utiliza Collections.sort(List) para ordenar | Pode utilizar várias formas para ordenação, não afeta a classe original, utiliza Collections(List, Comparator) para ordenar |

#### Comparable
> A forma de usar Comparable é implementando na classe que queremos ordenar e utilizando Collections.sort(list), como:

```
    import java.util.ArrayList;
    import java.util.Collections;

    List<String> listaComparable;
    Collections.sort(listaComparable); 
``` 

#### Comparator

> Para o Comparator, é necessário criar uma outra classe que implemente-o, nessa classe podemos criar nossos métodos de comparação, e passar para o método sort ao ordenar a lista

```
    import java.util.ArrayList;
    import java.util.Collections;

    List<String> listaComparator;
    Collections.sort(listaComparator, new ComparatorExemplo()); 
``` 




## HERANÇA E POLIMORFISMO EM JAVA
A classe, método e os seus atributos podem ser definidos de variadas formas dependendo da sua função e do que for necessário para o seu negócio.

---

## Índice

- [HERANÇA E POLIMORFISMO EM JAVA](#heran-a-e-polimorfismo-em-java)
- [Modificadores de Acesso de métodos e atributos:](#modificadores-de-acesso-de-m-todos-e-atributos)
- [Comportamento](#comportamento)
- [Modificadores de restrição de herança](#modificadores-de-restri-o-de-heran-a)
  + [Final](#final)
  + [Sealed](#sealed)
  + [Non-sealed](#non-sealed)

## Modificadores de Acesso de métodos e atributos:

| public                                                        | private                                               | protected                                                         |
|---------------------------------------------------------------|-------------------------------------------------------|-------------------------------------------------------------------|
| Define que o metodo/atributo pode ser acessado fora da classe | Pode ser acecessado apenas dentro do escopo da classe | Pode ser acessado dentro do escopo da classe e das classes filhas |

## Comportamento

| final                                                                                        | abstract                                                                                         | static                                                                                                                 | override                                                     |
|----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| Define que o método não pode ser sobrescrito (override) e o atributo não pode mudar de valor | Define um corpo que deve ser implementado por outra classe (não pode ser definido na classe pai) | Não pertence a instância e sim a classe, então é único independente da quantidade de objetos existentes daquela classe | Faz a sobrescrita de um método, alterando sua funcionalidade |

## Modificadores de restrição de herança

#### Final
> Final indica que a classe não pode ser herdada por nenhuma outra classe

Exemplo:

Uma classe Humano não pode ser herdada de nenhuma outra classe (pois pode é o fim do fluxo de herança)

```
public final Humano  
```

---

#### Sealed
> Sealed é utilizado para delimitar quais classes podem herdar da classe pai, utilizando permits

Exemplo:

Uma classe Animal só pode ser herdada de Cachorro e Gato, mas não de Carro, então usamos:

```
public sealed abstract Animal permits Cachorro, Gato 
```
---

#### Non-sealed
> Non-sealed indica que pode ser herdade por qualquer outra classe

Exemplo:

Uma classe Assunto, que pode ser herdada de qualquer classe

```
public non-sealed Assunto 
```
---


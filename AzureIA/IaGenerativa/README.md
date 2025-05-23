# IA Generativa

> Precisa ser responsável

## O que é

- Imita o ser humano
- Estratégia de pergunta e resposta
- Aprendizado de máquina
- Cria conteúdo original

- Geração de linguagem natural, imagem e código

## Modelos de Linguagem Grandes

![alt text](images/image.png)

### Transformador

- Sugestão de palavras
- Sequência provável (decodificador)
- Representações semânticas do vocabulário (codificador)

- Tokenizado -> cada palavra/frase é separado por um token numérico

- Camadas de atenção -> relação entre os tokens (para criar uma sequência provável)

## Decodificador x Codificador

- Codificador -> entrada enriquecida
- Decofificador -> saída

## Tokenização

- Decompor o texto (por blocos)
- Valor de importância para cada palavra

![alt text](images/image2.png)

- Palavras repetidas mantém o mesmo indíce
- Podemos embaralhar os tokens e ainda assim formar frases corretas (como [1, 2,3,8] -> eu ouvi um gato) 

## Inserções

- Vetores
- Proximidade entre tokens ("cachorro" e "gato" são mais próximos entre si do que com "alto")

## Atenção

- Força de relações
- Decoficador e Codificador
- Influência entre tokens
- Probabilidade de sequência (como "latir" para "eu ouvi um cachorro")
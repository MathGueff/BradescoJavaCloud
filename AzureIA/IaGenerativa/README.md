# IA Generativa

> Precisa ser responsável

## Sumário

- [IA Generativa](#ia-generativa)
  * [O que é](#o-que)
  * [Modelos de Linguagem Grandes](#modelos-de-linguagem-grandes)
    + [Transformador](#transformador)
  * [Decodificador x Codificador](#decodificador-x-codificador)
  * [Tokenização](#tokeniza-o)
  * [Inserções](#inser-es)
  * [Atenção](#aten-o)
  * [Copilotos](#copilotos)
  * [Engenharia de Prompt](#engenharia-de-prompt)
    + [Linguagem Direta](#linguagem-direta)
    + [Mensagens do Sistema](#mensagens-do-sistema)
    + [Fornecer Exemplos](#fornecer-exemplos)
    + [Dados Básicos](#dados-b-sicos)
- [Conceitos Básicos do OpenAI do Azure](#conceitos-b-sicos-do-openai-do-azure)
  * [O que é?](#o-que)
  * [Como desenvolver](#como-desenvolver)
  * [Suporte](#suporte)
  * [Funcionalidades](#funcionalidades)
  * [IA Generativa Responsável](#ia-generativa-respons-vel)
    + [Identificar](#identificar)
    + [Medida](#medida)
    + [Mitigar](#mitigar)
    + [Operar](#operar)

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

## Copilotos

- Integração com outros aplicativos
- Ajuda com tarefas comuns

## Engenharia de Prompt

- Aprimoramento de Prompt
- Como fazer a melhor pergunta
- Qualidade das respostas das IAs

### Linguagem Direta

- Exemplos e dados básico
- O que você quer?
- Especificidade

### Mensagens do Sistema

- Descrever como deve funcionar
- Dar características para a resposta


### Fornecer Exemplos

- Fornecimento de respostas de exemplo
- LLMs (zero-shot)

### Dados Básicos

- Dados de fundamentação
- Contexto

# Conceitos Básicos do OpenAI do Azure

## O que é? 

> Solução de nuvem para modelos de linguagem grandes

- Modelos de IA Generativa pre definidos
- Funcionalidades de personalização
- Manipulação segura
- Segurança corporativa RBAC (Role Based Access Control)

## Como desenvolver

- Estúdio de IA do Azure
- API REST
- SKDS com suporte e CLI do Azure

## Suporte

LLMs (Large Language Model):
- GPT-4
- GPT-3.5
- Embeddings
- DALL-E (visualização)

## Funcionalidades

- Entender e criar linguagem natural
- Variações de imagem
- Transformar linguagem natural em código

## IA Generativa Responsável

### Identificar

- Possíveis danos
- Identificação de objetivo alcançado

### Medida

- Exposição de informações

### Mitigar

- Reduzir probabilidade de problemas
- E se isso não for o suficiente?

### Operar

- Seguindo o plano de implantação
- Responsável


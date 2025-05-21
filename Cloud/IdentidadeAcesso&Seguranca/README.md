# Identidade Acesso e Segurança

> Responsabilidade de quem usa (cliente)

## Sumário:
- [Microsoft Entra](#microsoft-entra)
- [Domain Services](#domain-services)
- [Autenticacao x Autorização](#autenticacao-x-autorizacao)
    + [Autenticação:](#autenticao)
    + [Autorização:](#autorizao)
  * [Autenticação multifator](#autenticao-multifator)
- [B2B e B2C](#b2b-e-b2c)
    + [B2B](#b2b)
    + [B2C](#b2c)
- [Acesso Condicional](#acesso-condicional)
- [Controle de Acesso baseado em Função](#controle-de-acesso-baseado-em-funcao)
- [Confiança Zero](#confianca-zero)
- [Microsoft Defender da Nuvem](#microsoft-defender-da-nuvem)

## Microsoft Entra

- Autenticação
- Teve mudança de nome recentemente
- Fazer login para acesso dos recursos
- Gerenciamento de identidades
- Logon único (SSO)
- B2B (Negocios para Negocios) -> 

## Domain Services

- Gerenciamento de controladores
- NameSpace
- Sincronizado com Microsoft Entra ID

## Autenticacao x Autorizacao

#### Autenticacao:
> Usuário e senha existem e podem entrar

#### Autorizacao:
> O que o usuário pode fazer (recursos que ele pode mexer)

### Autenticacao multifator

> Segurança adicional para entrar ,
- Algo que eu sei
- Algo que eu possuo
- Algo que eu tenho

## B2B e B2C

#### B2B

> Empresa acessa o serviço de outra empresa

#### B2C

> Consumidor final consome algo do serviço

## Acesso Condicional

- IP, localização, aplicativo

> Como por exemplo, quando um IP geralmente é acessado pelo usuário, mas é acessado em outro IP em um outro momento (detectando um acesso em local diferente do comum)

## Controle de Acesso baseado em Funcao

- Apenas a quantidade de acesso necessária para cada pessoa
- RBAC

> Obs: RBAC É um método de gestão de acesso que concede permissões aos usuários com base nas suas funções dentro de uma organização

## Confianca Zero 

- Dificultar falhas
- Pressupor que algo foi violado

```html
Exemplo da casa:
Muro alto, 
janelas, 
cameras de segurança, 
alarme...

Ou seja, adicionar camadas que complementem a anterior para que nada ocorra errado.
```

> Cada acesso é verificado continuamente, independentemente da origem.

## Microsoft Defender da Nuvem

- Detecção de ameaças 
- Estatísticas de segurança
- Camadas de segurança
- Recomendações de Segurança



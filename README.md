# Sistema Bancário em Java

## Descrição

Este é um sistema bancário em Java que simula operações básicas de contas bancárias, como **depósito**, **saque**, **transferência**, aplicação de **juros** (poupança) e **taxa de manutenção** (conta corrente). O sistema também oferece um **limite de cheque especial** para contas correntes e mantém um **histórico de transações**.

## Funcionalidades

- **Contas**:
  - `ContaCorrente`: Aplicação de taxa de manutenção e limite de cheque especial.
  - `ContaPoupanca`: Aplicação de juros.
  
- **Operações**:
  - Depósito, saque e transferência entre contas.
  - Histórico de transações.

- **Clientes**:
  - Cada cliente pode ter uma ou mais contas associadas.

## Classes

- **Banco**: Armazena e gerencia as contas, permite gerar relatórios sobre o saldo e número de contas ativas.
- **Cliente**: Representa o cliente do banco.
- **Conta**: Classe abstrata que contém métodos comuns a todas as contas.
- **ContaCorrente**: Herda de `Conta`, aplica taxa de manutenção e possui limite de cheque especial.
- **ContaPoupanca**: Herda de `Conta` e aplica juros.
- **Iconta**: Interface que define as operações comuns (depósito, saque, transferência).

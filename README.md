# 💻 Desafio DIO - Sistema Bancário com POO

## 📌 Sobre o Projeto
Este projeto faz parte do desafio da DIO para consolidar conceitos de **Programação Orientada a Objetos (POO)**.  
A aplicação simula um sistema bancário com funcionalidades de contas, depósitos, saques, transferências via PIX e extrato.

## 🚀 Funcionalidades
- Criar contas (Corrente e Poupança)
- Depositar valores
- Realizar saques
- Transferir valores entre contas
- Consultar extrato

## 🛠 Tecnologias Utilizadas
- Java 21
- IntelliJ IDEA
- Git & GitHub

## 📂 Estrutura de Classes
- `Cliente`
- `Conta` (abstrata)
- `ContaCorrente` (herda de Conta)
- `ContaPoupanca` (herda de Conta)
- `Main` (menu interativo)

## 📖 Conceitos de POO aplicados
- **Abstração** → classe `Conta` como modelo base
- **Encapsulamento** → atributos privados e métodos de acesso
- **Herança** → `ContaCorrente` e `ContaPoupanca` herdando de `Conta`
- **Polimorfismo** → método `imprimirExtrato()` sobrescrito em cada tipo de conta
- **Reuso de código** → construtores e métodos compartilhados

## ▶️ Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/thiagotj2/desafio-poo.git

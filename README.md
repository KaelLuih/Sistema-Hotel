# 🏨 Projeto de Técnicas de Programação - Sistema de Gestão de Hotel  

---

## 📋 Descrição  

Este projeto consiste no desenvolvimento de um **sistema de gestão para hotéis**, implementado em **Java**.
O sistema permite **cadastrar hóspedes, quartos, reservas e serviços**, além de realizar pesquisas, edições e cancelamentos.

Foi projetado para rodar no **terminal**, aplicando conceitos de **POO (Programação Orientada a Objetos)**, **listas genéricas** e **tratamento de erros**.

Além disso, foi desenvolvido um **front-end meramente ilustrativo**, utilizando HTML, Tailwind CSS e JavaScript, apenas para fins de apresentação visual, **sem estar conectado ao backend**.

---

## 🎯 Objetivos  
- 📝 **Cadastro completo** de hóspedes, quartos e reservas  
- 🔍 **Pesquisa por nome, tipo de quarto e reserva**  
- 🗂️ **Listagens organizadas** com `toString()`  
- ✏️ **Edição de dados** de hóspedes  
- ❌ **Cancelamento de reservas**  
- 🛠️ **Aplicação de POO**: encapsulamento, herança, polimorfismo e agregação  
- ⚡ **Tratamento de erros** para entradas inválidas
- 🎨 **Front-end ilustrativo** para simular a interface do sistema

---

## 🎞️ Demonstração do Projeto

<div align="center">
    <img src="/front/assets/gif.gif" alt="GIF demonstrando o projeto">
</div>

---


## 🛠️ Tecnologias Utilizadas  
<div align="center"> 
  <img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="20" alt="Java"> <strong>Java 17+</strong> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
  <img src="https://cdn-icons-png.flaticon.com/512/2111/2111432.png" width="20" alt="VS Code"> <strong>VS Code / IntelliJ</strong> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
  <img src="https://cdn-icons-png.flaticon.com/512/732/732212.png" width="20" alt="HTML"> <strong>HTML</strong> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
  <img src="https://cdn.worldvectorlogo.com/logos/tailwindcss.svg" width="20" alt="Tailwind"> <strong>Tailwind CSS</strong> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
  <img src="https://cdn-icons-png.flaticon.com/512/5968/5968292.png" width="20" alt="JavaScript"> <strong>JavaScript</strong> 
</div>

---

## 📂 Estrutura do Projeto  
```
Sistema-Hotel
├── .idea
├── out
└── front
    └── assets
        ├── gif.gif
        └── logo.png
    └── index.html                     
└── src
    └── br.com.sistemahotelaria
        ├── errors
            └── TratamentoDeErros
        ├── model
            ├── Hospede
            ├── Quarto
            ├── Reserva
            └── Usuario
        ├── service
            ├── Cadastro
            ├── Edicao
            ├── Pesquisa
            └── Service
        ├── view
            └── View
        └── Main
├── .gitignore
├── README.md
└── Sistema-Hotel-1.iml
```

---

## 🚀 Como Executar Localmente  

### Opção 1: Clonando o repositório  

1. Clone o repositório:
```
git clone https://github.com/KaelLuih/Sistema-Hotel.git
```
2. Entre na pasta:  
```
cd caminho-do-projeto
```
3. Compile o projeto:
```
javac src/**/*.java
```

---

## 👩‍💻 Autores  

| <img loading="lazy" src="https://avatars.githubusercontent.com/u/187458159?v=4" width="115"><br><sub><a href="https://github.com/Liiiiisssz">Elis Jasper</a><br><span style="color:#8A2BE2">💻 Desenvolvedora</span></sub> | <img loading="lazy" src="https://avatars.githubusercontent.com/u/189893504?v=4" width="115"><br><sub><a href="https://github.com/KaelLuih">Kael Luih de Araujo</a><br><span style="color:#00BFFF">💻 Desenvolvedor</span></sub> |
| :---: | :---: | 


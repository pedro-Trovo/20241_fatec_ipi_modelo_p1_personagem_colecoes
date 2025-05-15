<h1>Joguinho de Sobrevivência – Java POO</h1>

## Tópicos

- [Sobre o Projeto](#sobre-o-projeto)  
- [Estrutura do Projeto](#estrutura-do-projeto)  
- [Funcionalidades](#funcionalidades)  
- [Tecnologias](#tecnologias)  
- [Como executar o projeto](#como-executar-o-projeto)  

# Sobre o Projeto
Este projeto é um jogo simples de sobrevivência implementado em Java, com foco nos principais conceitos de Programação Orientada a Objetos (POO). Nele, dois personagens interagem em um ambiente fictício onde devem caçar, comer, dormir e batalhar entre si até que reste apenas um vencedor.


# Estrutura do Projeto
- JogoV1.java: Classe principal que controla a lógica do jogo, incluindo turnos, ações dos jogadores e sistema de batalha.

- Personagem.java: Representa cada jogador no jogo, com atributos como energia, fome e sono. Possui métodos para ações como comer, dormir, caçar e atacar.

- VetorDinamico.java: Implementação personalizada de um vetor dinâmico que funciona como inventário dos jogadores. A estrutura se redimensiona automaticamente conforme os itens são adicionados ou removidos.

# Funcionalidades

- Implementação de personagens com atributos e métodos para ações: caçar, comer, dormir e atacar.
- Inventário dinâmico para armazenar itens coletados.
- Sistema de rodadas com ações aleatórias para os jogadores.
- Condições de fim de jogo baseadas na energia dos personagens.
- Uso de classes separadas para organizar o código (`Personagem`, `VetorDinamico`, `JogoV1`).

# Tecnologias
<table align="center">
    <tr>
        <th>
            Linguagem
        </th>
        <td>
            <img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <th>
            Editor
        </th>
        <td>
            <img alt="Visual Studio Code" src="https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white"/>
        </td>
    </tr>
</table>

# Como executar o projeto

1. Clone este repositório:
```console
git clone https://github.com/pedro-Trovo/20241_fatec_ipi_modelo_p1_personagem_colecoes.git
```
2. Acesse a pasta do projeto:
```console
cd 20241_fatec_ipi_modelo_p1_personagem_colecoes
```
3. Compile os arquivos Java:
```console
javac JogoV1.java Personagem.java VetorDinamico.java
```
4. Execute o jogo:
```console
java JogoV1
```






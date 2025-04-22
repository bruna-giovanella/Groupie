# Sistema de Gerenciamento de Áudio

Este projeto foi desenvolvido como parte do curso **"Java: aplicando a Orientação a Objetos"** da plataforma Alura. Seu objetivo é consolidar os conceitos fundamentais de **programação orientada a objetos (POO)** aplicados ao desenvolvimento de uma aplicação em Java.

---

## Descrição

A aplicação simula um sistema de gerenciamento de mídias de áudio, com suporte a diferentes tipos de conteúdo, como **músicas** e **podcasts**. O projeto utiliza princípios essenciais de orientação a objetos, como:

- Herança
- Encapsulamento
- Polimorfismo
- Abstração via interfaces
- Reuso e organização de código

---

## Estrutura do Projeto

### Classe `Audio`

Classe base que representa uma mídia genérica de áudio. Contém os atributos e comportamentos comuns entre músicas e podcasts, como:

- `titulo`
- `avaliacao`
- `totalCurtidas`
- `totalReproducoes`
- `duracaoEmSegundos`

Também possui métodos utilitários como:

- `curte()`
- `descurte()`
- `duracaoFormatada()`

### Classe `Musica` (extends `Audio`)

Especialização da classe `Audio` para representar uma música. Adiciona os seguintes atributos:

- `artista`
- `album`
- `genero`

Implementa a interface `Exibivel` com o método `fichaTecnica()`, responsável por exibir os detalhes da música de forma formatada.

### Classe `Podcast` (extends `Audio`)

Especialização da classe `Audio` para representar um podcast. Inclui atributos específicos como:

- `host`
- `descricao`
- `quantiaDeEpisodios`

Também implementa a interface `Exibivel`, com uma versão própria do método `fichaTecnica()`.

### Interface `Exibivel`

Define um contrato para classes que devem fornecer uma ficha técnica de apresentação:

```java
public interface Exibivel {
    String fichaTecnica();
}

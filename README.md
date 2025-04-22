# 🎵 Groupie - Sistema de Mídia em Java

Projeto desenvolvido para consolidar os aprendizados do curso **"Java: aplicando a Orientação a Objetos"** da Alura.

---

## 📚 Descrição

Este projeto simula um sistema de gerenciamento de **mídias de áudio**, como **músicas** e **podcasts**, utilizando os princípios da **programação orientada a objetos** (POO) com Java.

A ideia é treinar conceitos fundamentais como:

- Herança
- Encapsulamento
- Polimorfismo
- Interfaces
- Reuso de código
- Boas práticas de modelagem

---

## 🧱 Estrutura do Projeto

O projeto é composto por três principais entidades:

### 🔊 `Audio` (Classe base)
Representa qualquer conteúdo de áudio. Contém atributos e métodos comuns a músicas e podcasts, como:

- `titulo`
- `avaliacao`
- `totalCurtidas`
- `totalReproducoes`
- `duracaoEmSegundos`
- Métodos: `curte()`, `descurte()`, `duracaoFormatada()`, etc.

---

### 🎵 `Musica` (Herda de `Audio`)
Adiciona informações específicas de uma música:

- `artista`
- `album`
- `genero`

Implementa o método `fichaTecnica()` da interface `Exibivel`, retornando uma ficha formatada com os dados da música.

---

### 🎙️ `Podcast` (Herda de `Audio`)
Adiciona informações específicas de um podcast:

- `host`
- `descricao`
- `quantiaDeEpisodios`

Também implementa `fichaTecnica()` para exibir uma ficha com os dados do podcast.

---

### 📄 `Exibivel` (Interface)
Define o contrato de que qualquer conteúdo exibível deve implementar:

```java
public interface Exibivel {
    String fichaTecnica();
}

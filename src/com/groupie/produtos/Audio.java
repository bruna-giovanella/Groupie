package com.groupie.produtos;

public class Audio {
    // Atributos - Música/Podcast
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int avaliacao;
    private boolean estaTocando;


    // Métodos - Música/Podcast
    public void curte() {
        totalCurtidas++;
    }

    public void descurte() {
        totalCurtidas--;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public int getTotalReproducoes() { return totalReproducoes; }
    public int getTotalCurtidas() { return totalCurtidas; }
    public int getAvaliacao() { return avaliacao; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setTotalReproducoes(int totalReproducoes) { this.totalReproducoes = totalReproducoes; }
    public void setTotalCurtidas(int totalCurtidas) { this.totalCurtidas = totalCurtidas; }

    public void setEstaTocando(boolean estaTocando) { this.estaTocando = estaTocando;
        // Aumenta a quantia de reproduções a cada play
        if (estaTocando) { this.totalReproducoes++; }
    }

    public void setAvaliacao(int avaliacao){
        if (avaliacao < 0 || avaliacao > 10) {
            throw new IllegalArgumentException("A avaliacao deve estar entre 0 e 10.");
        } else {
            this.avaliacao = avaliacao;
        }
    }

}
package com.groupie.produtos;

public class Audio {
    // Atributos - Música/Podcast
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int avaliacao;
    private boolean estaTocando;
    private int duracaoEmSegundos;

    // Métodos - Música/Podcast
    public void curte() {
        totalCurtidas++;
    }

    public void descurte() {
        totalCurtidas--;
    }

    public String duracaoFormatada() {
        if (this.duracaoEmSegundos >= 3600) {
            int horas = this.duracaoEmSegundos / 3600;
            int minutos = (this.duracaoEmSegundos % 3600) / 60;
            int segundos = this.duracaoEmSegundos % 60;
            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        } else {
            int minutos = this.duracaoEmSegundos / 60;
            int segundos = this.duracaoEmSegundos % 60;
            return String.format("%02d:%02d", minutos, segundos);
        }
    }


    // Getters
    public String getTitulo() { return titulo; }
    public int getTotalReproducoes() { return totalReproducoes; }
    public int getTotalCurtidas() { return totalCurtidas; }
    public int getAvaliacao() { return avaliacao; }
    public String getDuracao() { return duracaoFormatada(); }


    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setTotalReproducoes(int totalReproducoes) { this.totalReproducoes = totalReproducoes; }
    public void setTotalCurtidas(int totalCurtidas) { this.totalCurtidas = totalCurtidas; }
    public void setDuracaoEmSegundos(int duracaoEmSegundos) { this.duracaoEmSegundos = duracaoEmSegundos; }

    public void setEstaTocando(boolean estaTocando) {
        this.estaTocando = estaTocando;
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
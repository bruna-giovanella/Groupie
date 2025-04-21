package com.groupie.produtos;

public class Podcast extends Audio implements Exibivel{
    private String host;
    private String descricao;
    private int quantiaDeEpisodios;

    @Override
    public String fichaTecnica() {
        return String.format("""
                                                      Dados de %s
                                                Host:               %s
                                                Descrição:          %s
                                                Episódios:          %d

                                                Curtidas:           %d
                                                Reproduções:        %d
                                                Sua avaliação:      %d
                                                """, getTitulo(),
                                                    this.host,
                                                    this.descricao,
                                                    this.quantiaDeEpisodios,

                                                    getTotalCurtidas(),
                                                    getTotalReproducoes(),
                                                    getAvaliacao());
    }

    // Getters
    public String getHost() { return host; }
    public String getDescricao() {return descricao; }
    public int getQuantiaDeEpisodios() { return quantiaDeEpisodios; }

    // Setters
    public void setHost(String host) { this.host = host; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setQuantiaDeEpisodios(int quantiaDeEpisodios) { this.quantiaDeEpisodios = quantiaDeEpisodios; }

}

package com.groupie.produtos;

public class Musica extends Audio implements Exibivel{
    private String artista;
    private String album;
    private String genero;

    @Override
    public String fichaTecnica() {
        return String.format("""
                                                      Dados de %s
                                                Artista:            %s
                                                Album:              %s
                                                Genero:             %s

                                                Curtidas:           %d
                                                Reproduções:        %d
                                                Sua avaliação:      %d
                                                """, getTitulo(),
                                                    this.artista,
                                                    this.album,
                                                    this.genero,

                                                    getTotalCurtidas(),
                                                    getTotalReproducoes(),
                                                    getAvaliacao());
    }

    // Getters
    public String getArtista() { return artista; }
    public String getAlbum() { return album; }
    public String getGenero() {return genero; }

    // Setters
    public void setArtista(String artista) { this.artista = artista; }
    public void setAlbum(String album) { this.album = album; }
    public void setGenero(String genero) { this.genero = genero; }
}

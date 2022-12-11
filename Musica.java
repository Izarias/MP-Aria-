package com.mycompany.aria;
public class Musica {
    //Atributos
    private String nomeMusica;
    private String letra;
    private String album;
    private Artista artista;
    
    //Construtor
    public Musica(String nomeMusica, String letra, String album, Artista artista) {
        this.nomeMusica = nomeMusica;
        this.letra = letra;
        this.album = album;
        this.artista = artista;
    }
    
    //Gets e sets
    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    //Outros metodos
    public void dadosMusica(){
        
    }

    @Override
    public String toString() {
        return "Musica{" + "nomeMusica=" + this.getNomeMusica() + ", letra=" + this.getLetra() + ", album=" + this.getAlbum() + ", artista=" + this.getArtista() + '}';
    }
}

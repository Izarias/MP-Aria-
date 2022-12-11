package com.mycompany.aria;
public class Playlist {
    //Atributos
    private String nomePlaylist;
    private Usuario usuario;
    private Musica musicas[];
    
    //Construtor
    public Playlist(String nomePlaylist, Usuario usuario) {
        this.nomePlaylist = nomePlaylist;
        this.usuario = usuario;
    }
    public String getNomePlaylist(){
        return nomePlaylist;
    
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    //Gets e sets
    public void setMusicas(Musica[] musicas) {    
        this.musicas = musicas;
    }

    //Metodos
    public void adicionarMusica(Musica song) {
     
    }
    
    public void retirarMusica(){
    
    }
 
    @Override
    public String toString() {
        return "Playlist{" + "nomePlaylist=" + nomePlaylist + ", usuario=" + usuario + ", musicas=" + musicas + '}';
    }  
}

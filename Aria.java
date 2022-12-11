package com.mycompany.aria;
public class Aria {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pedro","7lYS3vH@3u3^");
       
        Artista artista1 = new Artista("Guns n Roses","senha123");
        Artista artista2 = new Artista("Bob Dylan","senha345");
       
        Musica m[] = new Musica[10];
        m[0] = new Musica("My michelle","Well, well, well you just can't tell, Well, well, well my Michelle","Appetite for Destruction" , artista1);
        m[1] = new Musica("It's So Easy","It's so easy, easy, When everybody's trying to please me, baby", "Appetite for Destruction" , artista2);
  
        Playlist playlist1 = new Playlist("Playlist do Pedro",usuario1);
        
        playlist1.adicionarMusica(m[0]);
        
        System.out.println(usuario1.toString());
        System.out.println(artista1.toString());
        System.out.println(artista2.toString());
        System.out.println(m[0].toString());
        System.out.println(m[1].toString());
        System.out.println(playlist1.toString());
       
       
       
       
       
       
       
       
        
       
       
       
       

       
       
       
   
       
       
       
    }
}

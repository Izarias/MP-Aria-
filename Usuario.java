package com.mycompany.aria;
public class Usuario implements Funcoes{
    //Atributos
    private String nomeUsuario;
    private String senha;
    
    //Gets e sets
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    } 
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Construtor
    public Usuario(String nomeUsuario, String senha) {    
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    //Metodos da interface
    @Override
    public void listarMusicaArtista() {
    }

    @Override
    public void buscarMusica() {
    }

    @Override
    public void deletarConta() {
    }

    @Override
    public void editarConta() {
    }

    @Override
    public void dadosConta() {
    }
    
    //Outros metodos
    @Override
    public String toString() {
        return "Usuario{" + "nomeUsuario=" + nomeUsuario + ", senha=" + senha + '}';
    } 
}

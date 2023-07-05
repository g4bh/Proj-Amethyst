package com.example.Rede.Social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.ArrayList;

@SpringBootApplication

public class Usuario {
	private int id;
	private String nome;
	private String foto;
	private String localizacao;
	private List<String> interesses;
	private List<Usuario> amigos;
	private List<Grupo> grupos;
	private List<Usuario> seguidores;
	private List<Pagina> paginas;
	
	public Usuario (int id, String nome, String foto, String localizacao, List<String> interesses, List<Usuario> amigos, List<Usuario> seguidores, List<Pagina> paginas) {
		this.id = id;
		this.foto = foto;
		this.localizacao = localizacao;
		this.interesses = interesses;
		this.amigos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.paginas = new ArrayList<>();
	}
	
	public void adicionarAmigo(Usuario amigo) {
        if (!amigos.contains(amigo)) {
            amigos.add(amigo);
            amigo.adicionarAmigo(this);
        }
    }

    public void removerAmigo(Usuario amigo) {
        if (amigos.contains(amigo)) {
            amigos.remove(amigo);
            amigo.removerAmigo(this);
        }
    }
	
	

}


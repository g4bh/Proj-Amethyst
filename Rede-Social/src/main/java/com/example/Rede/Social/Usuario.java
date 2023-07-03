package com.example.Rede.Social;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

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
}


package com.example.Rede.Social;

import java.util.List;

public class Pagina {
	private int id;
	private String nome;
	private String descricao;
	private List<Usuario> seguidores;
	
	public Pagina(int id, String nome, String descricao, List<Usuario> seguidores) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.seguidores = seguidores;
	}

}

package com.example.Rede.Social;

import javax.xml.crypto.Data;

public class Evento {
	
	private int id;
	private String nome;
	private String descricao;
	private Data data;
	private String localizacao;
	
	
	public Evento(int id, String nome, String descricao, Data data, String localizacao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.localizacao = localizacao;
		
	}
	
}

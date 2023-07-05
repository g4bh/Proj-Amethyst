package com.example.Rede.Social;

import javax.xml.crypto.Data;

public class Comentario {
	private int id;
	private String texto;
	private Usuario autor;
	private Data data;
	
	public Comentario (int id, String texto, Usuario autor, Data data) {
		this.id = id;
		this.texto = texto;
		this.autor = autor;
		this.data = data;
	}

}

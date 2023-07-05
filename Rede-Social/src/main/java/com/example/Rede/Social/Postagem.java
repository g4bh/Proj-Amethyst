package com.example.Rede.Social;

import java.util.Date;
import java.util.List;

public class Postagem {
	private int id;
	private String texto;
	private Usuario autor;
	private Date data;
	private List<Comentario> comentarios;
	
	public Postagem (int id, String texto, Usuario autor, Date data, List<Comentario> comentarios) {
		this.id = id;
		this.texto = texto;
		this.autor = autor;
		this.data = data;
		this.comentarios = comentarios;
	}

}

package com.example.Rede.Social;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
	private int id;
	private String nome;
	private String descricao;
	private List<Usuario> membros;
	
	public Grupo(int id, String nome, String descricao, List<Usuario> membros) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
    }
	
	public void adicionarMembro(Usuario usuario) {
		if(membros.contains(usuario)) {
			
		}
		else {
			membros.add(usuario);
			System.out.println("usuario adicionado");
			}
	}
	
	public void removerMembro(Usuario usuario) {
		if(membros.contains(usuario)) {
			membros.remove(usuario);
			System.out.println("Usuario removido");
		}
	}
	
	
}

package br.aracomp.livariaHibernate.model;

import java.util.ArrayList;

public class Editora {
	
	private String nome;
	private int id;
	private String email;
	private ArrayList<Livro> livros;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	public ArrayList<Livro> getLivros() {
		return livros;
	}

}

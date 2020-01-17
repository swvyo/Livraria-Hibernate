package br.aracomp.livariaHibernate.model;


import java.util.ArrayList;

public class Autor {
	
	
	
	private int id;
	private String nome;
	private String telefone;
	private ArrayList<Livro> livrosPublicados;
	
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setLivrosPublicados(ArrayList<Livro> livrosPublicados) {
		this.livrosPublicados = livrosPublicados;
	}
	
	public ArrayList<Livro> getLivrosPublicados() {
		return livrosPublicados;
	}
			
}


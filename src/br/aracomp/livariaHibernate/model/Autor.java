package br.aracomp.livariaHibernate.model;


import java.util.ArrayList;

public class Autor extends Pessoa{
	
	
	private ArrayList<Livro> livrosPublicados;
	private int avaliacao;

	
	public void setLivrosPublicados(ArrayList<Livro> livrosPublicados) {
		this.livrosPublicados = livrosPublicados;
	}
	
	public ArrayList<Livro> getLivrosPublicados() {
		return livrosPublicados;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
			
}


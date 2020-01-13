package br.aracomp.livariaHibernate.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	 private int id;
	 private double credito = 0;
	 private ArrayList<Livro> livrosComprados;
	 private ArrayList<Livraria> livrarias;
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Livro> getLivrosComprados() {
		return livrosComprados;
	}
	public void setLivrosComprados(ArrayList<Livro> livrosComprados) {
		this.livrosComprados = livrosComprados;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	public ArrayList<Livraria> getLivrarias() {
		return livrarias;
	}
	public void setLivrarias(ArrayList<Livraria> livrarias) {
		this.livrarias = livrarias;
	}
	 
}

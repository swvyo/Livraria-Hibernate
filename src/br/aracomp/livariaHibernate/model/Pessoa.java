package br.aracomp.livariaHibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne   
	@JoinColumn(name="endereco_id", referencedColumnName="id",nullable=true)
	private Endereco endereco;
	private String telefone;
	private String nome;
	 
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String telefone, Endereco endereco) {
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		
	}
	
	public int getId() {
		return id;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

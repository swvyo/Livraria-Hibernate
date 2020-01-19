package br.aracomp.livariaHibernate.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pais;
	private String cep;
	private String estado;
	private String cidade;
	private int numero;
	@OneToMany(mappedBy="endereco", targetEntity = Pessoa.class) 
	private Collection pessoas;
	
	public Endereco() {
		
	}
	
	public Endereco(String pais,String cep,String estado, String cidade, int numero) {
		this.pais = pais;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.numero = numero;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	public Collection getPessoas() {
		return pessoas;
	}
	public void setPessoas(Collection pessoas) {
		this.pessoas = pessoas;
	}
}

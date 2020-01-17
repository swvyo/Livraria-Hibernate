package br.aracomp.livariaHibernate.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Livraria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String endereco;
	private String telefone;
	private String nome;
	private double faturamento;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Cliente> clientes;
	private ArrayList<Livro> livros;
	
	public Livraria() {
		
		
	}
	public Livraria(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
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
	public double getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	
}

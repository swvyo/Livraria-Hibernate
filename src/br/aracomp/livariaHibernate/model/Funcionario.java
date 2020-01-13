package br.aracomp.livariaHibernate.model;

import java.util.ArrayList;

public class Funcionario  extends Pessoa{
	
	private int cod;
	private double vendas;
	private double salario;
	private double comissao;
	private Livraria livraria;
	
	public Funcionario(Livraria livraria, double salario) {
		this.salario = salario;
		this.livraria = livraria;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public Livraria getLivraria() {
		return livraria;
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}

	public boolean vender(ArrayList<Livro> livros, Cliente cliente, double valor) {
		valor = valor + cliente.getCredito();
		double precoCompra = 0;
		for(int i = 0; i<= livros.size();i++) {
			precoCompra += livros.get(i).getPreco();
		}
		
		if (valor >= precoCompra) {
			System.out.println("Compra Aprovada! ");
			double troco = precoCompra - valor;
			double creditoEstatico = addCredito(cliente,troco,livros.size());
			double comissaoEstatica= livros.size()*0.5;
			tirarEstoque(livros);
			this.setComissao(comissaoEstatica);
			faturamento(precoCompra,creditoEstatico,comissaoEstatica);
			return true;
		}else {
			System.out.println("Valor Insuficiente");
			return false;
		}
	}
	
	
	private void tirarEstoque(ArrayList<Livro> livros) {
		for(int i = 0; i<= livros.size();i++) {
			livros.get(i).setQuantidadeEmEstoque(livros.get(i).getQuantidadeEmEstoque() - 1);
		}
	}
	
	private double addCredito(Cliente cliente, double troco, int quantidadeLivros) {
		boolean clienteQuerTroco = false;
		if(clienteQuerTroco) {
			troco = 0;
		}
		double credito = (quantidadeLivros*0.2) + troco;
		cliente.setCredito(credito);
		return credito;
	}
	
	private void faturamento(double precoCompra,double credito, double comissao) {
		double fat = precoCompra-credito-comissao;
		livraria.setFaturamento(fat);
	}

}
package br.aracomp.livariaHibernate.model;


public class Livro {
	
	private String titulo;
	private int id;
	private double preco;
	private int anoLancamento;
	private Editora editora;
	private Autor autor;
	private String classificacaoIndicativa;
	private String sinopse;
	private int avaliacao;
	private int quantidadeEmEstoque;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	
	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	public void setAvaliacao(int avaliacao) {
		if(avaliacao>5 || avaliacao<0) {
			System.out.println("INVÁLIDO! (a avaliação deve ser dada de 0 até 5)");
		}else {
			this.avaliacao = avaliacao;
		}
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
}

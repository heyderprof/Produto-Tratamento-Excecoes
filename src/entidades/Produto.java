package entidades;

import java.text.DecimalFormat;

import excecoes.PrecoInvalidoException;

public class Produto {
	
	private String nome;
	private String categoria;
	private double preco;
	private int qtd;
	
	public Produto() {

	}
	
	public Produto(String nome, String categoria, double preco, int qtd) {
		
		if (preco <= 0) {
			throw new PrecoInvalidoException("O preço não pode ser zero ou menor que zero");
		}
		
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double calcValorTotal() {
		return preco * qtd;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00"); //utilizando o DecimalFormat para que os valores apareçam com 2 casas decimais
		return  "\n*** CADASTRO REALIZADO COM SUCESSO***\n" +
				"PRODUTO: " + nome + "\n" +
				"CATEGORIA: " + categoria + "\n" +
				"PREÇO: " + df.format(preco) + "\n" +
				"QUANTIDADE: " + qtd + "\n" +
				"VALOR TOTAL: R$" + df.format(calcValorTotal());
	}

}

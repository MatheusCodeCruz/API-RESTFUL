package br.com.api.farmacia.domain;

import java.util.List;

public class Farmacia {

	 private Long id;
	 private String nome;
	 private List<Produto> produtos;

//	public Farmacia(String endereco, String telefone, String produto) {
//		this.endereco = endereco;
//		this.telefone = telefone;
//		this.produto = produto;
//	}

	public Farmacia(Long id, String nome, List<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
	}


	public class Produto {
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		private Long id;
	    private String nome;
	    private double preco;
		
	    public Produto(Long id, String nome, double preco) {
			super();
			this.id = id;
			this.nome = nome;
			this.preco = preco;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}  

}

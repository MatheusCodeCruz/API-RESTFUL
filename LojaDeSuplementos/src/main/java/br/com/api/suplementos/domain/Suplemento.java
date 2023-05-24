package br.com.api.suplementos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="suplemento")
public class Suplemento {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="sup_cd_id")
	 	private Long id;
		
		@Column(name="sup_tx_nome")
	    private String nome;
		
		@Column(name="sup_tx_marca")
		private String marca;
		
		@Column(name="sup_mn_preco")
		private double preco;
		
	    public Suplemento() {
	    	
	    }
	    
	    public Suplemento(Long id, String nome, String marca, double preco) {
			this.id = id;
			this.nome = nome;
			this.marca = marca;
			this.preco = preco;
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

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

}


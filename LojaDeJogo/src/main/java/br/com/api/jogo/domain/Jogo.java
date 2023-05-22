package br.com.api.jogo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jg_cd_id")
	private Long id;
	@Column(name="jg_tx_nome")
	private String nome;
	@Column(name="jg_tx_plat")
    private String plataforma;
	@Column(name="jg_mn_preco")
    private double preco;

	public Jogo(){	
	}
	
    public Jogo(Long id, String nome, String plataforma, double preco) {
    	this.id = id;
    	this.nome = nome;
    	this.plataforma = plataforma;
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

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
	
package br.com.lojadegames.lojadegames.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Categoria {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@OneToMany(mappedBy = "categoriaPertencente")
	@JsonIgnoreProperties
	private List<Produto> produtoComprado = new ArrayList<>();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutoComprado() {
		return produtoComprado;
	}

	public void setProdutoComprado(List<Produto> produtoComprado) {
		this.produtoComprado = produtoComprado;
	}
	
	
	
	
}

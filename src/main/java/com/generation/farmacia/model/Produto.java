package com.generation.farmacia.model;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Produto não pode estar vazio")
	@Size(min = 5, max = 50, message = "o atributo Porduto deve ter entre 5 e 50 caracteres")
	@Column(length = 50)
	private String produto;
	
	@NotBlank(message = "O atributo Imagem não pode estar vazio")
	@URL(message = "O atributo Imagem deve ser uma Url")
	@Size(max = 255, message = "O atributo Imagem deve ter no maximo 255 caracteres")
	private String imagem;
	
	@NotNull(message = "O atributo Valor não pode estar vazio")
	@Positive(message = "O atributo Valor deve ser maior que 0")
	private BigDecimal valor;
	
	@NotNull(message = "O atributo Estoque não pode estar vazio")
	@Positive(message = "O atributo Estoque deve ser maior ou igual a 0")
	private Long estoque;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getEstoque() {
		return estoque;
	}

	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}

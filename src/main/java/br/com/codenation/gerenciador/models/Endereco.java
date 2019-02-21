package br.com.codenation.gerenciador.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

public class Endereco extends AbstractEntity {

	private String logradouro;

	@NotBlank
	@Size(min = 3, max = 100)
	private String bairro;

	@NotBlank
	@Size(min = 3, max = 100)
	private String cidade;

	@NotNull(message = "{NotNull.endereco.uf}")
	private UF uf;

	@NotBlank
	@Size(min = 9, max = 9, message = "{Size.endereco.cep}")
	private String cep;

	private Integer numero;

	@Size(max = 100)
	private String complemento;

	public Endereco() {
		super();
		setId(UUID.randomUUID().toString());
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}

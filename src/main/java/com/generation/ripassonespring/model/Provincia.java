package com.generation.ripassonespring.model;

import jakarta.persistence.*;

import java.util.StringJoiner;

@Entity
public class Provincia
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private int abitanti;

	@ManyToOne
	@JoinColumn(name = "id_regione")
	private Regione regione;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getAbitanti()
	{
		return abitanti;
	}

	public void setAbitanti(int abitanti)
	{
		this.abitanti = abitanti;
	}

	public Regione getRegione()
	{
		return regione;
	}

	public void setRegione(Regione regione)
	{
		this.regione = regione;
	}

	@Override
	public String toString()
	{
		return new StringJoiner(", ", Provincia.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("nome='" + nome + "'")
				.add("abitanti=" + abitanti)
				.toString();
	}
}

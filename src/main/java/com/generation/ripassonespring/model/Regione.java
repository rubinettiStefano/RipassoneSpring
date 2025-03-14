package com.generation.ripassonespring.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@Entity
public class Regione
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome, areaGeografica;

	@OneToMany(mappedBy = "regione",fetch = FetchType.EAGER)
	private List<Provincia> provincias = new ArrayList<>();

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

	public String getAreaGeografica()
	{
		return areaGeografica;
	}

	public void setAreaGeografica(String area_geografica)
	{
		this.areaGeografica = area_geografica;
	}

	public List<Provincia> getProvincias()
	{
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias)
	{
		this.provincias = provincias;
	}

	@Override
	public String toString()
	{
		return new StringJoiner(", ", Regione.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("nome='" + nome + "'")
				.add("area_geografica='" + areaGeografica + "'")
				.toString();
	}
}

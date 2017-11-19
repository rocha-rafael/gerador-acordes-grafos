package br.com.base;

import java.util.List;

public class Instrumento
{
	String nome;
	List<Corda> cordas;

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public List<Corda> getCordas()
	{
		return cordas;
	}

	public void setCordas(List<Corda> cordas)
	{
		this.cordas = cordas;
	}

}

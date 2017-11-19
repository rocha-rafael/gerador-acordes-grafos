package br.com.base;

import java.util.List;

public class Corda
{
	private Integer numero;
	private List<Casa> casas;

	public Integer getNumero()
	{
		return numero;
	}

	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	public List<Casa> getCasas()
	{
		return casas;
	}

	public void setCasas(List<Casa> casas)
	{
		this.casas = casas;
	}
	
	public Corda(List<Casa> casas, Integer numero)
	{
		this.casas = casas;
		this.numero = numero;
	}
}

package br.com.base;

import java.util.List;

public abstract class Acorde
{
	private String nome;
	private List<Nota> notas;

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public List<Nota> getNotas()
	{
		return notas;
	}

	public void setNotas(List<Nota> notas)
	{
		this.notas = notas;
	}
	
	public abstract List<String> formarAcorde(String notaInicial, boolean maior, boolean setimaMaior, boolean setimaMenor);

}

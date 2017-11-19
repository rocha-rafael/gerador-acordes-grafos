package br.com.base;

public class Casa
{
	Integer numero;
	Nota nota;

	public Integer getNumero()
	{
		return numero;
	}

	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	public Nota getNota()
	{
		return nota;
	}

	public void setNota(Nota nota)
	{
		this.nota = nota;
	}

	public Casa(Nota nota, Integer numero)
	{
		this.nota = nota;
		this.numero = numero;
	}

}

package br.com.teoria;

import java.util.List;

import br.com.base.Acorde;

public abstract class Escala
{
	private List<NotaEscala> notas;

	public List<NotaEscala> getNotas()
	{
		return notas;
	}

	public void setNotas(List<NotaEscala> notas)
	{
		this.notas = notas;
	}
	
	public abstract Acorde formarAcorde(String notaInicial, boolean setima);

}

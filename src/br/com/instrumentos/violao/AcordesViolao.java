package br.com.instrumentos.violao;

import java.util.List;

import br.com.base.Acorde;
import br.com.base.Nota;

public class AcordesViolao extends Acorde
{
	private List<Integer> cordas;
	private List<Integer> casas;

	public List<Integer> getCordas()
	{
		return cordas;
	}

	public void setCordas(List<Integer> cordas)
	{
		this.cordas = cordas;
	}

	public List<Integer> getCasas()
	{
		return casas;
	}

	public void setCasas(List<Integer> casas)
	{
		this.casas = casas;
	}
}

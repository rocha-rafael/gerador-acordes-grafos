package br.com.teoria;
import br.com.base.Nota;

/*
 * Diferentemente da classe nota na base, essa classe constará com um nome e um peso, para poder
 * ser formado os acordes, ex: escala de DÓ C, D, E... C = 1, D = 2, E= 3...
 */
public class NotaEscala extends Nota
{
	private Double peso;

	public Double getPeso()
	{
		return peso;
	}

	public void setPeso(Double peso)
	{
		this.peso = peso;
	}
	
	public NotaEscala(String nome, Double peso)
	{
		super(nome);
		this.peso = peso;
	}
}

package br.com.teoria.escalas.sustenidas;

import java.util.ArrayList;
import java.util.List;

import br.com.teoria.Escalas;
import br.com.teoria.NotaEscala;

public class Fsustenido extends Escalas
{
	private List<NotaEscala> notasEscalaFsustenido;

	public List<NotaEscala> getNotasEscalaFsustenido()
	{
		return notasEscalaFsustenido;
	}

	public void setNotasEscalaFsustenido(List<NotaEscala> notasEscalaFsustenido)
	{
		this.notasEscalaFsustenido = notasEscalaFsustenido;
	}

	public Fsustenido()
	{
		List<NotaEscala> notasEscalaAdicionar = new ArrayList<NotaEscala>();

		NotaEscala Fsustenido = new NotaEscala("F#", 1.0);
		NotaEscala G = new NotaEscala("G", 1.5);
		NotaEscala Gsustenido = new NotaEscala("G#", 2.0);
		NotaEscala A = new NotaEscala("A", 2.5);
		NotaEscala Asustenido = new NotaEscala("A#", 3.0);
		NotaEscala B = new NotaEscala("B", 3.5);
		NotaEscala C = new NotaEscala("C", 4.0);
		NotaEscala Csusteinido = new NotaEscala("C#", 4.5);
		NotaEscala D = new NotaEscala("D", 5.0);
		NotaEscala Dsustenido = new NotaEscala("D#", 5.5);
		NotaEscala E = new NotaEscala("E", 6.0);
		NotaEscala F = new NotaEscala("F", 6.5);

		notasEscalaAdicionar.add(C);
		notasEscalaAdicionar.add(Csusteinido);
		notasEscalaAdicionar.add(D);
		notasEscalaAdicionar.add(Dsustenido);
		notasEscalaAdicionar.add(E);
		notasEscalaAdicionar.add(F);
		notasEscalaAdicionar.add(Fsustenido);
		notasEscalaAdicionar.add(G);
		notasEscalaAdicionar.add(Gsustenido);
		notasEscalaAdicionar.add(A);
		notasEscalaAdicionar.add(Asustenido);
		notasEscalaAdicionar.add(B);

		this.setNotasEscalaFsustenido(notasEscalaAdicionar);
	}
	
	@Override
	public List<String> formarAcorde(Double primeiraNota, Double segundaNota, Double terceiraNota, Double setimaNota)
	{
		List<String> notasAcorde = new ArrayList<String>();
		
		for(NotaEscala ne : this.getNotasEscalaFsustenido())
		{
			if(ne.getPeso().doubleValue() == primeiraNota.doubleValue())
			{
				notasAcorde.add(ne.getNome());
				continue;
			}
			
			if(ne.getPeso().doubleValue() == segundaNota.doubleValue())
			{
				notasAcorde.add(ne.getNome());
				continue;
			}
			
			if(ne.getPeso().doubleValue() == terceiraNota.doubleValue())
			{
				notasAcorde.add(ne.getNome());
				continue;
			}
			
			if(setimaNota != null)
			{
				if(ne.getPeso().doubleValue() == setimaNota.doubleValue())
				{
					notasAcorde.add(ne.getNome());
					continue;
				}
			}
		}
		
		return notasAcorde;
	}
}

package br.com.teoria.escalas.normais;

import java.util.ArrayList;
import java.util.List;

import br.com.teoria.Escalas;
import br.com.teoria.NotaEscala;

public class E extends Escalas
{
	private List<NotaEscala> notasEscalaEmaior;

	public List<NotaEscala> getNotasEscalaEmaior()
	{
		return notasEscalaEmaior;
	}

	public void setNotasEscalaEmaior(List<NotaEscala> notasEscalaEmaior)
	{
		this.notasEscalaEmaior = notasEscalaEmaior;
	}

	public E()
	{
		List<NotaEscala> notasEscalaAdicionar = new ArrayList<NotaEscala>();
		
		NotaEscala E = new NotaEscala("E", 1.0);
		NotaEscala F = new NotaEscala("F", 1.5);
		NotaEscala Fsustenido = new NotaEscala("F#", 2.0);
		NotaEscala G = new NotaEscala("G", 2.5);
		NotaEscala Gsustenido = new NotaEscala("G#", 3.0);
		NotaEscala A = new NotaEscala("A", 3.5);
		NotaEscala Asustenido = new NotaEscala("A#", 4.0);
		NotaEscala B = new NotaEscala("B", 4.5);
		NotaEscala C = new NotaEscala("C", 5.0);
		NotaEscala Csusteinido = new NotaEscala("C#", 5.5);
		NotaEscala D = new NotaEscala("D", 6.0);
		NotaEscala Dsustenido = new NotaEscala("D#", 6.5);
		
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
		
		this.setNotasEscalaEmaior(notasEscalaAdicionar);
	}
	
	@Override
	public List<String> formarAcorde(Double primeiraNota, Double segundaNota, Double terceiraNota, Double setimaNota)
	{
		List<String> notasAcorde = new ArrayList<String>();
		
		for(NotaEscala ne : this.getNotasEscalaEmaior())
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

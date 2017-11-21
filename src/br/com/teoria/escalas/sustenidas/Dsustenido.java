package br.com.teoria.escalas.sustenidas;

import java.util.ArrayList;
import java.util.List;

import br.com.teoria.Escalas;
import br.com.teoria.NotaEscala;

public class Dsustenido extends Escalas
{
	private List<NotaEscala> notasEscalaDsustenido;

	public List<NotaEscala> getNotasEscalaDsustenido()
	{
		return notasEscalaDsustenido;
	}

	public void setNotasEscalaDsustenido(List<NotaEscala> notasEscalaDsustenido)
	{
		this.notasEscalaDsustenido = notasEscalaDsustenido;
	}
	
	public Dsustenido()
	{
		List<NotaEscala> notasEscalaAdicionar = new ArrayList<NotaEscala>();
		
		NotaEscala Dsustenido = new NotaEscala("D#", 1.0);
		NotaEscala E = new NotaEscala("E", 1.5);
		NotaEscala F = new NotaEscala("F", 2.0);
		NotaEscala Fsustenido = new NotaEscala("F#", 2.5);
		NotaEscala G = new NotaEscala("G", 3.0);
		NotaEscala Gsustenido = new NotaEscala("G#", 3.5);
		NotaEscala A = new NotaEscala("A", 4.0);
		NotaEscala Asustenido = new NotaEscala("A#", 4.5);
		NotaEscala B = new NotaEscala("B", 5.0);
		NotaEscala C = new NotaEscala("C", 5.5);
		NotaEscala Csusteinido = new NotaEscala("C#", 6.0);
		NotaEscala D = new NotaEscala("D", 6.5);
		
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
		
		this.setNotasEscalaDsustenido(notasEscalaAdicionar);
	}
	
	@Override
	public List<String> formarAcorde(Double primeiraNota, Double segundaNota, Double terceiraNota, Double setimaNota)
	{
		List<String> notasAcorde = new ArrayList<String>();
		
		for(NotaEscala ne : this.getNotasEscalaDsustenido())
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

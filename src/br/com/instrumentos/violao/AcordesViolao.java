package br.com.instrumentos.violao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.base.Acorde;
import br.com.base.Casa;
import br.com.base.Corda;
import br.com.teoria.Escalas;
import br.com.teoria.escalas.normais.A;
import br.com.teoria.escalas.normais.B;
import br.com.teoria.escalas.normais.C;
import br.com.teoria.escalas.normais.D;
import br.com.teoria.escalas.normais.E;
import br.com.teoria.escalas.normais.F;
import br.com.teoria.escalas.normais.G;
import br.com.teoria.escalas.sustenidas.Asustenido;
import br.com.teoria.escalas.sustenidas.Csustenido;
import br.com.teoria.escalas.sustenidas.Dsustenido;
import br.com.teoria.escalas.sustenidas.Fsustenido;
import br.com.teoria.escalas.sustenidas.Gsustenido;

public class AcordesViolao extends Acorde
{
	private List<Integer> cordas;
	private List<Integer> casas;
	
	private static final Integer limiteDistanciaCasas = 4;

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

	// Encontra as notas do acorde
	@Override
	public List<String> formarAcorde(String notaInicial, boolean maior, boolean setimaMaior, boolean setimaMenor)
	{
		List<String> notasAcorde = new ArrayList<String>();
		
		Double primeiraNota = Escalas.PRIMEIRA_NOTA;
		Double segundaNota = !maior ? Escalas.SEGUNDA_NOTA_MENOR : Escalas.SEGUNDA_NOTA_MAIOR;
		Double terceiraNota = Escalas.TERCEIRA_NOTA;
		Double setimaNota = null;
		
		if(setimaMaior)
		{
			setimaNota = Escalas.SETIMA_MAIOR;
		}
		
		else if(setimaMenor)
		{
			setimaNota = Escalas.SETIMA_MENOR;
		}
		
		switch (notaInicial)
		{
		case "C":
			notasAcorde = new C().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "C#":
			notasAcorde = new Csustenido().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "D":
			notasAcorde = new D().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "D#":
			notasAcorde = new Dsustenido().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "E":
			notasAcorde = new E().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "F":
			notasAcorde = new F().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "F#":
			notasAcorde = new Fsustenido().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "G":
			notasAcorde = new G().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "G#":
			notasAcorde = new Gsustenido().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "A":
			notasAcorde = new A().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "A#":
			notasAcorde = new Asustenido().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		case "B":
			notasAcorde = new B().formarAcorde(primeiraNota, segundaNota, terceiraNota, setimaNota);
			break;
			
		default:
			break;
		}
		
		return notasAcorde;
	}
	
	public List<Integer> encontrarCasasAcorde(Integer numeroCorda, String nomeAcorde)
	{
		List<Integer> casasAcorde = new ArrayList<Integer>();
		
		Corda cordaSelecionada  = this.encontrarCordaPorNumero(numeroCorda);
		
		for(Casa c : cordaSelecionada.getCasas())
		{
			if(c.getNota().getNome().equalsIgnoreCase(nomeAcorde))
			{
				casasAcorde.add(c.getNumero());
			}
		}
		
		return casasAcorde;
	}
	
	private Corda encontrarCordaPorNumero(Integer numeroCorda)
	{
		Corda cordaRetornar = null;
		
		InstrumentoViolao violao = new InstrumentoViolao();
		
		// Encontra a corda referente ao numero
		for(Corda c : violao.getCordas())
		{
			if(c.getNumero() == numeroCorda)
			{
				cordaRetornar = c;
				break;
			}
		}
		
		return cordaRetornar;
	}
	
	public List<String> formarAcordeCasaViolao(Integer numeroCasa, Integer numeroCorda, String acorde, boolean maior, boolean setimaMaior, boolean setimaMenor)
	{
		// Para fins de debug
		System.out.println("Acorde: " + acorde);
		
		if(maior)
		{
			System.out.println("maior");
		}
		else
		{
			System.out.println("menor");
		}
		
		if(setimaMaior)
		{
			System.out.println("com setima maior");
		}
		
		if(setimaMenor)
		{
			System.out.println("com setima menor");
		}
		// Lista das posições dos dedos
		List<String> posicoes = new ArrayList<String>();
		
		// Primeira posicao do acorde será o numero da corda e o numero da casa Escolhido
		posicoes.add("Casa nº " + numeroCasa + " da " + numeroCorda + "º corda" + "\n");
		
		// Faz uma lista com as cordas possiveis de se procurar, exemplo se o numero da corda for 4, 5 e 6 não serão adicionadas
		List<Corda> cordasFormarAcorde = new ArrayList<Corda>();
		
		
		Collections.reverse(cordasFormarAcorde);
		
		InstrumentoViolao violao = new InstrumentoViolao();
		
		for(Corda c : violao.getCordas())
		{
			if(numeroCorda > (c.getNumero()))
			{
				cordasFormarAcorde.add(c);
			}
		}
		
		// Encontra as notas do acorde
		List<String> notasAcorde = this.formarAcorde(acorde, maior, setimaMaior, setimaMenor);
		
		// Algoritmo de busca do acorde
		
		// Percorre as cordas possiveis de se formar o acorde e as casas dentro da limitação de -4 ou +4
		for(Corda c : cordasFormarAcorde)
		{
			// termina a formação do acorde
			if(notasAcorde.size() == 0)
			{
				break;
			}
			for(Casa casa : c.getCasas())
			{
				boolean notaEncontrada = false;
				
				if(casa.getNumero() < (numeroCasa - limiteDistanciaCasas) || casa.getNumero() > (numeroCasa + limiteDistanciaCasas))
				{
					continue;
				}
				else
				{
					// Percorre as casas validas e encontra as notas
					for(String nota : notasAcorde)
					{
						if(casa.getNota().getNome().equalsIgnoreCase(nota))
						{
							posicoes.add("Casa nº " + casa.getNumero() + " da " + c.getNumero() + "º corda" + "\n");
							notaEncontrada = true;
							break;
						}
					}
				}
				if(notaEncontrada)
				{
					break;
				}
			}
		}
		return posicoes;
	}
}

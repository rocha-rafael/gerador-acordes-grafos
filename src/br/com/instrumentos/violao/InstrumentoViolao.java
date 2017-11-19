package br.com.instrumentos.violao;

import java.util.ArrayList;
import java.util.List;

import br.com.base.Casa;
import br.com.base.Corda;
import br.com.base.Instrumento;
import br.com.base.Nota;

/*
 * Cria um violao tradicional de 6 cordas e 18 casas
 */
public class InstrumentoViolao extends Instrumento
{
	public static String[] notasPrimeiraCorda = {"E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#","D", "D#", "E", "F", "F#", "G", "G#", "A", "A#"};
	public static String[] notasSegundaCorda = {"B", "C", "C#","D", "D#", "E", "F", "F#", "G", "G#", "A", "A#","B", "C", "C#","D", "D#", "E", "F"};
	public static String[] notasTerceiraCorda = {"G", "G#", "A", "A#", "B", "C", "C#","D", "D#", "E", "F", "F#", "G", "G#", "A", "A#","B", "C", "C#"};
	public static String[] notasQuartaCorda = {"D", "D#", "E", "F", "F#", "G", "G#", "A", "A#","B", "C", "C#","D", "D#", "E", "F", "F#","G", "G#"};
	public static String[] notasQuintaCorda = {"A", "A#", "B", "C", "C#","D", "D#", "E", "F", "F#", "G", "G#", "A", "A#","B", "C", "C#", "D", "D#"};
	public static String[] notasSextaCorda = {"E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#","D", "D#", "E", "F", "F#", "G", "G#", "A", "A#"};
	
	private List<Corda> criarCordas()
	{
		List<Corda> cordas = new ArrayList<Corda>();
		
		Corda corda1 = new Corda(this.gerarCasasCorda(notasPrimeiraCorda), 1);
		Corda corda2 = new Corda(this.gerarCasasCorda(notasSegundaCorda), 2);
		Corda corda3 = new Corda(this.gerarCasasCorda(notasTerceiraCorda), 3);
		Corda corda4 = new Corda(this.gerarCasasCorda(notasQuartaCorda), 4);
		Corda corda5 = new Corda(this.gerarCasasCorda(notasQuintaCorda), 5);
		Corda corda6 = new Corda(this.gerarCasasCorda(notasSextaCorda), 6);
		
		cordas.add(corda1);
		cordas.add(corda2);
		cordas.add(corda3);
		cordas.add(corda4);
		cordas.add(corda5);
		cordas.add(corda6);
		
		return cordas;
	}
	
	private List<Casa> gerarCasasCorda(String[] notasCorda)
	{
		List<Casa> casasCorda = new ArrayList<Casa>();
		
		Integer contador = 0;
		
		for(String n: notasCorda)
		{
			Nota nota = new Nota(n);
			Casa c = new Casa(nota, contador);
			
			casasCorda.add(c);
			contador ++;
		}
		
		return casasCorda;
	}
	
	public InstrumentoViolao()
	{
		this.setNome("Violão Nylon");
		this.setCordas(this.criarCordas());
	}
}

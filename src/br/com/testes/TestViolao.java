package br.com.testes;

import java.util.List;

import br.com.instrumentos.violao.AcordesViolao;
import br.com.instrumentos.violao.InstrumentoViolao;

public class TestViolao
{
	public static void main(String[] args)
	{
		InstrumentoViolao v = new InstrumentoViolao();
		
		// Testa a formação de um acordeo
		AcordesViolao acordesViolao = new AcordesViolao();
		
//		acordesViolao.encontrarCasasAcorde(3, "C#");
		
		List<String> posicoes = acordesViolao.formarAcordeCasaViolao(10, 4, "C", true, false, false);
		
		for(String s : posicoes)
		{
			System.out.println(s);
		}
		
	}
}

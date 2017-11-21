package br.com.teoria;

import java.util.List;

import br.com.base.Acorde;
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

public abstract class Escalas
{
	// Escalas das notas
	public static final C escalaC = new C();
	public static final Csustenido escalaCSustenido = new Csustenido();
	public static final D escalaD = new D();
	public static final Dsustenido escalaDsustenido = new Dsustenido();
	public static final E escalaE = new E();
	public static final F escalaF = new F();
	public static final Fsustenido escalaFsustenido = new Fsustenido();
	public static final G escalaG = new G();
	public static final Gsustenido escalaGsustenido = new Gsustenido();
	public static final A escalaA = new A();
	public static final Asustenido escalaAsustenido = new Asustenido();
	public static final B escalaB = new B();
	
	// Formula para montar os acordes
	public static final Double PRIMEIRA_NOTA = 1.0;
	public static final Double SEGUNDA_NOTA_MAIOR = 3.0;
	public static final Double SEGUNDA_NOTA_MENOR = 2.5;
	public static final Double TERCEIRA_NOTA = 4.5;
	public static final Double SETIMA_MENOR = 6.0;
	public static final Double SETIMA_MAIOR = 6.5;
	
	public abstract List<String> formarAcorde(Double primeiraNota, Double segundaNota, Double terceiraNota, Double setimaNota);

}

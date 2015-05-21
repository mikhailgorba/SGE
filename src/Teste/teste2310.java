package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste2310 {

	@Test
	public void test() {
		
	
		 private <Calendar, Negocio> void sequenciaSimplesDeNegocios() {
			    Calendar hoje = Calendar.getInstance();

			    Negocio negocio1 = new Negocio(40.5, 100, hoje);
			    Negocio negocio2 = new Negocio(45.0, 100, hoje);
			    Negocio negocio3 = new Negocio(39.8, 100, hoje);
			    Negocio negocio4 = new Negocio(42.3, 100, hoje);

			    List<Negocio> negocios = Arrays.asList(negocio1, negocio2, negocio3,
			                     negocio4);

			    CandlestickFactory fabrica = new CandlestickFactory();
			    Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
			  
		
	}
	}
}

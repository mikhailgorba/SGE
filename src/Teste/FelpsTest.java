package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Interface.ComprasMateriaPrima;
import Objetos.Fornecedor;
import Sistema.Sistema;

public class FelpsTest {

	@Test
	public void test() {
		String qtdAluminio, qtdParafuso, qtdBorracha, qtdCabo, qtdPlastico;
		// Criei cenario
		qtdAluminio = "1";
		qtdParafuso = "2";
		qtdBorracha = "2";
		qtdCabo = "2";
		qtdPlastico = "2";
		
		
		
		// Executo um procedimento neste cenario
		Sistema cp = new Sistema();
		String resultado = cp.pesquisar(qtdAluminio, qtdParafuso, qtdBorracha, qtdCabo, qtdPlastico);
		
		//verifico se a saida é a esperada
		assertEquals("Melhor Aluminio = Cap. Corp. 25.0\nMelhor Parafuso = Doublemt 40.0\nMelhor Cabo = Cap. Corp. 40.0\nMelhor Borracha = Wayne Inc. 60.0\nMelhor Plastico = Wayne Inc. 20.0\nO valor total da compra é de: R$ 185.0", resultado);
	}

}

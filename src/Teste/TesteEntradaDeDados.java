package Teste;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import Interface.ComprasMateriaPrima;
import Objetos.Fornecedor;
import Sistema.Sistema;

public class TesteEntradaDeDados {

	 @Test
	public void test() throws IOException {
		
		 //Criei cenario		
		
		//Executo um procedimento neste cenario
		Sistema cp = new Sistema();
		String local = "BancoDeArquivos/usuarios.txt";
		MetodoEntradaDeDados chamando = new MetodoEntradaDeDados();
	    String resultado = chamando.entradaDeDados(local);
		
		//verifico se a saida é a esperada
		assertEquals("admisn;admin", resultado);
	}
	
}

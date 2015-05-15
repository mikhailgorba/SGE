package Teste;

import static org.junit.Assert.*;

import java.text.NumberFormat;

import javax.sound.sampled.spi.FormatConversionProvider;
import javax.swing.JOptionPane;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {

		JOptionPane.showMessageDialog(null, "Hey Brothers");

		// fail("Not yet implemented");
	}

	@Test
	public void testeIconedeErro() {

		String mensagem = "mensagem de texto";
		String titulo = "Aqui fica o titulo'";
		int icone = 0;

		JOptionPane.showMessageDialog(null, mensagem, titulo, icone);

	}



	@Test
	public void testandoSwitch() {

		int diaDaSemana;
		diaDaSemana = 3;
		Felps objeto = new Felps();
		assertEquals("Segunda-feira", objeto.nomeDiaSemana(2));
		assertEquals("Terça-feira", objeto.nomeDiaSemana(3));
		assertEquals("Quarta-feira", objeto.nomeDiaSemana(4));

	}

	@Test
	public void formataçaoMoeda() {

		double numeroAserConvertido;
		numeroAserConvertido = 300;
		System.out.println(NumberFormat.getCurrencyInstance().format(
				numeroAserConvertido));

		// imprimir com R$
	}

}

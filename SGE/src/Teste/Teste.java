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
		
		
		fail("Not yet implemented");
	}

	
	@Test
	public void testeIconedeErro() {
		
		String mensagem = "mensagem de texto";
		String titulo = "Aqui fica o titulo'";
		int icone = 1;
		
		
		JOptionPane.showMessageDialog(null, mensagem, titulo, icone);
		
	}
	
	
	@Test
	public void testandoSwitch() {
		
		int diaDaSemana ;
		diaDaSemana = 3;
		
		switch (diaDaSemana) {
		
		case 1:
		
		System.out.println("Domingo");
		
		break;
		
		case 2:
		
		System.out.println("Segunda-feira");
		
		break;
	
		case 3:
		
		System.out.println("Ter�a-feira");
		
		break;
		
		case 4:
		
		System.out.println("Quarta-feira");
		
		break;
		
		case 5:
		
		System.out.println("Quinta-feira");
		
		break;
		
		case 6:
		
		System.out.println("Sexta-feira");
		
		break;
		
		case 7:
		
		System.out.println("S�bado");
	
		break;
	
		default:
		
		System.out.println("Este n�o � um dia v�lido!");
	
		}
		
		
		
		}
		
	@Test
	public void formata�aoMoeda()	{
		
		
		double numeroAserConvertido;
		numeroAserConvertido = 300;
		System.out.println(NumberFormat.getCurrencyInstance().format(numeroAserConvertido));

        // imprimir com R$   
	}
		
	}
	
	


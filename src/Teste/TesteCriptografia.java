package Teste;
import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import Sistema.Criptografia;
import Sistema.EncriptaSenha;


public class TesteCriptografia {

	@Test
	public void testCriptografar() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String senha = "teste";
		String cod1, cod2;
		
		EncriptaSenha cript = new EncriptaSenha();
		
		cod1 = cript.encripta(senha);
		cod2 = cript.encripta(senha);
		
		assertEquals(cod1,cod2);
		
	}

}
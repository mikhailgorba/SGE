import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import Sistema.Criptografia;


public class TesteCriptografia {

	@Test
	public void testCriptografar() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String senha = "teste";
		String cod1, cod2;
		
		Criptografia cript = new Criptografia();
		
		cod1 = cript.criptografar(senha);
		cod2 = cript.criptografar(senha);
		
		assertEquals(cod1,cod2);
		
	}

}

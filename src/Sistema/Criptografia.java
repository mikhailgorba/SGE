package Sistema;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

	public static String criptografar(String args) throws NoSuchAlgorithmException, UnsupportedEncodingException
			 {
		String senha = "admin";
		String senhaC;
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		byte senhaCriptografada[] = algorithm.digest(senha.getBytes("UTF-8"));
		System.out.println(senhaCriptografada);
		senhaC = senhaCriptografada.toString();
		return senhaC;

	}
	
	

	
	
}
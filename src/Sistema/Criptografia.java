package Sistema;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

	public static String criptografar(String args) throws NoSuchAlgorithmException, UnsupportedEncodingException
			 {
		String senhaC;
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		byte senhaCriptografada[] = algorithm.digest(args.getBytes("UTF-8"));
		senhaC = senhaCriptografada.toString();
		System.out.println(senhaC);
		return senhaC;

	}
	
	

	
	
}
package Teste;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream;  
import java.util.Arrays;  
import java.util.List;  
  
class MetodoEntradaDeDados {  
      
          
      
      
    public  String entradaDeDados(String local) throws IOException {  
    	 
    	
    	
        byte[] buffer = new byte[11];  
        InputStream in;
        
        //String local = "BancoDeArquivos/usuarios.txt";
        
         
            in = new FileInputStream(local);  
            in.read(buffer);  
            String texto = new String(buffer).trim().toString();  
            in.close();  
       
        return texto;
    }  
          
      
}  
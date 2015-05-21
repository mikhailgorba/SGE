package Teste;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream;  
import java.util.Arrays;  
import java.util.List;  
  
class EntradaDeDados {  
      
          
      
      
    public EntradaDeDados() {  
  
        byte[] buffer = new byte[1000];  
        InputStream in;  
        try {  
            in = new FileInputStream("/SGE/BancoArquivos/usuarios");  
            in.read(buffer);  
            String temp = new String(buffer).trim().toString();  
            in.close();  
        } catch (FileNotFoundException e) {  
            System.out.println(e);  
        }  
        catch (IOException e) {  
            System.out.println(e);  
        }  
      
  
    }  
          
      
}  
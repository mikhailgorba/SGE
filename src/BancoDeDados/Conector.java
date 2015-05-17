package BancoDeDados;

public class Conector {
    public static Connection getConexao() throws SQLException, FileNotFoundException, IOException {
        String nomedb =null;
        try { 
            FileReader arq = new FileReader("bdip.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
//             while (linha != null || linha != " ") { 
            if (linha != null || linha != " "){
                nomedb = linha;
               // System.out.println(nomedb);
            }
            else{
                System.out.println("não pegou linha");
            }
 //           } 
        arq.close(); 
    } 
catch (IOException e) { 
    System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
}
//System.out.println(nomedb);
      try{
         Class.forName("com.mysql.jdbc.Driver");
         //System.out.println("conectado!");
         return DriverManager.getConnection("jdbc:mysql://"+nomedb+"/pizzacall", "root", "maximuss");
        }
      catch (ClassNotFoundException e) {
             throw new SQLException(e.getMessage());
         }
      
    }

    public static PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mikhail
 */
public class ListaUsuarios extends javax.swing.JInternalFrame {

            //lerUsuarios = new BufferedReader(new FileReader("c:/SGE/usuarios.txt"));
           // String linha = lerUsuarios.readLine();            
                                
           // while (true) {
           //     if (linha != null) {
                    
           //         String[] array = linha.split(";");
             //       DefaultTableModel defaultModel = (DefaultTableModel) tabela.getModel();
            //
               // }}
    
    public ListaUsuarios() throws IOException {
		
        initComponents();        
        carregaUsuarios();
        carregaAdministradores();
        }
	
	   
       

	private void carregaUsuarios() throws IOException {
	
	//DefaultTableModel defaultModel = (DefaultTableModel) tabelaAdministradores.getModel();
	
		
		//tabela administradores
		
		  BufferedReader lerAdministradores;
	    
	            lerAdministradores = new BufferedReader(new FileReader("c:/SGE/administrador.txt"));
	            String linha = lerAdministradores.readLine();            
	                                
	            while (true) {
	                if (linha != null) {
	                    
	                    String[] array = linha.split(";");
	                    DefaultTableModel defaultModel = (DefaultTableModel) tabelaUsuario.getModel();
	            
	                     Vector colunasArray = new Vector();
	                     colunasArray.add(array[0]);
	                     colunasArray.add(array[1]);

	                     defaultModel.addRow(colunasArray); 
	                    
	                } else {
	                    break;
	                }
	                linha = lerAdministradores.readLine();
	            }
	            lerAdministradores.close();
	            
	        
	      

			 
	
	        
	    }
	
	
	
	private void carregaAdministradores() throws IOException {
		
		
		//tabela usuarios
        BufferedReader lerUsuarios;
	       
        lerUsuarios = new BufferedReader(new FileReader("c:/SGE/usuarios.txt"));
        String linhas = lerUsuarios.readLine();            
                            
        while (true) {
            if (linhas != null) {
                
                String[] array2 = linhas.split(";");
                DefaultTableModel defaultModel = (DefaultTableModel) tabelaAdministrador.getModel();
        
                 Vector colunasArray = new Vector();
                 colunasArray.add(array2[0]);
                 colunasArray.add(array2[1]);

                 defaultModel.addRow(colunasArray); 
                
            } else {
                break;
            }
            linhas = lerUsuarios.readLine();
        }
        lerUsuarios.close();
   
    

		
	}
		
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaAdministrador = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("Lista de Usuarios");

        jLabel2.setText("Administradores");

        jLabel3.setText("Usuarios Comuns");

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Senha"
            }
        ));
        tabelaUsuario.setCellSelectionEnabled(false);
        jScrollPane3.setViewportView(tabelaUsuario);

        tabelaAdministrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Senha"
            }
        ));
        jScrollPane4.setViewportView(tabelaAdministrador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(45, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaAdministrador;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration                   
}

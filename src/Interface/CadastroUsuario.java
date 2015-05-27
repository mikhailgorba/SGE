
package Interface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class CadastroUsuario extends javax.swing.JInternalFrame {
    private boolean admin = (false);

    public CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        botaoCadastrarUsuario = new javax.swing.JButton();
        botaoCancelarUsuario = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        radioMostrarSenha = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMostrarSenha = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de usuário");

        botaoCadastrarUsuario.setText("Cadastrar");
        botaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        botaoCancelarUsuario.setText("Cancelar");
        botaoCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarUsuarioActionPerformed(evt);
            }
        });

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Nova senha de usuario");

        jLabel4.setText("Novo login ");

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        radioMostrarSenha.setText("Mostrar senha");
        radioMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMostrarSenhaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mostrar senha");

        areaMostrarSenha.setColumns(20);
        areaMostrarSenha.setRows(1);
        jScrollPane2.setViewportView(areaMostrarSenha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(radioMostrarSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(campoUsuario)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCadastrarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(botaoCancelarUsuario)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoSenha)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(radioMostrarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarUsuario)
                    .addComponent(botaoCancelarUsuario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void botaoCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.dispose();
        
        
    }                                                    

    private void botaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // cadastrar usuario e senha
               
            String usuario = campoUsuario.getText();
            String senha = campoSenha.getText();           
           
            int resposta =  JOptionPane.showConfirmDialog(null, "Deseja cadastrar com privilégios de administrador?" );           
              
            if (resposta == JOptionPane.YES_OPTION) {
            
                BufferedWriter escreverNoArquivo;
            try {
            escreverNoArquivo = new BufferedWriter(new FileWriter("BancoDeArquivos/administradores.txt", true));
            escreverNoArquivo.append(usuario + ";"+senha+"\n");
            escreverNoArquivo.close();
            } catch (IOException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");                      
            }
            
            if (resposta == JOptionPane.NO_OPTION) {
                
            BufferedWriter escreverNoArquivo;
            try {
            escreverNoArquivo = new BufferedWriter(new FileWriter("BancoDeArquivos/usuarios.txt", true));
            escreverNoArquivo.append(usuario + ";"+senha+"\n");
            escreverNoArquivo.close();
            } catch (IOException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            }
        
            if (resposta == JOptionPane.CANCEL_OPTION) {
                
            }                                                                               
    }                                                     

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void radioMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
    	String senha = campoSenha.getText();
    	
    	if (radioMostrarSenha.isSelected()) {
    		
    		areaMostrarSenha.setText(senha);
    	}
    	else {
    		areaMostrarSenha.setText(null);
    	}
        
    }                                          

                                              
                 

     public String mostrarCaracter() {
 
               if (radioMostrarSenha.isSelected()) {
                    return "Selecionado";
 
                } else {
 
                return "NaoSelecionado";
               }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea areaMostrarSenha;
    private javax.swing.JButton botaoCadastrarUsuario;
    private javax.swing.JButton botaoCancelarUsuario;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioMostrarSenha;
    // End of variables declaration                   
}


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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(campoSenha))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarUsuario)
                    .addComponent(botaoCancelarUsuario))
                .addContainerGap(51, Short.MAX_VALUE))
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
            escreverNoArquivo = new BufferedWriter(new FileWriter("BancoDeArquivos/administrador.txt", true));
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


    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoCadastrarUsuario;
    private javax.swing.JButton botaoCancelarUsuario;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}

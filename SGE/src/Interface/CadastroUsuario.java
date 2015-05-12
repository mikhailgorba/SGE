
package Interface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastroUsuario extends javax.swing.JInternalFrame {

    public CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        botaoCadastrarUsuario = new javax.swing.JButton();
        botaoCancelarUsuario = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel3.setText("Nova senha de usuario");

        jLabel4.setText("Novo login ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(botaoCadastrarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCancelarUsuario))
                        .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarUsuario)
                    .addComponent(botaoCancelarUsuario))
                .addContainerGap(38, Short.MAX_VALUE))
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

        BufferedWriter escreverNoArquivo;
        try {
            escreverNoArquivo = new BufferedWriter(new FileWriter("c:/SGE/usuarios.txt", true));
            escreverNoArquivo.append(usuario + ";"+senha+"\n");
            escreverNoArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");

    }                                                     


    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoCadastrarUsuario;
    private javax.swing.JButton botaoCancelarUsuario;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}

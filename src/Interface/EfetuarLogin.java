
package Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import javax.swing.JOptionPane;


public class EfetuarLogin extends javax.swing.JFrame {

    /**
     * Creates new form EfetuarLogin
     */
    public EfetuarLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        botaoAcessar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        radioAdministrador = new javax.swing.JRadioButton();

        setTitle("Efetuar Login");
        setLocationByPlatform(true);

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        botaoAcessar.setText("Acessar");
        botaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        radioAdministrador.setText("Logar como administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAcessar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(radioAdministrador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoAcessar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>                        

    public static String escolheNivel() {
 
               if (radioAdministrador.isSelected()) {
            	
                    return "M";
 
                } else {
 
                return "F";
               }
    }
    
    
    
    private void botaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();        
                
        String escolha = escolheNivel();
            if (escolha == "M") {
                
                
              if (consultaUsuarioAdministrador(usuario+";"+senha))
        {
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TelaPrincipal().setVisible(true);
                }
            });
        } else {
            int MessageDialogERROR_MESSAGE = 0;
          JOptionPane.showMessageDialog(null, "Sua senha ou usu�rio s�o inv�lidos", "ACESSO NEGADO", MessageDialogERROR_MESSAGE);
            
        }  
                
                
                
            }
            else {
            
             if (consultaUsuario(usuario+";"+senha))
        {
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TelaPrincipal().setVisible(true);
                }
            });
        } else {
            int MessageDialogERROR_MESSAGE = 0;
          JOptionPane.showMessageDialog(null, "Sua senha ou usu�rio s�o inv�lidos", "ACESSO NEGADO", MessageDialogERROR_MESSAGE);
            
            }
            
            }
            
        

    }                                            

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        this.dispose();
        
    }                                             

    private boolean consultaUsuarioAdministrador(String usuarioSenha)
    {
        boolean logar = false;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("c:/SGE/administrador.txt"));
            String linha = buffRead.readLine();
            while (true) {
                if (linha != null) {
                    if (linha.equals(usuarioSenha))
                    {
                        logar = true;
                        break;
                    }
                } else {
                    break;
                }
                linha = buffRead.readLine();
            }
            buffRead.close();
        } catch (Exception e) {
            return false;
        }

        return logar;
    }
    
    private boolean consultaUsuario(String usuarioSenha)
    {
        boolean logar = false;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("c:/SGE/usuarios.txt"));
            String linha = buffRead.readLine();
            while (true) {
                if (linha != null) {
                    if (linha.equals(usuarioSenha))
                    {
                        logar = true;
                        break;
                    }
                } else {
                    break;
                }
                linha = buffRead.readLine();
            }
            buffRead.close();
        } catch (Exception e) {
            return false;
        }

        return logar;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAcessar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JRadioButton radioAdministrador;
    // End of variables declaration                   

}
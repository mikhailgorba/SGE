//estamos dentro do pacote "sistema"

package Sistema;

//importando do pacote interface, da classe interface

import Interface.TelaPrincipal;

// o programa tem seu início aqui (public class Main)

public class Main {

	//ação estática
	public static void main(String args[]) {
		
		// esse comando busca por erros. O sistema funciona após o compilador rastrear os erros descritos abaixo
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			//possiveis erros a serem procurados;
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger("asfg");	
		} catch (InstantiationException ex) {
			//java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			//java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			//java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		// Criando as formas da interface grafica
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaPrincipal().setVisible(true);
				
			}
		});
		
	}
		
}
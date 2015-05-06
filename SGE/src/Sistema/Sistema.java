//Estamos no pacote sistema

package Sistema;

//importando (Vector) da biblioteca do java utilidades - trata-se de  vetor de objetos
import java.util.ArrayList;
import java.util.Vector;

import Objetos.Fornecedor;

public class Sistema {

	//declarando o vetor, ao qual foi dado o nome de "fornecedores"
	private ArrayList<Fornecedor> fornecedores;

	public Sistema()
	{
		fornecedores = new ArrayList<Fornecedor>();

		//dentro da classe Fornecedor está "tabajara'. Aqui, cria-se esse novo fornecedor.
		Fornecedor tabajara = new Fornecedor();
		tabajara.setNome("Tabajara");
		tabajara.setFrete(30.0);
		tabajara.setPrecoAluminio(30.0);
		tabajara.setPrecoParafuso(60.0);
		tabajara.setPrecoBorracha(90.0);
		tabajara.setPrecoCabo(90.0);
		tabajara.setPrecoPlastico(10.0);

		//adiciona-se "tabajara"
		fornecedores.add(tabajara);

		Fornecedor capCorp = new Fornecedor();
		capCorp.setNome("Cap. Corp.");
		capCorp.setFrete(10.0);
		capCorp.setPrecoAluminio(15.0);
		capCorp.setPrecoParafuso(90.0);
		capCorp.setPrecoBorracha(70.0);
		capCorp.setPrecoCabo(20.0);
		capCorp.setPrecoPlastico(80.0);

		fornecedores.add(capCorp);

		Fornecedor doublemt = new Fornecedor();
		doublemt.setNome("Doublemt");
		doublemt.setFrete(20.0);
		doublemt.setPrecoAluminio(80.0);
		doublemt.setPrecoParafuso(10.0);
		doublemt.setPrecoBorracha(80.0);
		doublemt.setPrecoCabo(30.0);
		doublemt.setPrecoPlastico(40.0);

		fornecedores.add(doublemt);

		Fornecedor wayneInc = new Fornecedor();
		wayneInc.setNome("Wayne Inc.");
		wayneInc.setFrete(40.0);
		wayneInc.setPrecoAluminio(40.0);
		wayneInc.setPrecoParafuso(70.0);
		wayneInc.setPrecoBorracha(10.0);
		wayneInc.setPrecoCabo(10.0);
		wayneInc.setPrecoPlastico(10.0);

		fornecedores.add(wayneInc);

		Fornecedor lexCorp = new Fornecedor();
		lexCorp.setNome("Lex Corp.");
		lexCorp.setFrete(50.0);
		lexCorp.setPrecoAluminio(10.0);
		lexCorp.setPrecoParafuso(80.0);
		lexCorp.setPrecoBorracha(20.0);
		lexCorp.setPrecoCabo(20.0);
		lexCorp.setPrecoPlastico(20.0);

		fornecedores.add(lexCorp);


	}

	//método pesquisar... "ao clicar no botão pesquisar"
	public String pesquisar(String qtdAluminio, String qtdParafuso, String qtdBorracha, String qtdCabo, String qtdPlastico) {

		String strRetorno = "";
		Integer iQtdAluminio=0;
		Integer iQtdParafuso=0;
		Integer iQtdBorracha=0;
		Integer iQtdPlastico=0;
		Integer iQtdCabo=0;
		boolean isTudoCerto = true;


		try {
			iQtdAluminio = Integer.parseInt(qtdAluminio);
		} catch (Exception e) {
			isTudoCerto = false;
			strRetorno = "Quantidade de aluminio invalida\n";
		}

		try {
			iQtdParafuso = Integer.parseInt(qtdParafuso);
		} catch (Exception e) {
			isTudoCerto = false;
			strRetorno += "Quantidade de parafuso invalida\n";
		}

		try {
			iQtdBorracha = Integer.parseInt(qtdBorracha);
		} catch (Exception e) {
			isTudoCerto = false;
			strRetorno += "Quantidade de borracha invalida\n";
		}

		try {
			iQtdPlastico = Integer.parseInt(qtdPlastico);
		} catch (Exception e) {
			isTudoCerto = false;
			strRetorno += "Quantidade de plastico invalida\n";
		}

		try {
			iQtdCabo = Integer.parseInt(qtdCabo);
		} catch (Exception e) {
			isTudoCerto = false;
			strRetorno += "Quantidade de cabo invalida\n";
		}

		if (isTudoCerto)
		{

			Fornecedor melhorFornecedorAluminio=null;
			Fornecedor melhorFornecedorPlastico=null;
			Fornecedor melhorFornecedorBorracha=null;
			Fornecedor melhorFornecedorCabo=null;
			Fornecedor melhorFornecedorParafuso=null;

			/*			private double precoAluminio;
			private double precoParafuso;
			private double precoCabo;
			private double precoBorracha;
			private double precoPlastico;
			 */

			
			double a= 0.0, b=0.0, c=0.0, d=0.0, e=0.0, f=0.0;
			double valorPedido;
			double menorValor=9999999;
			
			//aluminio
			if (iQtdAluminio>0) {
				for (int i = 0; i < fornecedores.size(); i++) 
				{
					Fornecedor fornecedorAux = fornecedores.get(i);
					double precoAluminio = fornecedorAux.getPrecoAluminio();
					double precoFrete = fornecedorAux.getFrete();

					valorPedido = ((iQtdAluminio*precoAluminio)+precoFrete);
					if (valorPedido < menorValor){
						melhorFornecedorAluminio = fornecedorAux;
						menorValor = valorPedido;
					}
				}
				a = menorValor;
				strRetorno = "Melhor Aluminio = " + melhorFornecedorAluminio.getNome()+" "+ menorValor +"\n";
			}

			if (iQtdParafuso > 0) {
				// parafuso
				menorValor=9999999;
				for (int i = 0; i < fornecedores.size(); i++) 
				{
					Fornecedor fornecedorAux = fornecedores.get(i);
					double precoParafuso = fornecedorAux.getPrecoParafuso();
					double precoFrete = fornecedorAux.getFrete();

					if (melhorFornecedorAluminio != null && fornecedorAux.getNome() == melhorFornecedorAluminio.getNome())
						valorPedido = iQtdParafuso * precoParafuso;
					else
						valorPedido = ( iQtdParafuso * precoParafuso ) + precoFrete;

					if (valorPedido < menorValor){
						melhorFornecedorParafuso = fornecedorAux;
						menorValor = valorPedido;
					}
				}
				b = menorValor;
				strRetorno += "Melhor Parafuso = " + melhorFornecedorParafuso.getNome()+" "+ menorValor +"\n";
			}

			if (iQtdCabo > 0) {

				// cabo
				menorValor=9999999;
				for (int i = 0; i < fornecedores.size(); i++) 
				{
					Fornecedor fornecedorAux = fornecedores.get(i);
					double precoCabo = fornecedorAux.getPrecoCabo();
					double precoFrete = fornecedorAux.getFrete();

					if (	(melhorFornecedorAluminio != null && fornecedorAux.getNome() == melhorFornecedorAluminio.getNome()) ||
							(melhorFornecedorParafuso != null && fornecedorAux.getNome() == melhorFornecedorParafuso.getNome()))
					{
						valorPedido = iQtdCabo * precoCabo;
					}
					else
						valorPedido = ( iQtdCabo * precoCabo ) + precoFrete;

					if (valorPedido < menorValor){
						melhorFornecedorCabo = fornecedorAux;
						menorValor = valorPedido;
					}
				}
				c = menorValor;
				strRetorno += "Melhor Cabo = " + melhorFornecedorCabo.getNome()+" "+ menorValor +"\n";
			}

			if (iQtdBorracha > 0) {

				// Borracha
				menorValor=9999999;
				for (int i = 0; i < fornecedores.size(); i++) 
				{
					Fornecedor fornecedorAux = fornecedores.get(i);
					double precoBorracha = fornecedorAux.getPrecoBorracha();
					double precoFrete = fornecedorAux.getFrete();

					if (	(melhorFornecedorAluminio != null && fornecedorAux.getNome() == melhorFornecedorAluminio.getNome()) ||
							(melhorFornecedorParafuso != null && fornecedorAux.getNome() == melhorFornecedorParafuso.getNome()) ||
							(melhorFornecedorCabo != null && fornecedorAux.getNome() == melhorFornecedorCabo.getNome())
						)
						valorPedido = iQtdBorracha * precoBorracha;
					else
						valorPedido = ( iQtdBorracha * precoBorracha ) + precoFrete;

					if (valorPedido < menorValor){
						melhorFornecedorBorracha = fornecedorAux;
						menorValor = valorPedido;
					}

				}
				d = menorValor;
				strRetorno += "Melhor Borracha = " + melhorFornecedorBorracha.getNome()+" "+ menorValor +"\n";
			}

			if (iQtdPlastico > 0) {

				// Plastico
				menorValor=9999999;
				for (int i = 0; i < fornecedores.size(); i++) 
				{
					Fornecedor fornecedorAux = fornecedores.get(i);
					double precoPlastico = fornecedorAux.getPrecoPlastico();
					double precoFrete = fornecedorAux.getFrete();

					if (	(melhorFornecedorAluminio != null && fornecedorAux.getNome() == melhorFornecedorAluminio.getNome()) ||
							(melhorFornecedorParafuso != null && fornecedorAux.getNome() == melhorFornecedorParafuso.getNome()) ||
							(melhorFornecedorCabo != null && fornecedorAux.getNome() == melhorFornecedorCabo.getNome()) ||
							(melhorFornecedorBorracha != null && fornecedorAux.getNome() == melhorFornecedorBorracha.getNome())
						)
						valorPedido = iQtdPlastico * precoPlastico;
					else
						valorPedido = ( iQtdPlastico * precoPlastico ) + precoFrete;

					if (valorPedido < menorValor){
						melhorFornecedorPlastico = fornecedorAux;
						menorValor = valorPedido;
					}
				}//fimFor
				e = menorValor;
				strRetorno += "Melhor Plastico = " + melhorFornecedorPlastico.getNome()+" "+ menorValor +"\n";
			}
			
			f = (a+b+c+d+e);
			strRetorno += "o valor total da compra é de: = " + f;
			
		}//fimIf

		return strRetorno;

	} //fimfuncao
} // fimclasse

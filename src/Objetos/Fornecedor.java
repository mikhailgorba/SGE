//estamos no pacote "Objetos"
package Objetos;

//inicializando a classe "Fornecedor"
public class Fornecedor {

	//declaração de atributos da classe "Fornecedor"
	private String nome;
	private double frete;
	private double precoAluminio;
	private double precoParafuso;
	private double precoCabo;
	private double precoBorracha;
	private double precoPlastico;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getPrecoAluminio() {
		return precoAluminio;
	}
	public void setPrecoAluminio(double precoAluminio) {
		this.precoAluminio = precoAluminio;
	}
	public double getPrecoParafuso() {
		return precoParafuso;
	}
	public void setPrecoParafuso(double precoParafuso) {
		this.precoParafuso = precoParafuso;
	}
	public double getPrecoCabo() {
		return precoCabo;
	}
	public void setPrecoCabo(double precoCabo) {
		this.precoCabo = precoCabo;
	}
	public double getPrecoBorracha() {
		return precoBorracha;
	}
	public void setPrecoBorracha(double precoBorracha) {
		this.precoBorracha = precoBorracha;
	}
	public double getPrecoPlastico() {
		return precoPlastico;
	}
	public void setPrecoPlastico(double precoPlastico) {
		this.precoPlastico = precoPlastico;
	}
	
}

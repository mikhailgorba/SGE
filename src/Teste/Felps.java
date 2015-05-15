package Teste;

public class Felps {
	public String nomeDiaSemana(int diaDaSemana) {

		if (diaDaSemana == 1) {
			return "Domingo";
		} else if (diaDaSemana == 2) {
			return "Segunda-feira";
		} else if (diaDaSemana == 3) {
			return "Terça-feira";
		} else if (diaDaSemana == 4) {
			return "Quarta-feira";
		} else if (diaDaSemana == 5) {
			return "Quinta-feira";
		} else if (diaDaSemana == 6) {
			return "Sexta-feira";
		} else if (diaDaSemana == 7) {
			return "Sábado";
		} else {
			return "Este não é um dia válido!";
		}
	}
}

/*
 * Terceira Classe da matéria de linguagem de programação - 19/03/2019
 * Condicionais
 * @author henrique.leite
 */
public class Condicionais {

	// Variaveis
	static int valorSalario;
	static float valorDesconto;
	static float valorPercentualDesconto;
	static float enade;
	static float avaliacoes;
	static float integrador;
	static float notaFinal;

	public static void main(String[] args) {
		salarioDesconto();
		minhasNotas();
	}

	public static void salarioDesconto() {
		valorSalario = 1000;
		valorPercentualDesconto = 0.10f;
		valorDesconto = valorSalario * valorPercentualDesconto;

		System.out.println("Salário integral: " + valorSalario);
		System.out.println("Salário com desconto: " + Math.round((valorSalario - valorDesconto)));
	}

	public static void minhasNotas() {
		enade = 3.5f;
		avaliacoes = 3.0f;
		integrador = 0f;
		notaFinal = enade + avaliacoes + integrador;

		System.out.println("Minha nota esperada: " + notaFinal);
	}
}

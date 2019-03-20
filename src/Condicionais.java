import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import util.Reader;

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
		// salarioDesconto();
		minhasNotas();
		condicionalNotas();
	}

	/* Calcular Salário com desconto */
	public static void salarioDesconto() {
		valorSalario = 1000;
		valorPercentualDesconto = 0.10f;
		valorDesconto = valorSalario * valorPercentualDesconto;

		System.out.println("Salário integral: " + valorSalario);
		System.out.println("Salário com desconto: " + Math.round((valorSalario - valorDesconto)));
	}

	/* Minha nota esperada para o semestre */
	public static void minhasNotas() {

		enade = Reader.readFloat("Digite um valor para a prova Enade........: ");
		avaliacoes = Reader.readFloat("Digite o valor para as provas e trabalhos.: ");
		integrador = Reader.readFloat("Digite o valor para o trabalho integrador.: ");
		notaFinal = enade + avaliacoes + integrador;

		System.out.println("===========================================");
		System.out.println("Minha nota: " + notaFinal);
	}

	public static void condicionalNotas() {
		if (notaFinal >= 7.0) {
			System.out.println("Aprovado :)");
		}
		if (notaFinal < 7.0) {
			System.out.println("Reprovado :(");
		}
	}
}

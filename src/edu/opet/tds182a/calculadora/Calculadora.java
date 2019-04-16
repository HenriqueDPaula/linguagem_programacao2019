package edu.opet.tds182a.calculadora;

import util.Reader;

public class Calculadora {

	public static void main(String[] args) {
		boolean sair = false;

		do {
			System.out.println("1 - somar");
			System.out.println("2 - subtrair");
			System.out.println("3 - dividir");
			System.out.println("4 - multiplicar");
			System.out.println("5 - sair");

			int opcao = Reader.readInt("Escolha a opção: ");

			switch (opcao) {
			case 1:
				int aSoma = Reader.readInt("Entre com o primeiro valor: ");
				int bSoma = Reader.readInt("Entre com o segundo valor: ");
				int resultadoSoma = somar(aSoma, bSoma);
				System.out.println("Resultado de " + aSoma + " + " + bSoma + " = " + resultadoSoma);
				break;
			case 2:
				int aSubtracao = Reader.readInt("Entre com o primeiro valor: ");
				int bSubtracao = Reader.readInt("Entre com o segundo valor: ");
				int resultadoSubtracao = subtrair(aSubtracao, bSubtracao);
				System.out.println("Resultado de " + aSubtracao + " - " + bSubtracao + " = " + resultadoSubtracao);
				break;
			case 3:
				double aDivisao = Reader.readInt("Entre com o primeiro valor: ");
				double bDivisao = Reader.readInt("Entre com o segundo valor: ");
				double resultadoDivisao = dividir(aDivisao, bDivisao);
				System.out.println("Resultado de " + aDivisao + " - " + bDivisao + " = " + resultadoDivisao);
				break;
			case 4:
				double aMultiplicacao = Reader.readInt("Entre com o primeiro valor: ");
				double bMultiplicacao = Reader.readInt("Entre com o segundo valor: ");
				double resultadoMultiplicacao = multiplicar(aMultiplicacao, bMultiplicacao);
				System.out.println(
						"Resultado de " + aMultiplicacao + " - " + bMultiplicacao + " = " + resultadoMultiplicacao);
				break;
			case 5:
				sair = true;
				break;
			default:
				break;
			}
		} while (!sair);

	}

	public static int somar(int a, int b) {
		return a + b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}

	public static double dividir(double a, double b) {
		return a / b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

}

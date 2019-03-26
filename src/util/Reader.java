package util;

import java.util.Scanner;

public class Reader {

	static Scanner reader = new Scanner(System.in);
	static Float floatFormatado = 0.0f;
	static Double doubleFormatado = 0.0;
	static String stringFormatada = "";
	static int intFormatado = 0;

	public static Float readFloat(String mensagem) {
		System.out.print(mensagem);
		boolean flag = false;

		while (!flag) {
			try {
				floatFormatado = Float.parseFloat(reader.nextLine().replaceAll(",", "."));
				flag = true;
			} catch (NumberFormatException e) {
				System.out.println("Número incorreto");
				System.out.print("Por favor digite um número válido: ");
			}
		}

		return floatFormatado;
	}

	public static String readString(String mensagem) {
		System.out.print(mensagem);
		return reader.nextLine();
	}

	public static int readInt(String mensagem) {
		System.out.print(mensagem);
		boolean flag = false;

		while (!flag) {
			try {
				intFormatado = Integer.parseInt(reader.nextLine());
				flag = true;
			} catch (NumberFormatException e) {
				System.out.println("Número incorreto");
				System.out.print("Por favor digite um número válido: ");
			}
		}

		return intFormatado;
	}

	public static Double readDouble(String mensagem) {
		System.out.print(mensagem);
		boolean flag = false;

		while (!flag) {
			try {
				doubleFormatado = Double.parseDouble(reader.nextLine().replaceAll(",", "."));
				flag = true;
			} catch (NumberFormatException e) {
				System.out.println("Número incorreto");
				System.out.print("Por favor digite um número válido: ");
			}
		}

		return doubleFormatado;
	}

}

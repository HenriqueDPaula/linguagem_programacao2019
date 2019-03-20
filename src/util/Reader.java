package util;

import java.util.Scanner;

public class Reader {

	static Scanner reader = new Scanner(System.in);

	public static Float readFloat(String mensagem) {
		System.out.print(mensagem);
		return Float.parseFloat(reader.nextLine());
	}

	public static String readString(String mensagem) {
		System.out.print(mensagem);
		return reader.nextLine();
	}

	public static int readInt(String mensagem) {
		System.out.print(mensagem);
		return Integer.parseInt(reader.nextLine());
	}

	public static Double readDouble(String mensagem) {
		System.out.print(mensagem);
		return Double.parseDouble(reader.nextLine());
	}

}

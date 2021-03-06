package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reader {

	static Scanner reader = new Scanner(System.in);
	static Float floatFormatado = 0.0f;
	static Double doubleFormatado = 0.0;
	static String stringFormatada = "";
	static int intFormatado = 0;
	static Date dataFormatada = null;

	public static Float readFloat(String mensagem) {
		System.out.print(mensagem);
		boolean flag = false;

		while (!flag) {
			try {
				floatFormatado = Float.parseFloat(reader.nextLine().replaceAll(",", "."));
				flag = true;
			} catch (NumberFormatException e) {
				System.out.println("N�mero incorreto");
				System.out.print("Por favor digite um n�mero v�lido: ");
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
				System.out.println("N�mero incorreto");
				System.out.print("Por favor digite um n�mero v�lido: ");
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
				System.out.println("N�mero incorreto");
				System.out.print("Por favor digite um n�mero v�lido: ");
			}
		}

		return doubleFormatado;
	}

	public static Date readDate(String mensagem) {
		System.out.println(mensagem);
		boolean flag = false;
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		while (!flag) {
			try {
				dataFormatada = sdf.parse(reader.nextLine());
				flag = true;
			} catch (NumberFormatException | ParseException e) {
				System.out.println("Data incorreto");
				System.out.print("Por favor digite uma data v�lida: ");
			}
		}
		
		return dataFormatada;

	}

}

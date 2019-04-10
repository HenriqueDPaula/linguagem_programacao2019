package edu.opet.tds182a.programa;

import edu.opet.tds182a.estrutura.cliente.Cliente;
import exception.CPFLenghtException;
import util.Reader;

public class ProgramaEstruturaDados {

	static Cliente cliente = new Cliente();

	public static void main(String[] args) {

		cliente.nome = Reader.readString("Insira seu nome: ");
		cliente.idade = Reader.readInt("Insira sua idade: ");
		cliente.cpf = cpf();

		System.out.println(cliente.nome);
		System.out.println(cliente.idade);
		System.out.println(cliente.cpf);
	}

	public static String cpf() {
		String cpfDefinitivo = new String();
		Boolean flag = false;
		String numeroCpf = new String();

		while (!flag) {
			try {
				// Lendo cpf inserido pelo console
				numeroCpf = Reader.readString("Insira seu cpf: ");

				// Confere se o cpf n�o est� vazio
				if (numeroCpf.isEmpty())
					throw new CPFLenghtException();

				// Converter apenas para n�meros
				Long i = Long.parseLong(numeroCpf.replaceAll(",", "").replaceAll("\\.", ""));

				// Devolve para uma String
				cpfDefinitivo = i.toString();

				// Cpf possui 11 d�gitos
				if (cpfDefinitivo.length() != 11)
					throw new CPFLenghtException();

				// Caso o Cpf seja: 012.345.678.99
				if (numeroCpf.startsWith("0"))
					cpfDefinitivo = "0" + cpfDefinitivo;

				flag = true;
			} catch (NumberFormatException nfex) {
				System.out.println("CPF inv�lido");
			} catch (CPFLenghtException cpfex) {
				System.out.println(" ");
				if (numeroCpf.isEmpty())
					System.out.println("CPF n�o pode ser vazio");
				else if (cpfDefinitivo.length() > 11)
					System.out.println("CPF maior que o usual");
				else if (cpfDefinitivo.length() < 11)
					System.out.println("CPF menor que o usual");
			}
		}

		return cpfDefinitivo;
	}

}

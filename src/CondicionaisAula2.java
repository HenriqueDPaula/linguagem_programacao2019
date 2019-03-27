import util.Reader;

/*
 * Quarta Classe da matéria de linguagem de programação - 26/03/2019
 * Condicionais - aula 2
 * @author henrique.leite
 * 
 * if
 * else
 * case
 * 
 */
public class CondicionaisAula2 {

	private static int opcao;

	public static void main(String[] args) {
		menuCondicionalIf();
		// menuCondicionalSwitch();
	}

	/*
	 * Método com menu usando Switch Case e While
	 */
	public static void menuCondicionalSwitch() {
		while (opcao != 9) {
			opcao = menu();
			switch (opcao) {
			case 1:
				System.out.println("Escolheu Incluir Cliente");
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Escolheu Consultar Cliente");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Escolheu Alterar Cliente");
				System.out.println(" ");
				break;
			case 4:
				System.out.println("Escolheu Excluir Cliente");
				System.out.println(" ");
				break;
			case 9:
				System.out.println("Escolheu sair");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	public static int menu() {
		System.out.println("------------------");
		System.out.println("  SapatoLandia");
		System.out.println("------------------");
		System.out.println("Escolha uma das opções: ");
		System.out.println("1) Incluir Cliente");
		System.out.println("2) Consultar Cliente");
		System.out.println("3) Alterar Cliente");
		System.out.println("4) Excluir Cliente");
		System.out.println("9) SAIR");
		System.out.println(" ");
		int opcaoEscolhida = Reader.readInt("-> ");
		System.out.println(" ");
		return opcaoEscolhida;
	}

	/*
	 * Método com menu usando if e Do While
	 */
	public static void menuCondicionalIf() {
		do {
			System.out.println("------------------");
			System.out.println("  SapatoLandia");
			System.out.println("------------------");
			System.out.println("Escolha uma das opções: ");
			System.out.println("1) Incluir Cliente");
			System.out.println("2) Consultar Cliente");
			System.out.println("3) Alterar Cliente");
			System.out.println("4) Excluir Cliente");
			System.out.println("9) SAIR");
			System.out.println(" ");
			opcao = Reader.readInt("-> ");
			System.out.println(" ");

			if (opcao == 1) {
				System.out.println("Escolheu Incluir Cliente");
				System.out.println(" ");
			} else if (opcao == 2) {
				System.out.println("Escolheu Consultar Cliente");
				System.out.println(" ");
			} else if (opcao == 3) {
				System.out.println("Escolheu Alterar Cliente");
				System.out.println(" ");
			} else if (opcao == 4) {
				System.out.println("Escolheu Excluir Cliente");
				System.out.println(" ");
			} else if (opcao == 9) {
				System.out.println("Escolheu sair");
			} else {
				System.out.println("Opção inválida");
			}
		} while (opcao != 9);
	}
}

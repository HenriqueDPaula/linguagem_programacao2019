import edu.opet.tds182a.estrutura.cliente.Cliente;
import util.Reader;

/*
 * Classe destinada para funções e datas - 16/04/2019
 * @author henrique.leite
 */
public class Funcoes {

	static Cliente cliente = new Cliente();

	public static void main(String[] args) {
		boolean sair = false;

		do {
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - sair");

			int opcao = Reader.readInt("Escolha a opção: ");

			switch (opcao) {
			case 1:
				cadastrarCliente();
				System.out.println("Cliente cadastrado com sucesso!");
				break;
			case 2:
				System.out.println("Vlw Flws");
				sair = true;
				break;
			default:
				break;
			}
		} while (!sair);
	}

	public static void cadastrarCliente() {
		cliente.nome = Reader.readString("Insira o nome do Cliente: ");
		cliente.dataNascimento = Reader.readDate("Insira a data de nascimento: ");

		System.out.println(cliente.nome);
		System.out.println(cliente.dataNascimento);
	}
}

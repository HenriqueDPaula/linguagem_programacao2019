import edu.opet.tds182a.estrutura.cliente.Cliente;

public class ArrayVetor {

	public static void main(String[] args) {

		String[] nomes = { "Henrique", "Carlos" };
		String[] nomes10 = new String[10];
		
		int[] idades = new int[10];
		idades[0] = 1;
		idades[1] = 2;
		idades[2] = 3;
		
		System.out.println(idades[0]);
		
		Cliente cliente = new Cliente();
		cliente.nome = "Henrique";
		cliente.idade = 19;
		
		Cliente[] clientes = new Cliente[3];
		clientes[0] = cliente;
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		for(int i : idades) {
			System.out.println(i);
		}
		
		for(Cliente c : clientes) {
			if(c != null)
				System.out.println(c);
		}
	}
}

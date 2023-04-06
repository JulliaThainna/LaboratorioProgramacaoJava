import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Id da Bomba: ");
		int id = input.nextInt();
		
		Bomba bomba = new Bomba(id);
		
		while(true) {
			System.out.println("Menu");
			System.out.println("0 - Cadastrar bomba");
			System.out.println("1 - Litro por preço");
			System.out.println("2 - Preço por litro");
			System.out.println("3 - Sair");
			System.out.println("Digite a opção: ");
			int op = input.nextInt();
			
			System.out.println("Nome do combustivel: ");
			String nome = input.next();
			switch (op) {
			case 0:
				System.out.println("Preco por litro do combustivel: ");
				double preco = input.nextDouble();
				bomba.cadastraCombustivel(nome, preco);
				break;
			case 1:
				System.out.println("Dinheiro: ");
				double dinheiro = input.nextDouble();
				String litros = bomba.abasteceQuantidadeDinheiro(nome, dinheiro);
				System.out.println("Litros: "+litros);
				break;
			case 2:
				System.out.println("Litros: ");
				double qtdLitro = input.nextDouble();
				String valor = bomba.abasteceQuantidadeLitros(nome, qtdLitro);
				System.out.println("Valor total: "+valor);
				break;
			case 3:
				input.close();
				break;
			default:
				System.out.println("Opção inválida!");
				input.close();
				break;
			}
		}
	}
}


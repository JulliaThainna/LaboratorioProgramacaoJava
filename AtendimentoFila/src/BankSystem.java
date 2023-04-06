import java.time.LocalTime;
import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		
		Fila fila = new Fila();
		while(true) {
			System.out.println("Menu");
			System.out.println("0 - Adicionar novo cliente � fila");
			System.out.println("1 - Remover cliente da fila");
			System.out.println("2 - Atender cliente");
			System.out.println("3 - Buscar posi��o do cliente na fila");
			System.out.println("4 - Ver todos os clientes da fila");
			System.out.println("5 - Sair");
			System.out.println("Digite a op��o: ");
			int op = sc.nextInt();
			
			
			switch (op) {
			case 0:
				System.out.println("Nome: ");
				nome = sc.next();
				System.out.println("Idade: ");
				idade = sc.nextInt();
				sc.nextLine();
				System.out.println("Servi�o desejado: ");
				String servico = sc.nextLine();
				fila.entraFila(nome, LocalTime.now(), idade, servico);
				break;
			case 1:
				System.out.println("Nome: ");
				nome = sc.next();
				System.out.println("Idade: ");
				idade = sc.nextInt();
				fila.desisteFila(nome, idade);
				break;
			case 2:
				fila.atendeCliente();
				break;
			case 3:
				System.out.println("Nome: ");
				nome = sc.next();
				int posicaoFila = fila.buscaPosicaoFila(nome);
				System.out.println("Posicao na fila: "+posicaoFila);
				break;
			case 4:
				fila.imprimeFila();
				break;
			case 5:
				sc.close();
				break;
			default:
				System.out.println("Op��o inv�lida!");
				sc.close();
				break;
			}
				
		}
	}

}

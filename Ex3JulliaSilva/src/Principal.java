import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String cliente;
		String numeroConta;
		BigDecimal saldo;
		BigDecimal limite;

		int opMenu, opConta;
		boolean existe;
		BigDecimal valorSaque, valorDeposito;
		BigDecimal taxaRendimento;

		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		while (true) {
			existe = false;
			System.out.println("Menu" + "\n[1] - Cadastrar uma conta" + "\n[2] - Sacar"
					+ "\n[3] - Atualizar conta poupança com rendimento" + "\n[4] - Depositar" + "\n[5] - Mostrar saldo"
					+ "\n[6] - Calcular tributos da conta"
					+ "\n[7] - Calcular taxa de administração da conta investimento" + "\n[8] - SAIR"
					+ "\nEscolha uma opção: ");
			opMenu = input.nextInt();

			switch (opMenu) {
			// Cadastra conta
			case 1:
				input.nextLine();
				System.out.println("Nome cliente: ");
				cliente = input.nextLine();
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				System.out.println("Saldo: ");
				saldo = input.nextBigDecimal();
				System.out.println("Tipo da conta: " + "\n[1] - Conta Corrente" + "\n[2] - Conta Poupança"
						+ "\n[3] - Conta Investimento" + "\n Escolha a opção: ");
				opConta = input.nextInt();

				if (opConta == 1) {
					System.out.println("Limite: ");
					limite = input.nextBigDecimal();
					// ContaBancaria aux = new ContaCorrente(...);
					// conta.add(aux);
					contas.add(new ContaCorrente(cliente, numeroConta, saldo, limite));
				} else if (opConta == 2) {
					contas.add(new ContaPoupanca(cliente, numeroConta, saldo));
				} else if (opConta == 3) {
					contas.add(new ContaInvestimento(cliente, numeroConta, saldo));
				} else {
					System.out.println("Opção inválida!");
				}
				System.out.println("Conta criada com sucesso!");
				break;

			// Saca
			case 2:
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				System.out.println("Valor do saque: ");
				valorSaque = input.nextBigDecimal();
				for (ContaBancaria conta : contas) {
					if (conta instanceof ContaCorrente) {
						if (numeroConta.equals(((ContaCorrente) conta).getNumeroConta())) {
							((ContaCorrente) conta).sacar(valorSaque);
							existe = true;
							break;
						}
					} else if (conta instanceof ContaPoupanca) {
						if (numeroConta.equals(((ContaPoupanca) conta).getNumeroConta())) {
							((ContaPoupanca) conta).sacar(valorSaque);
							existe = true;
							break;
						}
					} else if (conta instanceof ContaInvestimento) {
						if (numeroConta.equals(((ContaInvestimento) conta).getNumeroConta())) {
							((ContaInvestimento) conta).sacar(valorSaque);
							existe = true;
							break;
						}
					}
				}
				if(existe == false) {
					System.out.println("Conta não existe!");
				}
				break;

			// Atualiza conta poupança com rendimento
			case 3:
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				System.out.println("Taxa de rendimento: ");
				taxaRendimento = input.nextBigDecimal();
				for (ContaBancaria conta : contas) {
					if(conta instanceof ContaPoupanca) {
						if (numeroConta.equals(((ContaPoupanca) conta).getNumeroConta())) {
							((ContaPoupanca) conta).calcularNovoSaldo(taxaRendimento);
							existe = true;
							break;
						}
					}
				}
				if(existe == false) {
					System.out.println("Conta não existe!");
				}
				break;

			// Deposita
			case 4:
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				input.nextLine();
				System.out.println("Valor do deposito: ");
				valorDeposito = input.nextBigDecimal();

				for (ContaBancaria conta : contas) {
					if (conta instanceof ContaCorrente) {
						if (numeroConta.equals(((ContaCorrente) conta).getNumeroConta())) {
							System.out.println("Conta encontrada");
							((ContaCorrente) conta).depositar(valorDeposito);
							existe = true;
							break;
						}
					} else if (conta instanceof ContaPoupanca) {
						if (numeroConta.equals(((ContaPoupanca) conta).getNumeroConta())) {
							((ContaPoupanca) conta).depositar(valorDeposito);
							existe = true;
							break;
						}
					} else if (conta instanceof ContaInvestimento) {
						if (numeroConta.equals(((ContaInvestimento) conta).getNumeroConta())) {
							((ContaInvestimento) conta).depositar(valorDeposito);
							existe = true;
							break;
						}
					}
				}
				if(existe == false) {
					System.out.println("Conta não existe!");
				}
				break;

			// Mostra saldo
			case 5:
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				for (ContaBancaria conta : contas) {
					if (conta instanceof ContaCorrente) {
						if (numeroConta.equals(((ContaCorrente) conta).getNumeroConta())) {
							((ContaCorrente) conta).getSaldo();
							System.out.println("Seu saldo atual é R$ " + ((ContaCorrente) conta).getSaldo());
							existe = true;
							break;
						}
					} else if (conta instanceof ContaPoupanca) {
						if (numeroConta.equals(((ContaPoupanca) conta).getNumeroConta())) {
							((ContaPoupanca) conta).getSaldo();
							System.out.println("Seu saldo atual é R$ " + ((ContaPoupanca) conta).getSaldo());
							existe = true;
							break;
						}
					} else if (conta instanceof ContaInvestimento) {
						if (numeroConta.equals(((ContaInvestimento) conta).getNumeroConta())) {
							((ContaInvestimento) conta).getSaldo();
							System.out.println("Seu saldo atual é R$ " + ((ContaInvestimento) conta).getSaldo());
							existe = true;
							break;
						}
					}
				}
				if(existe == false) {
					System.out.println("Conta não existe!");
				}
				break;

			// Calcula tributo
			case 6:
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				System.out.println("Taxa de rendimento: ");
				taxaRendimento = input.nextBigDecimal();

				for (ContaBancaria conta : contas) {
					if (conta instanceof ContaInvestimento) {
						if (numeroConta.equals(((ContaInvestimento) conta).getNumeroConta())) {
							System.out.println("Tributo: R$ " + ((ContaInvestimento) conta).calcularTributo(taxaRendimento).toString());
							existe = true;
							break;
						}
					}
				}
				if(existe == false) {
					System.out.println("Conta não existe!");
				}
				break;

			// Calcula taxa de administração de uma conta investimento
			case 7:
				System.out.println("Número da conta: ");
				numeroConta = input.next();
				System.out.println("Taxa de rendimento: ");
				taxaRendimento = input.nextBigDecimal();

				for (ContaBancaria conta : contas) {
					if (conta instanceof ContaInvestimento) {
						if (numeroConta.equals(((ContaInvestimento) conta).getNumeroConta())) {
							System.out.println("Tributo: R$ "+ ((ContaInvestimento) conta).calcularTaxaAdministracao(taxaRendimento).toString());
							existe = true;
							break;
						}
					}
				}
				if(existe == false) {
					System.out.println("Conta não existe!");
				}
				break;

			// Fecha
			case 8:
				System.out.println("Fechando . . .");
				input.close();
				return;

			// Opção inválida
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

}

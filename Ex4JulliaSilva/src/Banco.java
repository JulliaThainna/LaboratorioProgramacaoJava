import java.util.ArrayList;

public class Banco {
	private double valorTotal;
	private ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	private ArrayList<Correntista> correntistas = new ArrayList<Correntista>();
	
	//Constructor
	public Banco() {
		this.valorTotal = 100000; //valor total do banco
		//Cria as listas
		for(int i = 0; i < 10; i++) { //Instancia os objetos e os adiciona na lista de contas corrente
			ContaCorrente contaCorrente = new ContaCorrente(i, 10000);
			contas.add(contaCorrente);
		}
		for(int i = 0; i < 5; i++) { //Instancia os objetos e os adiciona na lista de correntistas
			Correntista correntista = new Correntista();
			correntistas.add(correntista);
		}
	}
	
	//Getters e Setters
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	//Methods
	public void execucaoGeral() { //Instancia e inicia as threads
		for(int i = 0; i < 5; i++) {
			Correntista correntista = correntistas.get(i);
			Thread tCorrentista = new Thread(correntista);
			tCorrentista.start();
		}		
	}
	
}

/*
class Banco
	10 contas correntes ok
	100000 valor total ok
	5 correntistas (threads) ok
*/
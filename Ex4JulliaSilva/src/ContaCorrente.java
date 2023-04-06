
public class ContaCorrente{
	private int id;
	private double saldo;
	
	//Constructor
	public ContaCorrente(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Methods
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
}

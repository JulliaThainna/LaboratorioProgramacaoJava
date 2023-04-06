import java.math.BigDecimal;

public class ContaPoupanca implements ContaBancaria {
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	
	//Constructor
	public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	//Getters
	public String getCliente() {
		return this.cliente;
	}
	public String getNumeroConta() {
		return this.numeroConta;
	}
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	//Setters
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	//Methods
	public void sacar(BigDecimal valorSaque) {
		valorSaque = this.saldo.subtract(valorSaque); //valor final
		if(valorSaque.compareTo(BigDecimal.ZERO) >= 0) { //comparo o valor final, se >= 0, atualizo o saldo
			this.saldo = valorSaque;
		}
		return;
	}
	
	public void depositar(BigDecimal valorDeposito) {
		this.saldo = valorDeposito.add(this.saldo);
	}
	
	public BigDecimal calcularNovoSaldo(BigDecimal taxaRendimento) {
		BigDecimal novoSaldo = this.saldo;
		novoSaldo = novoSaldo.multiply(taxaRendimento);
		novoSaldo = novoSaldo.divide(new BigDecimal(100));
		return this.saldo = novoSaldo.add(this.saldo);
	}
	
}

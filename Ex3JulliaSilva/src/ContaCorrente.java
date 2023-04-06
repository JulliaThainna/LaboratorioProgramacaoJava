import java.math.BigDecimal;

public class ContaCorrente implements ContaBancaria {
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	private BigDecimal limite;
	
	//Constructor
	public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
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
	public BigDecimal getLimite() {
		return this.limite;
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
	
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	
	
	//Methods
	public void sacar(BigDecimal valorSaque) {
		valorSaque = this.saldo.subtract(valorSaque);
		if(valorSaque.compareTo(BigDecimal.ZERO) > 0 || (valorSaque.compareTo(BigDecimal.ZERO) <= 0 && valorSaque.compareTo(limite) <= 0)){
			this.saldo = valorSaque;
		}
		return;
	}
	
	public void depositar(BigDecimal valorDeposito) {
		this.saldo = this.saldo.add(valorDeposito);
		System.out.println(this.saldo.toString());
	}
	
}

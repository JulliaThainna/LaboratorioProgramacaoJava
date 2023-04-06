
public class Correntista implements Runnable{
	double valor;
	ContaCorrente conta1;
	ContaCorrente conta2;

	//Getters e Setters
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ContaCorrente getConta1() {
		return conta1;
	}

	public void setConta1(ContaCorrente conta1) {
		this.conta1 = conta1;
	}

	public ContaCorrente getConta2() {
		return conta2;
	}

	public void setConta2(ContaCorrente conta2) {
		this.conta2 = conta2;
	}
	
	//Methods
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			synchronized(this){ //região crítica
				this.movimentar(valor, conta1, conta2);
			}
		}
	}
	
	private void movimentar(double valor, ContaCorrente conta1, ContaCorrente conta2) {
		conta1.sacar(valor);
		conta2.depositar(valor);
		this.imprimeInfoMovimentacao();
	}

	public void imprimeInfoMovimentacao() {
		System.out.println("Valor da movimentação: R$ "+this.valor);
		//System.out.println("Conta de origem: "+this.conta1);
		//System.out.println("Conta de destino: "+this.conta2);
	}
}

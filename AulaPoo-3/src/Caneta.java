
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	//Methods
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	
	private void rabiscar() {
		if(carga > 0 && tampada == false && ponta > 0) {
			System.out.println("Rabiscando . . .");
		}
		else {
			System.out.println("Erro ao tentar rabiscar");
		}
		return;
	}
	 
	public void tampar() {
		this.tampada = true; //this � uma refer�ncia ao pr�prio objeto que chamou, ou seja, c1
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
//Visibilidade padr�o do java � "publica pra pacote" (problema se tiver +1 pacote e a visibilidade n�o for definida)

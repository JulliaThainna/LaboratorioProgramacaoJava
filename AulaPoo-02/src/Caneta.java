
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//Methods
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	
	void rabiscar() {
		if(carga > 0 && tampada == false) {
			System.out.println("Rabiscando . . .");
		}
		else {
			System.out.println("Erro ao tentar rabiscar");
		}
		return;
	}
	 
	void tampar() {
		this.tampada = true; //this é uma referência ao próprio objeto que chamou, ou seja, c1
	}
	
	void destampar() {
		this.tampada = false;
	}
}

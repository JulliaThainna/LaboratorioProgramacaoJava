
public class AulaPoo02 {

	public static void main(String[] args) {
			
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f; //se tirar o f, ele considera como double
		c1.carga = 2;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println();
		
		Caneta c2 = new Caneta();
		c2.cor = "Rosa";
		c2.modelo = "Bic";
		c2.carga = 5;
		c2.ponta = 0.3f;
		c2.tampar();
		c1.status();
		c2.rabiscar();
	}

}

//Objetos tem os mesmos atributos, mas não tem os mesmos ESTADOS!
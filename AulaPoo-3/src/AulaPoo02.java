
public class AulaPoo02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic"; //public
		c1.cor = "Azul"; //public
		//c1.ponta = 0.5f; //private (erro)
		c1.carga = 80; //protected
		c1.tampar();
		c1.status();
		//c1.rabiscar(); //private (erro)
	}

}

//Deixa utilizar carga/tampada que são atributos protected
//pois estamos numa classe (AulaPoo02) que utiliza um método que utiliza
//o objeto c1 que é uma classe Caneta
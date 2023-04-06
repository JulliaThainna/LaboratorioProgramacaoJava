
public class Main {

	public static void main(String[] args) {
		Editora editora = new Editora();
		
		RevistaObserver leitor = new Leitor("Jullia"); //Adicionando primeiro observer
		editora.registerObserver(leitor);
		editora.setRevista("Isto é", 3); //Adicionando a primeira revista
		
		System.out.println("-------------------------------");
		
		RevistaObserver leitor2 = new Leitor("Iago"); //Adicionando segundo observer
		editora.registerObserver(leitor2); 
		editora.setRevista("Teen", 150); //Adicionando segunda revista
		
		System.out.println("-------------------------------");
		
		//Removendo um observer
		editora.removeObserver(leitor);
		editora.setRevista("Gazeta", 45);
	}

}

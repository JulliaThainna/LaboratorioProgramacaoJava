
public class Main {

	public static void main(String[] args) {
		
		//Pinheiro Natural
		ArvoreNatal basica = new ArvoreNatalBasica();
		System.out.println(basica.getDescricao());
		
		//Pinheiro Natural + luzes
		ArvoreNatal luzes = new ArvoreNatalLuzes(basica);
		System.out.println(luzes.getDescricao());
		
		//Pinheiro Natural + festoes
		ArvoreNatal festoes = new ArvoreNatalFestoes(basica);
		System.out.println(festoes.getDescricao());
		
		//Pinheiro Natural + luzes + festoes
		ArvoreNatal composta = new ArvoreNatalFestoes(luzes);
		System.out.println(composta.getDescricao());
		
		//Pinheiro Natural + luzes + festoes
		ArvoreNatal composta2 = new ArvoreNatalFestoes(new ArvoreNatalLuzes(basica));
		System.out.println(composta2.getDescricao());
		
		//Pinheiro Natural + 2 festoes
		ArvoreNatal composta3= new ArvoreNatalFestoes(new ArvoreNatalFestoes(basica));
		System.out.println(composta3.getDescricao());
		
		
	}

}

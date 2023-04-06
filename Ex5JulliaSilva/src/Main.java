import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Playlist playlist = new Playlist();
		Musica musica;
		
		int op;
		String artista, titulo;
		
		do{
			System.out.println("Menu\n"
					+ "1 - Adicionar m�sica\n"
					+ "2 - Mostrar todas as m�sicas na playlist\n"
					+ "3 - Mostrar as pr�ximas m�sicas\n"
					+ "4 - Mostrar as m�sicas anteriores\n"
					+ "5 - Sair\n"
					+ "Op��o: ");
			op = input.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Artista: ");
				artista = input.next();
				System.out.println("T�tulo: ");
				titulo = input.next();
				
				playlist.adicionarMusica(artista, titulo);
				break;
				
			case 2:
				playlist.imprimirMusicas();
				break;
				
			case 3:
				System.out.println("Artista: ");
				artista = input.next();
				System.out.println("T�tulo: ");
				titulo = input.next();
				musica = new Musica(artista, titulo);
				playlist.imprimirProximasMusicas(musica);
				break;
				
			case 4:
				System.out.println("Artista: ");
				artista = input.next();
				System.out.println("T�tulo: ");
				titulo = input.next();
				musica = new Musica(artista, titulo);
				playlist.imprimirMusicasAnteriores(musica);
				break;
			}
			
		}while(op != 5);
		input.close();
	}

}

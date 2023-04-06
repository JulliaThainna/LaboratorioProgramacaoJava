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
					+ "1 - Adicionar música\n"
					+ "2 - Mostrar todas as músicas na playlist\n"
					+ "3 - Mostrar as próximas músicas\n"
					+ "4 - Mostrar as músicas anteriores\n"
					+ "5 - Sair\n"
					+ "Opção: ");
			op = input.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Artista: ");
				artista = input.next();
				System.out.println("Título: ");
				titulo = input.next();
				
				playlist.adicionarMusica(artista, titulo);
				break;
				
			case 2:
				playlist.imprimirMusicas();
				break;
				
			case 3:
				System.out.println("Artista: ");
				artista = input.next();
				System.out.println("Título: ");
				titulo = input.next();
				musica = new Musica(artista, titulo);
				playlist.imprimirProximasMusicas(musica);
				break;
				
			case 4:
				System.out.println("Artista: ");
				artista = input.next();
				System.out.println("Título: ");
				titulo = input.next();
				musica = new Musica(artista, titulo);
				playlist.imprimirMusicasAnteriores(musica);
				break;
			}
			
		}while(op != 5);
		input.close();
	}

}

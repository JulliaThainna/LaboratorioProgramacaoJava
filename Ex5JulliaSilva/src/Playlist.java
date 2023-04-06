import java.util.Set;
import java.util.TreeSet;

public class Playlist {
	 private Set<Musica> listaMusicas; 
	 
	 public Playlist() {
		 this.listaMusicas = new TreeSet<Musica>(new Compara());
	 }
	 
	 //Methods
	 void adicionarMusica(String artista, String titulo) {
		 Musica musica = new Musica(artista, titulo);
		 this.listaMusicas.add(musica);
	 }
	 
	 void imprimirMusicas() {
		 for(Musica musica : listaMusicas) {
			 System.out.println(musica.getTitulo() + " - " + musica.getArtista());
		 }
	 }
	 
	 void imprimirProximasMusicas(Musica musica) {
		 //enquanto não achar a musica que eu quero na playlist percorre
		 //achei
		 //printa as musicas até não ter proximo
		 boolean imprime = false;
		 for(Musica auxMusica : listaMusicas) {
			 if(imprime == true) {
				 System.out.println(auxMusica.getTitulo() + " - " + auxMusica.getArtista());
			 }
			 if(musica.equals(auxMusica) == true) {
				 imprime = true;
			 }
		 }
		 
	 }
	 
	 void imprimirMusicasAnteriores(Musica musica) {
		 //Ou usar break
		 boolean imprime = true;
		 for(Musica auxMusica: listaMusicas) {
			 if(musica.equals(auxMusica) == true) {
				 imprime = false;
			 }
			 if(imprime == true) {
				 System.out.println(auxMusica.getTitulo() + " - " + auxMusica.getArtista());
			 }
		 }
	 }
}

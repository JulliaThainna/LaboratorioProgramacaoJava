
public class Musica {
	private String artista;
	private String titulo;
	
	public Musica(String artista, String titulo) {
		this.artista = artista;
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean equals(Musica otherMusica) {
		if((this.artista).equals(otherMusica.getArtista()) == true
				&& (this.titulo).equals(otherMusica.getTitulo()) == true) {
			return true;
		}
		return false;
	}
}

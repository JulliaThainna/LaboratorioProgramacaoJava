
public class Leitor implements RevistaObserver{
	
	private String nome;
	
	public Leitor(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(RevistaSubject revistaSubject) {
		System.out.println("O leitor "+ this.nome + " foi notificado");
		Editora revista = (Editora)revistaSubject;
		System.out.println("Revista "  + revista.getRevista().getName() + " / Edição: " + revista.getRevista().getEdition());
	}
}

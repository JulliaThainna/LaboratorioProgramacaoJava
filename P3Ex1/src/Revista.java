public class Revista{
	
	private String name;
	private int edition;
	
	public Revista(String name, int edition) {
		this.name = name;
		this.edition = edition;
	}
	
	//Getters e Setters
	public int getEdition() {
		return this.edition;
	}
	
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
}

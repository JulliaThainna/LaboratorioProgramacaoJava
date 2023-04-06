
public abstract class ArvoreNatalDecorator implements ArvoreNatal {
	
	ArvoreNatal arvoreNatal;
	
	public ArvoreNatalDecorator(ArvoreNatal arvoreNatal) {
		this.arvoreNatal = arvoreNatal;
	}
	
	public ArvoreNatal getArvoreNatal() {
		return this.arvoreNatal;
	}
	
	public abstract String getDescricao();
	
}

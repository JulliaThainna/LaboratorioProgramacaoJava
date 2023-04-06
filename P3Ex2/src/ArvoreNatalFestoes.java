public class ArvoreNatalFestoes extends ArvoreNatalDecorator{
	
	public ArvoreNatalFestoes(ArvoreNatal arvoreNatal) {
		super(arvoreNatal);
	}

	@Override
	public String getDescricao() {
		return this.getArvoreNatal().getDescricao() + " + 1 festão";
	}
}

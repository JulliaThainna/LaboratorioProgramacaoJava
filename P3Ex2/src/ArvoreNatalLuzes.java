public class ArvoreNatalLuzes extends ArvoreNatalDecorator{
	
	public ArvoreNatalLuzes(ArvoreNatal arvoreNatal) {
		super(arvoreNatal);
	}

	@Override
	public String getDescricao() {
		String descricao = this.getArvoreNatal().getDescricao() + " + 1 luz";
		return descricao;
	}
}

public class Main {

	public static void main(String[] args) {
		
		ConexaoBD conexaoBd = ConexaoBD.getInstance();
		System.out.println(conexaoBd.getConexao().getUrl());
		
		
	}
}
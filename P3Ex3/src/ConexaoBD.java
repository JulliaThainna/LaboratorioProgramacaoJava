public class ConexaoBD{
	
	private Connection conexao;
	private static ConexaoBD instance;
	
	private ConexaoBD() {
		this.conexao = DriverManager.getConnection("192.168.0.1:2000");
	}
	
	public static ConexaoBD getInstance() {
		if(ConexaoBD.instance == null) {
			ConexaoBD.instance = new ConexaoBD();
		}
		return ConexaoBD.instance;
	}
	
	public Connection getConexao() {
		return this.conexao;
	}
}
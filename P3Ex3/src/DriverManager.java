public class DriverManager{
	
	public static Connection getConnection(String url) {
		Connection connection = new Connection(url);
		return connection;
	}
	
}
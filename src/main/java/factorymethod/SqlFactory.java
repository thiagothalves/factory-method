package factorymethod;

public class SqlFactory implements DbFactory {

	
	@Override
	public DbConnector criarConexao(String connection) {
		return new SqlServerConnector(connection);
	}

}

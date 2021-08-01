package factorymethod;

public class NoSqlFactory implements DbFactory {

	@Override
	public DbConnector criarConexao(String connection) {
		return new NoSqlDbConnector(connection);
	}

}

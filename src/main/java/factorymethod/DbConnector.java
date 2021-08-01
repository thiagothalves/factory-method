package factorymethod;

public abstract class DbConnector {

	protected String connection;

	protected DbConnector(String connection) {
		this.connection = connection;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public abstract Conexao connect();

}

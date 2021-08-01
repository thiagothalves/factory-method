package factorymethod;

public interface DbFactory {

	public abstract DbConnector criarConexao(String conexao);

	static DbFactory criarDataBase(DataBase dataBase) {
		if (dataBase.equals(DataBase.SQL_SERVER)) {
			return new SqlFactory();
		}

		if (dataBase.equals(DataBase.NOSQL)) {
			return new NoSqlFactory();
		}

		throw new IllegalArgumentException("Banco de dados não reconhecido.");
	}

}

package factorymethod;

public class Main {

	public static void main(String[] args) {

		var sqlConexao = DbFactory.criarDataBase(DataBase.SQL_SERVER).criarConexao("banco sql").connect();
		sqlConexao.executarComando("select * from produto");
		sqlConexao.close();
		
		var noSqlConexao = DbFactory.criarDataBase(DataBase.NOSQL).criarConexao("banco nosql").connect();
		noSqlConexao.executarComando("select * from vendas");
		noSqlConexao.close();
		
	
	}

}

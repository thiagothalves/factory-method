package factorymethod;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NoSqlDbConnector extends DbConnector {
	
	private static final Logger LOGGER = Logger.getLogger("NoSqlDbConnector");

	protected NoSqlDbConnector(String connection) {
		super(connection);
	}

	@Override
	public Conexao connect() {
		LOGGER.log(Level.INFO, "Conectando ao banco NoSql...");
		var conexao = new Conexao(connection);
		conexao.open();
		return conexao;
	}

}

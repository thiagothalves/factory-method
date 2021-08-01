package factorymethod;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlServerConnector extends DbConnector {

	private static final Logger LOGGER = Logger.getLogger("SqlServerConnector");

	protected SqlServerConnector(String connection) {
		super(connection);

	}

	@Override
	public Conexao connect() {
		LOGGER.log(Level.INFO, "Conectando ao banco SQL Server...");
		var conexao = new Conexao(connection);
		conexao.open();
		return conexao;
	}

}

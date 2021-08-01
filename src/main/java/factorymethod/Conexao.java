package factorymethod;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

	private static final Logger LOGGER = Logger.getLogger("Conexao");

	String nome;
	boolean aberta;

	public Conexao(String nome) {
		this.nome = nome;
	}

	public void executarComando(String comando) {
		LOGGER.log(Level.INFO, "Executando o comando: {0}", comando);

	}

	public void open() {
		this.aberta = true;
		LOGGER.log(Level.INFO, "Conexão aberta");
	}

	public void close() {
		this.aberta = false;
		LOGGER.log(Level.INFO, "Conexão fechada");
	}

}

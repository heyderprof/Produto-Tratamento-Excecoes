package excecoes;

public class PrecoInvalidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PrecoInvalidoException (String msg) {
		super(msg);
	}

}

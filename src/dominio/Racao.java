package dominio;

public abstract class Racao {
	
	private String nome;
	private int lote;
	private int validade;
	
	public abstract String definirPreco();
	
}

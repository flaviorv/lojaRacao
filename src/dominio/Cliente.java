package dominio;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	
	@Override
	public String toString() {
		return nome + " - " + telefone + " - " + endereco;
	}
}

package dominio;

public abstract class Racao {
	
	private String nome;
	private int codigo;
	private float preco;
	
	public Racao(String nome, int codigo, float preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;	
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		sb.append(";");
		sb.append(String.format("Pre�o: %.2f", calcularPrecoFinal(preco)));
		sb.append(";");
		sb.append("C�digo: " + codigo);
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public float getPreco() {
		return preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public abstract float calcularPrecoFinal(float preco);
	
}

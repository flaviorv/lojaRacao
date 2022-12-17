package dominio;

public abstract class Racao {
	
	private String nome;
	private int codigo;
	private double preco;
	
	public Racao(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;	
		
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public abstract double calcularPrecoFinal(double preco);
	
}

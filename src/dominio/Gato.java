package dominio;

public class Gato extends Racao {
	private String sabor;
	private boolean filhote = false;
	private boolean castrado = false;
	
	public Gato(String nome, int validade, float preco) {
		super(nome, validade, preco);
	}
	
	@Override
	public double calcularPrecoFinal(double preco){
		if(sabor == "peixe") {
			preco+=15;
		}
		if (sabor == "carne") {
			preco+=5;
		}
		if(castrado) {
			preco+=8;
		}
		
		return preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isFilhote() {
		return filhote;
	}

	public void setFilhote(boolean filhote) {
		this.filhote = filhote;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
}

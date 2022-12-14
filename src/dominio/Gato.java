package dominio;

public class Gato extends Racao {
	private String sabor;
	private boolean filhote = false;
	private boolean castrado = false;
	
	public String definirPreco(){
		return null;
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

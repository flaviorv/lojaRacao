package dominio;

public class Gato extends Racao {
	private String sabor;
	private boolean filhotes = false;
	private boolean castrado = false;
	
	public Gato(String nome, int codigo, float preco) {
		super(nome, codigo, preco);
	}
	

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isFilhote() {
		return filhotes;
	}

	public void setFilhote(boolean filhotes) {
		this.filhotes = filhotes;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	@Override
	public float calcularPrecoFinal(float preco){
		if(sabor == "peixe") {
			preco+=15;
		}
		if (sabor == "carne") {
			preco+=5;
		}
		if(castrado) {
			preco+=8;
		}
		if(filhotes) {
			preco+=2.21;
		}
		
		return preco;
	}
	
	public String imprimirRacao() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ração: ");
		sb.append(super.getNome());
		if(filhotes) {
			sb.append("/Filhotes");
		}else {
			sb.append("/Adultos");
			if(castrado) {
				sb.append("/Gato Castrado");
			}
		}
		sb.append(" - Sabor: ");
		sb.append(sabor);
		sb.append(" - Preço: ");
		sb.append(super.getPreco());
		sb.append(" - Código: ");
		sb.append(super.getCodigo());
		
		return sb.toString();
	}
	
}

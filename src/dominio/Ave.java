package dominio;

public class Ave extends Racao { 
	private String tipo; //ex: canario, coleiro, trinca-ferro, periquito
	private String aroma;
	private float peso;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	public Ave(String nome, int codigo, float preco) {
		super(nome, codigo, preco);
	}

	@Override
	public float calcularPrecoFinal(float preco){
		if(tipo == "Canário") {
			preco += 1;
		}else if(tipo == "Trinca-Ferro") {
			preco += 54.4;
		}
		
		if(aroma == "Mamão" ) {
			preco += 23.34;
		}else if(aroma == "Banana") {
			preco += 43.34;
		}
		
		
		return preco * peso;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Mistura para " + tipo);
		sb.append(": " + super.getNome());
		sb.append(" - Aroma de " + aroma);
		sb.append(" - Peso: " + peso);
		sb.append(" - Preço: " + calcularPrecoFinal(super.getPreco()));
		sb.append(" - Código: " + super.getCodigo());
		
		return sb.toString();
	}
	
	
	
}

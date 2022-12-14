package dominio;

public class Passaro extends Racao { 
	private String tipo; //ex: calopsita, canario, coleiro, trinca-ferro, papagaio
	private String aroma;
	private int pesoGramas;
	
	public String definirPreco(){
		return null;
	}

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

	public int getPesoGramas() {
		return pesoGramas;
	}

	public void setPesoGramas(int pesoGramas) {
		this.pesoGramas = pesoGramas;
	}
	
}

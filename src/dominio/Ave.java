package dominio;

public class Ave extends Racao { 
	public Passaro(String nome, int validade, float preco) {
		super(nome, validade, preco);
		// TODO Auto-generated constructor stub
	}

	private String tipo; //ex: calopsita, canario, coleiro, trinca-ferro, papagaio
	private String aroma;
	private float peso;
	
	@Override
	public double calcularPrecoFinal(double preco){
		return 0;
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

	public float getPeso() {
		return peso;
	}

	public void setPesoGramas(float peso) {
		this.peso = peso;
	}
	
}

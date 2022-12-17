package dominio;

public class Cao extends Racao {
	private boolean semCorante;
	private boolean filhotes;
	private String porte; //racas pequenas, porte m�dio, grande porte
	
	public Cao(String nome, int codigo, double preco, boolean semCorante, boolean filhote, String porte) {
		super(nome, codigo, preco);
		this.semCorante = semCorante;
		this.porte = porte;
	}
	@Override
	public double calcularPrecoFinal(double preco) {
		if(semCorante) {
			preco+=10;
		}
		if(filhotes) {
			preco+=20;
		}
		if(porte == "racasPequenas") {
			preco+=30;
		}
		if(porte == "grandePorte") {
			preco+=15;
		}
		return preco;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ra��o: " + Cao.this.getNome());
		if(filhotes) {
			sb.append("/Filhotes");
		}else {
			sb.append("/Adultos");
		}
		if (porte == "racasPequenas") {
			sb.append("/Ra�as Pequenas");
		}else if(porte == "grandePorte") {
			sb.append("/Grande Porte");
		}
		sb.append(" - Pre�o: " + calcularPrecoFinal(Cao.this.getPreco()));
		if(semCorante) {
			sb.append(" - Corante: sem corante");
		}else {
			sb.append(" - Corante: artificial");
		}
		sb.append(" - C�digo: " + Cao.super.getCodigo());
		
		return sb.toString();
	}
}

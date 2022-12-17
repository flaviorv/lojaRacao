package dominio;

public class Cao extends Racao {
	private boolean semCorante;
	private boolean filhotes;
	private String porte; //racas pequenas, porte médio, grande porte
	
	public boolean isSemCorante() {
		return semCorante;
	}
	public void setSemCorante(boolean semCorante) {
		this.semCorante = semCorante;
	}
	public boolean isFilhotes() {
		return filhotes;
	}
	public void setFilhotes(boolean filhotes) {
		this.filhotes = filhotes;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public Cao(String nome, int codigo, float preco) {
		super(nome, codigo, preco);
	}
	@Override
	public float calcularPrecoFinal(float preco) {
		if(semCorante) {
			preco+=10;
		}
		if(filhotes) {
			preco+=20;
		}
		if(porte == "Raças Pequenas") {
			preco+=30;
		}
		if(porte == "Grande Porte") {
			preco+=15;
		}
		return preco;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ração: " + super.getNome());
		if(filhotes) {
			sb.append("/Filhotes");
		}else {
			sb.append("/Adultos");
		}
		sb.append("/" + porte);
		sb.append(" - Preço: " + calcularPrecoFinal(super.getPreco()));
		if(semCorante) {
			sb.append(" - Corante: sem corante");
		}else {
			sb.append(" - Corante: artificial");
		}
		sb.append(" - Código: " + super.getCodigo());
		
		return sb.toString();
	}
	
}

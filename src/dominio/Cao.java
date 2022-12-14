package dominio;

public class Cao extends Racao {
	private boolean semCorante;
	private boolean filhote;
	private String porte; //racas pequenas, porte médio, grande porte
	
	
	public String definirPreco(){
		return null;
	}
	public boolean isSemCorante() {
		return semCorante;
	}
	public void setSemCorante(boolean semCorante) {
		this.semCorante = semCorante;
	}
	public boolean isFilhote() {
		return filhote;
	}
	public void setFilhote(boolean filhote) {
		this.filhote = filhote;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
}

package testes;
import dominio.Ave;

public class AveTeste {
	public static void main(String[] args) {
		Ave a1 = new Ave("VaroTorneio", 234, 24.23f);
		a1.setAroma("Mamão");
		a1.setPeso(12.32f);
		a1.setTipo("Coleiro");
		System.out.println(a1.toString());
	}
}

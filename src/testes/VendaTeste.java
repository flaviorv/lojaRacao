package testes;
import dominio.Cliente;
import dominio.Venda;

public class VendaTeste {
	public static void main(String[] args) {
		Venda v1 = new Venda();
		v1.setData("17/12/2022");
		v1.setCliente(new Cliente("Mariana Almeida", "154.555.686-98", "(55)99987-9876"));
		v1.setEntrega(true);
		v1.setEndereco("Travessa Padre Cláudio, 233, Centro, Sao Paulo - SP");
		
		System.out.println(v1.toString());
	}
}

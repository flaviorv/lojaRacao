package testes;

import dominio.Cliente;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("João Carlos da Silva", "115.456.422-45", "(54)3265-1552");
		System.out.println(c1.toString());
	}
}
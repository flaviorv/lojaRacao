package testes;

import dominio.Gato;

public class GatoTeste {
	
	public static void main(String[] args) {
		Gato miau = new Gato("Miau", 23456, 45.78f);
		miau.setSabor("Peixe");
		miau.setCastrado(true);
		System.out.println(miau.imprimirRacao());
	}
	
	
	
}

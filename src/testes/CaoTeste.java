package testes;

import dominio.Cao;

public class CaoTeste {
	
	public static void main(String[] args) {
		Cao cachorroFeliz = new Cao("Cachorro Feliz", 111223, 5.60f);
		cachorroFeliz.setFilhotes(true);
		cachorroFeliz.setPorte("Raças Pequenas");
		cachorroFeliz.setSemCorante(true);
		System.out.println(cachorroFeliz.toString());
	}
	
}

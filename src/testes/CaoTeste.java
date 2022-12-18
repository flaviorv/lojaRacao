package testes;

import dominio.Cao;
import exceptions.PalavraInvalidaException;

public class CaoTeste {
	
	public static void main(String[] args) {
		try {
			Cao cachorroFeliz = new Cao("Cachorro Feliz", 111223, 5.60f);
			cachorroFeliz.setFilhotes(false);
			cachorroFeliz.setPorte("Raças Pequenas");
			cachorroFeliz.setSemCorante(true);
			System.out.println(cachorroFeliz.toString());
		} catch (PalavraInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

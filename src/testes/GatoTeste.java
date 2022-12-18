package testes;

import dominio.Gato;
import exceptions.AtribuicaoInconsistenteException;
import exceptions.PalavraInvalidaException;

public class GatoTeste {
	
	public static void main(String[] args) {
		
		try {
			Gato miau = new Gato("Miau", 23456, 45.78f);
			miau.setSabor("Peixe");
			miau.setFilhote(true);
			miau.setCastrado(false);
			System.out.println(miau.toString());
		} catch (AtribuicaoInconsistenteException | PalavraInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}
}
package es.eoi.entities;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
	
	private List<Carta> mazo;
	
	public Baraja() {
		inicializaBaraja();
	}

	private void inicializaBaraja() {
		mazo = new ArrayList();
		
		for(PaloEnum palo : PaloEnum.values()) {
			for(NumeroEnum numero : NumeroEnum.values()) {
				mazo.add(new Carta(numero, palo));
			}
		}
	}
	
	public List<Carta> getMazo() {
		return mazo;
	}
	
}

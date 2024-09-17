package es.eoi.app;

import java.util.Collections;

import es.eoi.entities.Baraja;
import es.eoi.entities.Carta;

public class JuegoMain {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		System.out.println("Nº Cartas: "+baraja.getMazo().size());
		
		for(Carta carta :  baraja.getMazo()) {
			System.out.println(carta);
		}
		
		Collections.shuffle(baraja.getMazo());
		System.out.println("---------------------------------------------");
		
		for(Carta carta :  baraja.getMazo()) {
			System.out.println(carta);
		}
	}

}

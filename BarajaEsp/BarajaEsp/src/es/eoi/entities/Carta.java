package es.eoi.entities;

public class Carta {
	private NumeroEnum numero;
	private PaloEnum palo;
	
	public Carta(NumeroEnum numero, PaloEnum palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public NumeroEnum getNumero() {
		return numero;
	}
	
	public PaloEnum getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "["+numero + " - " + palo + "]";
	}
	
	
	
	
}

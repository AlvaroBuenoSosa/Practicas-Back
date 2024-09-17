package EjerciciosClase;

import java.text.MessageFormat;

public class AJBSTipoDatos {
	public static void main(String[] args) {
	
	String nombre = "Alvaro";
	String apellidos = " Bueno Sosa";
	String diaDeNacimiento = "20";
	String mesDeNacimiento = "Febrero";
	int añoDeNacimiento = 1997;
	String ciudad = "Sevilla";
	int edad = 27;
	Boolean estudias = true;
	Boolean trabajas = false;
	
	System.out.println("Hola me llamo "+ nombre + apellidos + " y tengo "+ edad + ' ' +"años");
	System.out.println("Nací el "+ diaDeNacimiento + ' ' + mesDeNacimiento + ' ' + añoDeNacimiento + " y vivo en "+ ciudad);
}
}
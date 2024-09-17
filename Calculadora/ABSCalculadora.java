package EjerciciosClase;

import java.util.Scanner;

public class ABSCalculadora {
	
			final static int Suma = 1;
			final static int Resta = 2;
			final static int Multiplicacion = 3;
			final static int Division = 4;
		
	    public static void main(String[] args) {
	    
			
	        Scanner IntroducirNumero = new Scanner(System.in);
	        int opcion;
	        double numero1, numero2, resultado;

	        System.out.println("CALCULADORA");
	        System.out.println("1 – Sumar");
	        System.out.println("2 – Restar");
	        System.out.println("3 – Multiplicar");
	        System.out.println("4 – Dividir");
	        System.out.println("5 – Valor Absoluto");
	        System.out.println("6 – Mostrar PI");
	        System.out.print("Elige una opción: ");
	        opcion = IntroducirNumero.nextInt();

	        switch (opcion) {
	            case Suma: // Sumar
	            case Resta: // Restar
	            case Multiplicacion: // Multiplicar
	            case Division: // Dividir
	                System.out.print("Introduce el primer número: ");
	                numero1 = IntroducirNumero.nextDouble();
	                System.out.print("Introduce el segundo número: ");
	                numero2 = IntroducirNumero.nextDouble();
	                resultado = realizarOperacion(opcion, numero1, numero2);
	                System.out.println(crearMensajeResultado(opcion, numero1, numero2, resultado));
	                break;
	            case 5: // Valor Absoluto
	                System.out.print("Introduce un número: ");
	                numero1 = IntroducirNumero.nextDouble();
	                System.out.println("El valor absoluto de " + numero1 + " es: " + Math.abs(numero1));
	                break;
	            case 6: // Mostrar PI
	                System.out.println("El valor de PI es: " + Math.PI);
	                break;
	            default:
	                System.out.println("Opción no válida.");
	                break;
	        }

	        IntroducirNumero.close();
	    }

	    public static double realizarOperacion(int opcion, double num1, double num2) {
	        switch (opcion) {
	            case Suma: // Sumar
	                return num1 + num2;
	            case Resta: // Restar
	                return num1 - num2;
	            case Multiplicacion: // Multiplicar
	                return num1 * num2;
	            case Division: // Dividir
	                if (num2 == 0) {
	                    System.out.println("No se puede dividir por cero.");
	                    return Double.NaN; // Retornar no es un numero si la división es por cero
	                } else {
	                    return num1 / num2;
	                }
	            default:
	                return Double.NaN; // Cuando no es un numero permitido
	        }
	    }

	    public static String crearMensajeResultado(int opcion, double num1, double num2, double resultado) {
	        if (Double.isNaN(resultado)) {
	            return "Operación no válida.";
	        }

	        String simbolo = "";
	        switch (opcion) {
	            case Suma:
	                simbolo = "+";
	                break;
	            case Resta:
	                simbolo = "-";
	                break;
	            case Multiplicacion:
	                simbolo = "*";
	                break;
	            case Division:
	                simbolo = "/";
	                break;
	        }

	        return num1 + " " + simbolo + " " + num2 + " = " + resultado;
	    }
	}
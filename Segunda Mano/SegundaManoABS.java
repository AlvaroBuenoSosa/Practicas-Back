package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;

public class SegundaManoABS {
	
	public static Scanner elegirOpcion = new Scanner(System.in);
	public static ArrayList<String> carrito = new ArrayList<>();
		
	public static void main(String[] args) {		
		 int opcion;
		 do {
			 System.out.println("SUPERMERCADO COVID");
	            System.out.println("1 – Comprar producto (IVA Superreducido 4%)");
	            System.out.println("2 – Comprar producto (IVA Reducido 10%)");
	            System.out.println("3 – Comprar producto (IVA General 21%)");
	            System.out.println("4 – Cobrar");
	            System.out.print("Elige una opción: ");
	            opcion = elegirOpcion.nextInt();
	            
	            switch (opcion) {
                case 1:
                	
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
	            
	        } while (opcion != 4 && carrito.size() < 5);

	        if (carrito.size() >= 5) {
	            System.out.println("No puede comprar más productos, su carrito está lleno.");
	        }
	    }

	            
		 
		 public static void seleccionarProducto(String[] productos) {
		        mostrarProductos(productos);
		        System.out.print("Seleccione el número del producto que desea agregar al carrito: ");
		        int i = elegirOpcion.nextInt();
		        if (i > 0 && i <= productos.length) {
		            carrito.add(productos[i - 1]);
		            System.out.println("Producto añadido al carrito: " + productos[i - 1]);
		        } else {
		            System.out.println("Selección no válida.");
		        }
		    }
		 
		    public static void mostrarProductos(String[] productos) {
		        for (int indice = 0; indice < productos.length; indice++) {
		            System.out.println((indice + 1) + " - " + productos[indice]);
		        }
		    }

	}



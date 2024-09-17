package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;


public class ABSSupermercadoCovid {

	public static Scanner elegirOpcion = new Scanner(System.in);
    public static ArrayList<String> carrito = new ArrayList<>();
    public static String[] productoIvaSuperReducido = {"Alimentos frescos", "Pan", "Huevos", "Medicamentos", "Libros", "Periodicos", "Vivienda de proteccion oficial"};
    public static String[] productoIvaReducido = {"Alimentos elaborados", "Agua", "Bares", "Restaurantes", "Hoteles", "Vivienda Nueva", "Transporte de viajeros", "Productos farmacéuticos", "Higiene intima femenina"};
    public static String[] productosIvaGeneral = {"Ropa", "Coches", "Electricidad", "Gas natural", "Entradas a conciertos", "Cine", "Teatro", "Telefonía", "Gasolina", "Electro-domésticos"};
    
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
                    seleccionarProducto(productoIvaSuperReducido);
                    break;
                case 2:
                    seleccionarProducto(productoIvaReducido);
                    break;
                case 3:
                    seleccionarProducto(productosIvaGeneral);
                    break;
                case 4:
                    cobrar();
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

        public static void cobrar() {

            System.out.println("Procediendo al cobro...");
            System.out.println(carrito);

        }
    }


package TiendaRopaABS.View;

import java.util.Scanner;

import TiendaRopaABS.Dto.TiendaRopaABSProductDto;
import TiendaRopaABS.Service.TiendaRopaABSProductService;



public class TiendaRopaABSMenu {
	
	private TiendaRopaABSProductService productService = new TiendaRopaABSProductService();

	public void printMenu() {

		System.out.println("Bienvenido a mi app, selecciona una opcion");
		System.out.println("1-Crear Producto");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			TiendaRopaABSProductDto product= readData();			
			String response = productService.insertProduct(product);
			System.out.println(response);
			break;

		default:
			break;
		}

		printMenu();
	}
	
	@SuppressWarnings("resource")
	public TiendaRopaABSProductDto readData() {
		
		System.out.println("Introduce nombre:");	
		
		Scanner scan = new Scanner(System.in);
		
		String nombre=scan.next();
		
		System.out.println("Introduce tipo:");			
		scan = new Scanner(System.in);
		
		String tipo=scan.next();
		
		System.out.println("Introduce talla:");			
		scan = new Scanner(System.in);
		
		String talla=scan.next();
		
		System.out.println("Introduce color:");			
		scan = new Scanner(System.in);
		
		String color=scan.next();
		
		TiendaRopaABSProductDto product= new TiendaRopaABSProductDto();
		product.setName(nombre);
		product.setType(tipo);;
		product.setSize(talla);
		product.setColor(color);
		product.setPrecio(100.0);
		product.setMarca("Nike");
		
		return product;
		
	}

}

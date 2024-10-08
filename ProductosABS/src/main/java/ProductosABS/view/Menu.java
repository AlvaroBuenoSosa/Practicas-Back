package ProductosABS.view;

import java.util.Scanner;

import ProductosABS.dto.ProductDto;
import ProductosABS.service.ProductService;


public class Menu {

	private ProductService productService = new ProductService();

	public void printMenu() {

		System.out.println("Bienvenido a mi app, selecciona una opcion");
		System.out.println("1-Crear Producto");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			ProductDto product= readData();			
			String response = productService.insertProduct(product);
			System.out.println(response);
			break;

		default:
			break;
		}

		printMenu();
	}
	
	@SuppressWarnings("resource")
	public ProductDto readData() {
		
		System.out.println("Introduce nombre:");	
		
		Scanner scan = new Scanner(System.in);
		
		String nombre=scan.next();
		
		System.out.println("Introduce descripcion:");			
		scan = new Scanner(System.in);
		
		String descripcion=scan.next();
		
		ProductDto product= new ProductDto();
		product.setName(nombre);
		product.setDescription(descripcion);
		product.setPrice(240.0);
		product.setStock(2);
		
		return product;
		
	}

}
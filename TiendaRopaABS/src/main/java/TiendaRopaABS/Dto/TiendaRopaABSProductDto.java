package TiendaRopaABS.Dto;

public class TiendaRopaABSProductDto {
	
	private Integer id;
	
	private String name;
	
	private String type;
	
	private String size;
	
	private String color;
	
	private Double precio;
	
	private String marca;
	
	// Constructor
	
	public TiendaRopaABSProductDto(Integer id, String name, String type, String size, String color, Double precio,
			String marca) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.size = size;
		this.color = color;
		this.precio = precio;
		this.marca = marca;
	}

	// Getter & Setter
	
	public TiendaRopaABSProductDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}

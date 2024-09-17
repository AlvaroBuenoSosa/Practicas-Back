package EjerciciosClase;

public class Persona {
	
    private String nombre;
    private String apellidos;
    private int edad;
    private String fechaNacimiento;
    private String ciudad;
    private boolean trabajando;
    private boolean estudiando;
	
    
    public Persona(String nombre, String apellidos, int edad, String fechaNacimiento, String ciudad, boolean trabajando, boolean estudiando) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.trabajando = trabajando;
        this.estudiando = estudiando;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isTrabajando() {
		return trabajando;
	}

	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}

	public boolean isEstudiando() {
		return estudiando;
	}

	public void setEstudiando(boolean estudiando) {
		this.estudiando = estudiando;
	}

    public void saludar() {
        String mensaje = "Hola me llamo " + nombre + " " + apellidos + " y tengo " + edad + " años.\n" +
                         "Nací el " + fechaNacimiento + " y vivo en " + ciudad + "\n" +
                         "Actualmente " + (trabajando ? "estoy" : "no estoy") + " trabajando y " + (estudiando ? "estoy" : "no estoy") + " estudiando.";
        System.out.println(mensaje);
           
    }
}

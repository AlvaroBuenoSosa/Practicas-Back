package EjerciciosClase;

public class vehiculoABS {
	
	    private String marca;
	    private String modelo;
	    private String plazas;   
	    private String tipoCombustible; 
	    private int año;
	    private int añoMatriculacion;
	    private String precio;
	    
	    public vehiculoABS(String marca, String modelo, int año, String plazas, int añoMatriculacion, String precio, String tipoCombustible) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.plazas = plazas;
	        this.tipoCombustible = tipoCombustible;
	        this.año = añoMatriculacion;
	        this.precio = precio;
	    
	}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlazas() {
			return plazas;
		}

		public void setPlazas(String plazas) {
			this.plazas = plazas;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public int getAñoMatriculacion() {
			return añoMatriculacion;
		}

		public void setAñoMatriculacion(int añoMatriculacion) {
			this.añoMatriculacion = añoMatriculacion;
		}

		public String getTipoCombustible() {
			return tipoCombustible;
		}

		public void setTipoCombustible(String tipoCombustible) {
			this.tipoCombustible = tipoCombustible;
		}

		public String getPrecio() {
			return precio;
		}

		public void setPrecio(String precio) {
			this.precio = precio;
		}

}

package EjercicioJPAABS.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Bancos {
	
	@Entity
	@Table(name = "bancos", schema = "cliente-sucursales")
	
	public class Description {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int idbancos;
			
		@Column(name = "nombre")
		private String name;

		@Column(name = "ciudad")
		private String city;
		
		
		//@OneToMany(mappedBy = "bancos", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		//private List<Cuentas> cuentas;
				

		public int getId() {
			return idbancos;
		}

		public void setId(int id) {
			this.idbancos = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

}
}
package EjercicioJPAABS.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




public class Cuentas {
	
	@Entity
	@Table(name = "cuentas", schema = "cliente-sucursales")
	
	public class Description {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name = "saldo")
		private String balance;
		
		//@ManyToOne
		//@JoinColumn(name = "DNI")
		//private Cuentas cuentas;
		
		//@ManyToOne
		//@JoinColumn(name = "IDBANCO")
		//private Bancos bancos;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBalance() {
			return balance;
		}

		public void setBalance(String balance) {
			this.balance = balance;
		}
	
}
}
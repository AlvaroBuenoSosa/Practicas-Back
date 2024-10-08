package es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bancos", schema = "clientes-sucursales")
@Getter
@Setter
@ToString

public class Bancos {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idbancos;
			
		@Column(name = "nombre")
		private String name;

		@Column(name = "ciudad")
		private String city;
}

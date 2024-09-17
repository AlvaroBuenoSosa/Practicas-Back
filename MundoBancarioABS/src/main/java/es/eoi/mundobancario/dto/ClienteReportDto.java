package es.eoi.mundobancario.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import es.eoi.mundobancario.enums.MovimientosEnum;

@Getter
@Setter
public class ClienteReportDto {

    private Integer clienteId;
    private String nombre;
    private List<CuentaDto> cuentas;

    @Getter
    @Setter
    public static class CuentaDto {
        private Integer numCuenta;
        private String alias;
        private Double saldo;
        private List<MovimientoDto> movimientos;
		public Integer getNumCuenta() {
			return numCuenta;
		}
		public void setNumCuenta(Integer numCuenta) {
			this.numCuenta = numCuenta;
		}
		public String getAlias() {
			return alias;
		}
		public void setAlias(String alias) {
			this.alias = alias;
		}
		public Double getSaldo() {
			return saldo;
		}
		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		public List<MovimientoDto> getMovimientos() {
			return movimientos;
		}
		public void setMovimientos(List<MovimientoDto> movimientos) {
			this.movimientos = movimientos;
		}
    }

    @Getter
    @Setter
    public static class MovimientoDto {
        private Integer id;
        private MovimientosEnum tipo;
        private double importe;
        public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public MovimientosEnum getTipo() {
			return tipo;
		}
		public void setTipo(MovimientosEnum tipo) {
			this.tipo = tipo;
		}
		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public LocalDateTime getFecha() {
			return fecha;
		}
		public void setFecha(LocalDateTime fecha) {
			this.fecha = fecha;
		}
		private String description;
        private LocalDateTime fecha;
    }

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CuentaDto> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<CuentaDto> cuentas) {
		this.cuentas = cuentas;
	}
    
    
}

package es.eoi.mundobancario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import es.eoi.mundobancario.entity.Prestamo;
import es.eoi.mundobancario.service.PrestamoService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class PrestamosController {
	
	@Autowired
    private PrestamoService prestamoService;

	@PostMapping("/cuentas/{id}")
    public ResponseEntity<String> solicitarPrestamo(@PathVariable Integer id,
                                                    @RequestParam Double importe,
                                                    @RequestParam Integer plazos) {
        try {
            prestamoService.solicitarPrestamo(id, importe, plazos);
            return ResponseEntity.ok("Préstamo solicitado con éxito");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/cuentas/{id}")
    public ResponseEntity<List<Prestamo>> obtenerPrestamosPorCuenta(@PathVariable Integer id) {
        try {
            List<Prestamo> prestamos = prestamoService.obtenerPrestamosPorCuenta(id);
            return ResponseEntity.ok(prestamos);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("{id}/amortizaciones/revisar")
    public ResponseEntity<String> revisarAmortizaciones(@PathVariable Integer id) {
        prestamoService.revisarAmortizaciones(id);
        return ResponseEntity.ok("Revisión de amortizaciones completada");
    }
}
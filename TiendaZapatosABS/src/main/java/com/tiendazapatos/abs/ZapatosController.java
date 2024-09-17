package com.tiendazapatos.abs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zapatos")
public class ZapatosController {
	
	@Autowired
	ZapatosService zapatosService;
	
	@GetMapping
	public ResponseEntity<List<Zapatos>> findAll(){
		
		return ResponseEntity.ok(zapatosService.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ZapatosDto> find(@PathVariable Integer id) {

		try {
			ZapatosDto z=zapatosService.findZapatos(id);
			return new ResponseEntity<ZapatosDto>(z,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<ZapatosDto>(HttpStatus.NOT_FOUND);
		}
	}
		
		@PostMapping
		public ResponseEntity<String> create(@RequestBody Zapatos zapatos){
			
			try {
				zapatosService.save(zapatos);
				return new ResponseEntity<String>(HttpStatus.CREATED);			
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			
		}
		
		/*
		 * @DeleteMapping public ResponseEntity<String> deleteAll() {
		 * 
		 * zapatosService.deleteAll();
		 * 
		 * return new ResponseEntity<String>(HttpStatus.ACCEPTED); }
		 */
		
		@DeleteMapping("/{id}")
		public ResponseEntity<String> delete(@PathVariable Integer id) {

			zapatosService.delete(id);
			
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		
		@PutMapping("/{id}")
		public ResponseEntity<?> update(@RequestBody Zapatos zapatos, @PathVariable Integer id) {

			if (id.equals(zapatos.getId())) {
				zapatosService.save(zapatos);
				return new ResponseEntity<Zapatos>(HttpStatus.BAD_REQUEST);
			} else {
				return new ResponseEntity<String>(HttpStatus.CREATED);
			}
		}


		
	}



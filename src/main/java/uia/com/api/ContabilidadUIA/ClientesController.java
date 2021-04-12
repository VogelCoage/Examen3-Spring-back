package uia.com.api.ContabilidadUIA;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.*;

@RestController
public class ClientesController {
	/*
	 * Get all Clientes - provedores
	 */
	
	private ClientesRepositorio clientes = new ClientesRepositorio();
	
	@RequestMapping("clientes")
	public ResponseEntity<List<InfoUIA>> getAllClientes() {
		System.out.println("Saludos desde getAllClientes()");
		return ResponseEntity.ok(clientes.getListaProveedores());
	}

}

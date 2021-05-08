package uia.com.api.ContabilidadUIA.controladores;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.ClientesRepositorio;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})

public class ClientesController {
	/*
	 * Get all Clientes - proveedores
	 * @return a controller
	 */
	
	private ClientesRepositorio clientes = new ClientesRepositorio();
	ParmsCliente misParametros = null;
	
	@RequestMapping(value = "clientes", method = RequestMethod.GET)
	
	public ResponseEntity<List<InfoUIA>> getAllClientes(ParmsCliente parameters)
	{
		System.out.println("Saludos desde getAllClientes()");
		misParametros = parameters;
		int size = 0;
		if(clientes.getListaProveedores() != null)
		{
			size = clientes.getListaProveedores().size();
			System.out.println("regreso:\t" + size + "\t clientes:");
			System.out.println("parametros:\t pagina:\t" + misParametros.getPagina() +
					"\t tamPagina:\t" + misParametros.getTamanoPag());
		}
		return ResponseEntity.ok(clientes.getListaProveedores(misParametros));
	}
	
	
	
	/*
	 * Get a Cliente by clienteId
	 * @param clienteId
	 * @return a controller
	 */
	
	@RequestMapping(value = "clientes/{clienteId}", method = RequestMethod.GET)
	
	public ResponseEntity<InfoUIA> clienteById(@PathVariable String clienteId) throws ClassNotFoundException {
		System.out.println("Saludos desde clienteById()");
		return ResponseEntity.ok((InfoUIA)clientes.getProveedor(clienteId));
	}
	
	/*
	 * get size Clientes
	 * @return
	 * @return a controller
	 */
	
	@RequestMapping(value = "clientes/size", method = RequestMethod.GET)
	
	public ResponseEntity<Integer> sizeClientes() throws ClassNotFoundException {
		int size = -1;
		if(this.clientes.getGestorProveedores().getCatalogoMaestro() != null)
		{
			size = this.clientes.getGestorProveedores().getCatalogoMaestro().size();
		}
		System.out.println("Saludos desde size Clientes(): " + size);
		return ResponseEntity.ok(size);
	}
	
	/*
	 * Save a new cliente
	 * @param cliente
	 * @return
	 */
	
	@RequestMapping(value = "clientes", method = RequestMethod.POST)
	
	public ResponseEntity<List<InfoUIA>> agregaCliente(@RequestBody InfoUIA newCliente){
		System.out.println("Saludos desde agregaCliente()");
		if(clientes.agregaCatalogo(newCliente) == null)
		{
			System.out.println("Error en agregaCliente()");
		}
		return ResponseEntity.ok(clientes.getListaProveedores(misParametros));
	}
	
@RequestMapping(value = "clientes", method = RequestMethod.PUT)
	
	public ResponseEntity<List<InfoUIA>> actualizarCliente(@RequestBody InfoUIA newCliente){
		System.out.println("Saludos desde agregaCliente()");
		if(clientes.actualizaCatalogo(newCliente) == null)
		{
			System.out.println("Error en actualizarCliente()");
		}
		return ResponseEntity.ok(clientes.getListaProveedores(misParametros));
	}
	

}

package uia.com.api.ContabilidadUIA.modelo;

import java.util.ArrayList;

import uia.com.api.ContabilidadUIA.modelo.Proveedores.Proveedor;
import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.Gestor.DecoradorProveedores;
import uia.com.api.ContabilidadUIA.modelo.Gestor.Gestor;
//import uia.com.api.ContabilidadUIA.modelo.Proveedores.Proveedor;

public class ClientesRepositorio {
	
	public Gestor contabilidad =  null;
	public DecoradorProveedores gestorProveedores = null;		
	public ArrayList<InfoUIA> listaProveedores = null;
	//public ArrayList<InfoUIA> listaCuentas = null;
	public ArrayList<InfoUIA> listaCompras = null;
	//public ArrayList<InfoUIA> listaReqs = null;
	//public ArrayList<InfoUIA> listaCheques = null;
	public Proveedor proveedor = null;
	//public String clienteId="";

	public ClientesRepositorio()
	{
	 contabilidad = new Gestor("/Users/vogel/eclipse-workspace/ContabilidadUIA/ListaProveedores.json");		
	 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
	 gestorProveedores.Print();
	 listaProveedores = gestorProveedores.getLista();
	}
	
	
	public ArrayList<InfoUIA> getListaProveedores(String clienteName) {
		return listaProveedores;
	}

	public ArrayList<InfoUIA> getListaProveedores() {
		return listaProveedores;
	}
	
	public InfoUIA getProveedor(String clienteId) {
		proveedor = (Proveedor) contabilidad.busca(clienteId);
		proveedor.Print();
		return proveedor;
	}


	public void setListaProveedores(ArrayList<InfoUIA> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}


	public DecoradorProveedores getGestorProveedores() {
		return gestorProveedores;
	}

	public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
		this.gestorProveedores = gestorProveedores;
	}


	public InfoUIA getClienteById(String clienteId) {
		// TODO Auto-generated method stub
		return null;
	}


	public void borraCliente(String clienteId) {
		// TODO Auto-generated method stub
		
	}


	public ArrayList<InfoUIA> getAllClientes() {
		// TODO Auto-generated method stub
		return null;
	}


	public void checkCliente(InfoUIA cliente) {
		// TODO Auto-generated method stub
		
	}

	/*public ArrayList<InfoUIA> getCompras(String clienteId) {
		this.clienteId = clienteId;
		proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
		listaCompras = proveedor.getLista();
		//this.getCuentas(clienteId);
		return listaCompras;
	}

	public ArrayList<InfoUIA> getListaCompras(String clienteId) {
		this.clienteId = clienteId;
		getCompras(this.clienteId);
		return listaCompras;
	}

	public ArrayList<InfoUIA> getListaCompras() {
		return listaCompras;
	}*/
	
	/*public ArrayList<InfoUIA> getCuentas(String clienteName) 
	{			
		this.listaCuentas = proveedor.getListaCuentas();
		this.getReqs(clienteId);
		return this.listaCuentas;
	}

	public ArrayList<InfoUIA> getListaCuentas() {
		return listaCuentas;
	}
	
	public ArrayList<InfoUIA> getReqs(String clienteId) 
	{
		this.listaReqs = proveedor.getListaReqs();
		this.getCheques(clienteId);
		return this.listaReqs;
	}
	
	public ArrayList<InfoUIA> getListaReqs() {
		return this.listaReqs;
	}
	
	public ArrayList<InfoUIA> getCheques(String clienteId) 
	{
		this.listaCheques = proveedor.getListaCheques();
		return this.listaCheques;
	}
	
	Devuelve la lista a ClientesController
	public ArrayList<InfoUIA> getListaCheques() {
		return listaCheques;
	}		*/

}

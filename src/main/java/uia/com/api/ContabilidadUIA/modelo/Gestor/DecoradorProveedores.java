package uia.com.api.ContabilidadUIA.modelo.Gestor;

import java.util.ArrayList;
import java.util.Map;

import uia.com.api.ContabilidadUIA.controladores.ParmsCliente;
import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;

public class DecoradorProveedores extends Decorador {
	
	public DecoradorProveedores(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorProveedores()
	{		
	}
	
	public void validaProveedores()
	{
		super.Print();
	}
	
	public ArrayList<InfoUIA> getPagina(ParmsCliente parameters)
	{
		return super.getPagina(parameters);
	}
	
	public Map<String, InfoUIA> getCatalogoMaestro()
	{
		return super.getCatalogoMaestro();
	}

	/*public ArrayList<InfoUIA> getLista()
	{
		return super.getLista();
	}*/

}

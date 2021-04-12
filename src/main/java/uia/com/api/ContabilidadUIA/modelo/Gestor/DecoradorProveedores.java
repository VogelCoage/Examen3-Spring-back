package uia.com.api.ContabilidadUIA.modelo.Gestor;

import java.util.ArrayList;

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

	public ArrayList<InfoUIA> getLista()
	{
		return super.getLista();
	}

}

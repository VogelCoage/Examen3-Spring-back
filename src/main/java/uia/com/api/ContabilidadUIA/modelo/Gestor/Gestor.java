package uia.com.api.ContabilidadUIA.modelo.Gestor;

import java.util.Map;

import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.Clientes.ListaInfoUIA;

public class Gestor extends AGestor {
	
	public Gestor(String nomFile) {
		super(nomFile);
		// TODO Auto-generated constructor stub
	}

	public Gestor()
	{
	}	
	
	@Override
	public void Print() {
		super.Print();		
	}

	@Override
	public void Lee() {
		// TODO Auto-generated method stub
		
	}

	public InfoUIA agregaCatalogo(InfoUIA p)
	{
		return null;
	}
	
	public InfoUIA actualizaCatalogo(InfoUIA p)
	{
		return null;
	}
	
	public ListaInfoUIA getListaInfoUIA()
	{
		
		return super.getMiLista();
	}


	@Override
	public IGestor getGestor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setGestor(IGestor p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Map<String, InfoUIA> getCatalogoMaestro() {
		return super.getCatalogoMaestro();
	}

}

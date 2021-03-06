package uia.com.api.ContabilidadUIA.modelo.Gestor;

import java.util.Map;
import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.Clientes.ListaInfoUIA;

public interface IGestor {
	
	public void Print();
	public void Lee();
	public InfoUIA busca(String id);
	public Map<String, InfoUIA> getCatalogoMaestro();
	public void setCatalogo(Map<String, InfoUIA> p);
	public IGestor getGestor();
	public void setGestor(IGestor p);
	public InfoUIA agregaCatalogo(InfoUIA p);
	public InfoUIA actualizaCatalogo(InfoUIA p);
	public ListaInfoUIA getListaInfoUIA();
	public void salva();
}

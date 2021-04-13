package uia.com.api.ContabilidadUIA.modelo.Clientes;

import java.util.ArrayList;
import java.util.List;

public class ListaInfoUIA {
	
	protected int id;
	protected String name;
	
	 private List<InfoUIA> items;

	    public ListaInfoUIA(List<InfoUIA> pl) {
	        this.items = pl;
	    }

	    public ListaInfoUIA() {
	        this.items = new ArrayList<InfoUIA>();
	    }

	    public List<InfoUIA> getItems() {
	        return this.items;
	    }

	    public void setItems(List<InfoUIA> l) {
	        this.items = l;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public InfoUIA agregaCatalogo(InfoUIA newCatalogo)
		{
			//newCatalogo.Print();
			return null;
		}

}

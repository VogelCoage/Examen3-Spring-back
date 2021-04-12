package uia.com.api.ContabilidadUIA.modelo.Proveedores;

import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.api.ContabilidadUIA.modelo.Clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.Cuentas.Cuenta;

public class Proveedor extends InfoUIA {
	
	Double saldo = 0.0;
	Cuenta miCuenta = null;
	private ArrayList<InfoUIA> lista = null;
	
	@JsonCreator
    public Proveedor(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("saldo")double p1) 
	{
        super(id, name);
        super.type =  this. getClass(). getSimpleName();        
        this.saldo = p1;
    }
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void validaCobranza() 
	{
			getItems().forEach(t->
	 				{
	 					t.validaCobranza();
		 			}
	 				);
		
	}
	
	/*public ArrayList<InfoUIA> getLista() 
	{
		ClienteJSP cliente = null;
		
		if(lista != null)
		{
			((List<InfoUIA>) lista).clear();
		}
		else
			lista = new ArrayList<InfoUIA>();
		
		if (this.items != null) 
		{
        
			System.out.println("----- Lista -----");
			
            /*items.forEach(t->{
    			if(t.getCliente() != null)
    				((List<InfoUIA>) lista).add(t.getCliente());
            });
		}
		return lista;
	}*/

	/*public ArrayList<InfoUIA> getListaCuentas() 
	{
		ClienteJSP cliente = null;
		
		if(lista != null)
		{		
			lista = new ArrayList<InfoUIA>();
		}
		
		if (this.items != null) 
		{        
			System.out.println("----- Lista de cuentas -----");
			
            /*items.forEach(t->{
    			if(t.getItems() != null)
    			{
    				t.getItems().forEach(p->
    				{
    					((List<InfoUIA>) lista).add(p.getCliente());
    				});
    			}
    		});
		}
		return lista;
	}
	
	public ArrayList<InfoUIA> getListaReqs()
	{
		if (lista != null)
		{		
			lista = new ArrayList<InfoUIA>();
		}
		
		if (this.items != null) 
		{        
			System.out.println("----- Lista  de requisiciones -----");
			
            items.forEach(t->{
    			if(t.getItems() != null)
    			{
    				t.getItems().forEach(p->
    				{
    					if(p.getItems() != null)
    					{
    						p.getItems().forEach(q ->
    						{
    							((List<InfoUIA>) lista).add(q.getCliente());
    						});
    					}
    					
    				});
    			}
    		});
		}
		System.out.println("sip");
		return lista;		
	}
	
	public ArrayList<InfoUIA> getListaCheques() 
	{
		ClienteJSP cliente = null;
		
		if(lista != null)
		{		
			lista = new ArrayList<InfoUIA>();
		}
		
		if (this.items != null) 
		{        
			System.out.println("----- Lista de cheques -----");
			
            items.forEach(t->{
    			if(t.getItems() != null)
    			{
    				t.getItems().forEach(p->
    				{
    					p.getItems().forEach(q->
    					{
    						q.getItems().forEach(r->
    						{
    							((List<InfoUIA>) lista).add(r.getCliente());
    						});
    						
    					});
    					
    				});
    			}
    		});
		}
		return lista;
	}*/

}

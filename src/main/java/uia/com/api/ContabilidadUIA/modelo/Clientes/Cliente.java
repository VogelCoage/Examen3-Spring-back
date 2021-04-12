package uia.com.api.ContabilidadUIA.modelo.Clientes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.api.ContabilidadUIA.modelo.Cuentas.Cuenta;

public class Cliente extends InfoUIA {
	
	Double saldo = 0.0;
	Cuenta miCuenta = null;
	
	@JsonCreator
    public Cliente(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("estado")String estado) 
	{
        super(id, name, estado);        
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

}

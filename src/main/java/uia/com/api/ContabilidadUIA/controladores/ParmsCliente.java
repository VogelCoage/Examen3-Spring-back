package uia.com.api.ContabilidadUIA.controladores;

public class ParmsCliente {
	private int pagina = 0;
	private int idProveedor = -1;
	private int tamanoPag = 0;
	private String nombre = "";
	
	public ParmsCliente()
	{
		//
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public int getTamanoPag() {
		return tamanoPag;
	}

	public void setTamanoPag(int tamanoPag) {
		this.tamanoPag = tamanoPag;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

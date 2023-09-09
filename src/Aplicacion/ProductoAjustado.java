package Aplicacion;

import java.util.List;

public class ProductoAjustado implements Producto
{
	//atributos
	private ProductoMenu base;
	private List<Ingrediente> agregados;
	private List<Ingrediente> eliminados;
	
	//constructor
	public ProductoAjustado(ProductoMenu base)
	{
		this.base = base;
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//metodos
	
	
}

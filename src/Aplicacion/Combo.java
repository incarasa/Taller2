package Aplicacion;

import java.util.List;

public class Combo implements Producto
{
	//atributos
	private double descuento;
	private String nombreCombo;
	private List<ProductoMenu> itemsCombo;
	
	//constructor
	public Combo(String nombre, double descuento, List<ProductoMenu> itemsCombo)
	{
		this.descuento = descuento;
		this.nombreCombo = nombre;
		this.itemsCombo = itemsCombo;
	}
	
	//methods
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		return nombreCombo;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

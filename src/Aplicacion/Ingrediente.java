package Aplicacion;

public class Ingrediente
{
	//atributos
	private String nombre;
	private int costoAdicional;
	
	//constructor
	public Ingrediente(String nombre, int costoAdicional)
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	
	
	//metodos
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCostoAdicional()
	{
		return costoAdicional;
	}
}

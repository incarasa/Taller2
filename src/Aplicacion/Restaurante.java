package Aplicacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurante
{
	//atributos
	private Map<Integer , Pedido> pedidos = new HashMap<>();
	private Pedido pedidoEnCurso;
	private List<ProductoMenu> menuBase = new ArrayList<>();
	private List<Ingrediente> ingredientes = new ArrayList<>();
	private Map<String , Combo> combos = new HashMap<>();
	
	
	//constructor
	public Restaurante()
	{
		
	}
	
	//metodos
	public void IniciarPedido(String nombreCliente, String direccionCliente)
	{
		Pedido estePedido = new Pedido(nombreCliente , direccionCliente);
		
		
	}
	public void cargarInformacionRestaurante()throws FileNotFoundException, IOException
	{
		cargarIngredientes();
		cargarMenu();
		cargarCombos();
	}
	
	private void cargarIngredientes() throws FileNotFoundException, IOException
	{
		try 
		{
		    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\incar\\eclipse-workspace\\Taller2_Hamburguesas\\data\\ingredientes"));
		    String linea = br.readLine();
		    while (linea != null)
		    {
		    	String[] partes = linea.split(";");
		    	String nombreIngrediente = partes[0];
		    	int precioIngrediente = Integer.parseInt(partes[1]); //Se extrajo el valor ingrediente precio.
		    								//precio es str
		    	Ingrediente elIngrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
		    	ingredientes.add(elIngrediente);
		    }
		    
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
	}
	
	private void cargarMenu()throws FileNotFoundException, IOException
	{
		try 
		{
		    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\incar\\eclipse-workspace\\Taller2_Hamburguesas\\data\\menu"));
		    String linea = br.readLine();
		    while (linea != null)
		    {
		    	String[] partes = linea.split(";");
		    	String nombreProductoMenu = partes[0];
		    	int precioProductoMenu = Integer.parseInt(partes[1]); //Se extrajo el valor ingrediente precio.
		    								//precio es str
		    	ProductoMenu elProductoMenu = new ProductoMenu(nombreProductoMenu, precioProductoMenu);
		    	menuBase.add(elProductoMenu);
		    }
		    
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
	}
	
	private void cargarCombos() throws FileNotFoundException, IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\incar\\eclipse-workspace\\Taller2_Hamburguesas\\data\\combos"));
	    String linea = br.readLine();
	    while (linea != null)
	    {
	    	String[] partes = linea.split(";");
	    	String nombreCombo = partes[0];
	    	int descuento = Integer.parseInt(partes[1].replace("%" , ""));
	    	//se deja el descuento como entero
	    	String producto1 = partes[2];
	    	String producto2 = partes[3];
	    	String producto3 = partes[4];
	    	
	    	for (ProductoMenu producto : menuBase)
	    	{
	    		if (producto.getNombre() == producto1)
	    				{
	    					
	    				}
	    	}
	    	
	    	ProductoMenu elProducto1 = new
	    	
	    	Combo elCombo = new Combo();
	    }
	}
}

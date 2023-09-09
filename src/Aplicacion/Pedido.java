package Aplicacion;

import java.util.List;

public class Pedido
{
	//atributos
	private static int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private List<Producto> itemsPedido;
	
	//constructor
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		numeroPedidos += 1; //Esto es para el parametro static
	}
}

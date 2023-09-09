package Usuario;

import Aplicacion.Restaurante;

public class Aplicacion
{
	//parametros
	private Restaurante restaurante;
	
	//metodos
	
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Mostrar el menú");
		System.out.println("2. Iniciar nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar la información de un pedido dado su ID");
		System.out.println("6. Salir de la aplicación\n");
	}
	
	public void ejecutarOpcion(int opcionSelecionada)
	{
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Bienvenido a la aplicación de Hamburguesas el Corral");
		System.out.println("Cargando información...");
				
		boolean continuar = true;
		while (continuar) 
		{
			
		}

	}

}

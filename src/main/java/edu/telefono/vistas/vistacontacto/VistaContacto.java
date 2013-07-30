package edu.vistas.vistacontacto;
import java.io.*;
//import edu.telefono.vistas.vistaaplicacion.VistaMenu; aqui se invoca a la vista principal

import edu.telefono.contacto.Agenda;

public class VistaContacto
{
  public static void main( String args[] )
	{
		Agenda agenda=new Agenda();
		int opcion=1;
		while (opcion!=0)
		{
			System.out.println(" ");
			System.out.println("Menu Agenda");
			System.out.println("1 Agregar Contacto");
			System.out.println("2 Buscar Contacto por nombre");
			System.out.println("3 Buscar Contacto por telefono");
			System.out.println("4 Modificar Contacto por nombre");
			System.out.println("5 Eliminar contacto por Nombre");
			System.out.println("0 Salir");
			opcion=menu();
		
		
		
				switch (opcion){
				case 0:
					System.out.println("Saliendo de Contactos");
					System.exit(0);
					/*aqui se redirecciona a la vista principal*/
					break;
				case 1:
					agenda.agregar();
					break;
			
				case 2:
					agenda.busquedanom();
					break;
				
				case 3:			
					agenda.busquedatel();
					break;
		
				case 4:
					agenda.modnombre();
					break;
		
				case 5:
					agenda.elimnom();
					break;				
							
			}
		
		
}
	}
	static int menu()
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int opcion=1;
		try
		{
			opcion = Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		return opcion;
	}
	static String leer()
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String opcion="";
		try
		{
			opcion = br.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		return opcion;
	}
}

package edu.telefono.vistas.vistamensaje;

import java.io.*;
import java.util.Scanner;

import edu.telefono.mensaje.EscribirSms;
import edu.telefono.aplicaciones.Aplicaciones;



public class VistaMensaje {
	
	
	private static Scanner teclado;

  public void vistamensaje(){

		//EscribirSms msj = new EscribirSms();
		int opcion=1;
		
		teclado = new Scanner(System.in);
		
		while (opcion!=0)
		{
			System.out.println("Menu Mensajes");
			System.out.println("1 Escribir mensaje");
			System.out.println("2 Regresar al menu principal");
			System.out.println("0 Salir");
			opcion = menu();
			
				switch (opcion){
					case 0:
						System.out.println("Saliendo de Mensajes");
						System.exit(0);
						break;
					case 1:
						System.out.println("Escribe tu Mensaje");
						String msj = teclado.next();
						EscribirSms escribirSms = new EscribirSms();
						escribirSms.enviandoMensaje(msj);
						break;
				
					case 2:
						Aplicaciones menu=new Aplicaciones();
						menu.menuPrincipal();
						break;
					case 3:
					default:
						System.out.println("opcion no valida");
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


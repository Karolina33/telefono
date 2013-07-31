package edu.telefono.vistas.vistamusica;

import edu.telefono.aplicaciones.*;
import java.io.IOException;
import java.util.Scanner;

public class ViewMusica {

	/**
	 * @param args
	 */
	public String nombre;
	public int tamaño;
	public String genero;
	public String artista;
	public static char opcion;
	
		
public void menuPrincipal(){
		
		String titulo =("\tTELEFONO \n  (Aplicación Musica) \n Elegir Tipo de Busqueda\n");
		Scanner entrada=new Scanner(System.in);
		System.out.println(titulo);
		System.out.println("1.  Busqueda Por Genero");
		System.out.println("2.  Busqueda Por Artista ");
		System.out.println("   ");
		System.out.println("Regresar al Menú Principal__  R");
		System.out.println("salir de la aplicación__  S\n");
		System.out.println("  Elige una Opción: ");
		//opcion = entrada.nextLine();
		
		try {
			opcion = (char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				
		switch (opcion){
		case '1':
			buscarGenero();
			break;
		case '2':
			buscarArtista();
			break;
		case 'r':
			regresarMenuPrincipal();
			break;
		case 's':
			salir();
			break;
		default:
			System.out.println(" ");
		//	System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");			
			regresarMenuPrincipal();
		}
		
	}
	
	public  void buscarGenero(){
		ViewGenero genero=new ViewGenero();
		genero.elegirGenero();
					
	}
	
	public void buscarArtista(){
		ViewArtista artista=new ViewArtista();
		artista.elegirArtista();
				
	}
	
	public  void salir(){
		Aplicaciones apli=new Aplicaciones();
		apli.menuPrincipal();
	}
	
	public  void regresarMenuPrincipal(){
		menuPrincipal();				
	}	

}

package edu.telefono.vistas.vistamusica;

import edu.telefono.aplicaciones.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
		
public static void menuPrincipal(){
		
		String titulo =("\tTELEFONO \n  (Aplicación Musica) \n Elegir Tipo de Busqueda\n");
		
		System.out.println(titulo);
		System.out.println("1.  Busqueda Por Genero");
		System.out.println("2.  Busqueda Por Artista ");
		System.out.println("   ");
		System.out.println("Para regresar a la pantalla anterior oprimir: R");
		System.out.println("Para salir de aplicación oprimir: S\n");
		System.out.println("  Elige una Opción: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		try {
			
			//frase = new String(br.readLine());

		//opcion = frase.charAt(0);
			opcion=(char)System.in.read();
				
		switch (opcion){
		case '1':
		
			buscarGenero();
			//break;
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
			/*System.out.println(" ");
			System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");*/		
			regresarMenuPrincipal();
		break;
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
		}
		
	}
	
	public static void buscarGenero(){
		ViewGenero genero=new ViewGenero();
		genero.elegirGenero();
					
	}
	
	public static void buscarArtista(){
		ViewArtista artista=new ViewArtista();
		artista.elegirArtista();
				
	}
	
	public static void salir(){
		Aplicaciones apli=new Aplicaciones();
		apli.menuPrincipal();
	}
	
	public static void regresarMenuPrincipal(){
		menuPrincipal();				
	}	

}

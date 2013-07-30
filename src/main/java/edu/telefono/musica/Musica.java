package edu.telefono.musica;




import edu.telefono.musica.Artista;
import edu.telefono.musica.Genero;
//import com.Genero;

import java.util.*;

public class Musica {
	public String nombre;
	public int tamaño;
	public String genero;
	public String artista;
	public static String opcion;
	/*public static void main(String arg[]){
		menuPrincipal();
	} */
	
	public static void menuPrincipal(){
		
		String titulo =("\tTELEFONO \n  (Aplicación Musica) \n Elegir Tipo de Busqueda\n");
		Scanner entrada=new Scanner(System.in);
		System.out.println(titulo);
		System.out.println("1.  Busqueda Por Genero");
		System.out.println("2.  Busqueda Por Artista ");
		System.out.println("   ");
		System.out.println("Regresar al Menú Principal__  R");
		System.out.println("salir de la aplicación__  S\n");
		System.out.println("  Elige una Opción: ");
		opcion=entrada.nextLine();
				
		switch (opcion){
		case "1":
			buscarGenero();
			break;
		case "2":
			buscarArtista();
			break;
		case "r":
			regresarMenuPrincipal();
			break;
		case "s":
			salir();
			break;
		default:
			System.out.println(" ");
			System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");
			regresarMenuPrincipal();
		}
		
	}
	
	public static void buscarGenero(){
		Genero genero=new Genero();
		genero.elegirGenero();
					
	}
	
	public static void buscarArtista(){
		Artista artista=new Artista();
		artista.elegirArtista();
				
	}
	
	public static void salir(){
		System.exit(0);
	}
	
	public static void regresarMenuPrincipal(){
		menuPrincipal();				
	}


}

package edu.telefono.vistas.vistamusica;

import edu.telefono.musica.Musica;
import edu.telefono.musica.Pista;
import java.util.*;

public class ViewArtista {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	public String nombreArtista;
	public static String opcion;
	
	public static void elegirArtista(){
				
	    String titulo =("\tTELEFONO \n  (Aplicaci�n Musica) \n Elegir el Nombre del Artista2\n");
		Scanner entrada=new Scanner(System.in);
		System.out.println(titulo);
		System.out.println("1.  Alejandro fern�ndez");
		System.out.println("2.  Niga ");
		System.out.println("3.  Komander ");
		System.out.println("4.  Pedro Fern�ndez ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S");
		opcion=entrada.nextLine();
				
		switch (opcion){
		case "1":			
			mostrarPista();
			break;
		case "2":
			mostrarPista();
			break;
		case "3":
			mostrarPista();
			break;
		case "4":
			mostrarPista();
			break;
		case "r":
			Musica men=new Musica();
			men.music();
			break;
		case "s":
			System.exit(0);
			break;
		default:
			System.out.println(" ");
			System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");
			elegirArtista();
		}
		
	}
	public static void mostrarPista(){
		Pista pistaArt=new Pista();
		pistaArt.seleccionarPistaArt();		
	}

}

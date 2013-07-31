package edu.telefono.vistas.vistamusica;

import edu.telefono.musica.Musica;
import edu.telefono.musica.Pista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

import org.xml.sax.InputSource;

public class ViewArtista {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	public String nombreArtista;
	public static char opcion;
	
	public static void elegirArtista(){
				
	    String titulo =("\tTELEFONO \n  (Aplicación Musica) \n Elegir el Nombre del Artista2\n");
		//Scanner entrada=new Scanner(System.in);
		
		Scanner entrada = new Scanner(System.in); 
		try {
			opcion = (char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		System.out.println(titulo);
		System.out.println("1.  Alejandro fernández");
		System.out.println("2.  Niga ");
		System.out.println("3.  Komander ");
		System.out.println("4.  Pedro Fernández ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S");
		
		//opcion=entrada.nextLine();
				
		switch (opcion){
		case '1':			
			mostrarPista();
			break;
		case '2':
			mostrarPista();
			break;
		case '3':
			mostrarPista();
			break;
		case '4':
			mostrarPista();
			break;
		case 'r':
			Musica men=new Musica();
			men.music();
			break;
		case 's':
			System.exit(0);
			break;
		default:
			System.out.println(" ");
		//	System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");
			elegirArtista();
		}
		
	}
	public static void mostrarPista(){
		ViewPista pistaArt=new ViewPista();
		pistaArt.seleccionarPistaArt();		
	}

}

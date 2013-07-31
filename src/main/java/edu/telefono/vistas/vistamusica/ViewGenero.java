package edu.telefono.vistas.vistamusica;

import java.io.IOException;
import java.util.*;
import edu.telefono.musica.Musica;
import edu.telefono.musica.Pista;

public class ViewGenero {

	/**
	 * @param args
	 */
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	public String nombreGenero;	
	public String pist1;
	public static char opcion;
	public static void elegirGenero(){
		String titulo =("\tTELEFONO \n  (Aplicación Musica) \n Elegir Nombre de Género\n");
		Scanner entrada=new Scanner(System.in);
		System.out.println(titulo);
		System.out.println("1.  Jazz");
		System.out.println("2.  Clásico ");
		System.out.println("3.  Pop ");
		System.out.println("4.  Rock ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S\n");
		System.out.println("Elige una opcion:");
		
		try {
			opcion = (char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
				
		switch (opcion){
		case '1':			
			mostrarPista();
			break;
		case '2':			
			System.out.println(" ");
			mostrarPista();
			break;
		case '3':
			System.out.println(" ");
			mostrarPista();
			break;
		case '4':
			System.out.println(" ");
			mostrarPista();
			break;
		case 'r':
			ViewMusica mep=new ViewMusica();
			mep.menuPrincipal();
			break;
		case 's':
			System.exit(0);
			break;
		default:
			System.out.println(" ");
		//	System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");
			elegirGenero();
		}
		
				
	}
	
	
	public static void mostrarPista(){
				
		ViewPista pista=new ViewPista();
		pista.seleccionarPista();
				
	}
	
}

package edu.telefono.musica;

import java.util.*;

import edu.telefono.musica.Musica;
import edu.telefono.musica.Pista;


public class Genero {
public String nombreGenero;
	
	public String pist1;
	public static String opcion;
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
		opcion=entrada.nextLine();
				
		switch (opcion){
		case "1":			
			mostrarPista();
			break;
		case "2":			
			System.out.println(" ");
			mostrarPista();
			break;
		case "3":
			System.out.println(" ");
			mostrarPista();
			break;
		case "4":
			mostrarPista();
			break;
		case "r":
			Musica men=new Musica();
			men.menuPrincipal();
			break;
		case "s":
			System.exit(0);
			break;
		default:
			System.out.println(" ");
			System.out.println("La eleccion no es correcta vuelve a elegir");
			System.out.println(" ");
			elegirGenero();
		}
		
				
	}
	
	
	public static void mostrarPista(){
				
		Pista pista=new Pista();
		pista.seleccionarPista();
				
	}
	

}

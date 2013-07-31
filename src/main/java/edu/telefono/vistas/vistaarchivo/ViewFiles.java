package edu.telefono.vistas.vistaarchivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

import edu.telefono.aplicaciones.Aplicaciones;
import edu.telefono.archivo.EnviarArchivo;

public class ViewFiles {

	private static Scanner teclado;
	
	
	
	public static void main (String arg[]){
		Menu();
	}
	public static void Menu() {
			EnviarArchivo enviar = new EnviarArchivo();
			teclado = new Scanner(System.in);
			
		try {
			System.out.println("Intoduzca una opción:");
			System.out.println("1. Agregar ruta");
			System.out.println("R. Regresar al menu principal");
			System.out.println("S. Salir");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));			
			String frase = new String(br.readLine());
			char opcion = frase.charAt(0);
			switch (opcion) {
			case '1':
				System.out.println("Insertar Ruta:");
				String ruta = teclado.next();
				enviar.enviandoArchivo(ruta);
				break;
			case 'R':
			case 'r':
				Aplicaciones menu = new Aplicaciones();
				menu.menuPrincipal();
				break;
			case 'S':
			case 's':
				System.exit(0);
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	
}

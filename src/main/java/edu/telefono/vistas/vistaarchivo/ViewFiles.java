package edu.telefono.vistas.vistaarchivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.telefono.aplicaciones.Menu;
import edu.telefono.aplicaciones.Telefono;
import edu.telefono.archivo.EnviarArchivo;
import edu.telefono.vistas.vistacalculadora.VistaCalculadora;

public class ViewFiles {

	public static void main(String a[]) {
			EnviarArchivo enviar = new EnviarArchivo();
		try {
			System.out.println("Intoduzca una opción:");
			// System.out.println ("---------------------");
			System.out.println("1. Agregar ruta");
			System.out.println("R. Regresar al menu principal");
			System.out.println("S. Salir");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));			
			String frase = new String(br.readLine());
			char opcion = frase.charAt(0);
			switch (opcion) {
			case '1':
				System.out.println("Insertar Ruta");
				enviar.enviandoArchivo("/C:/Prueba/Archivo.txt");
				break;
			case 'R':
			case 'r':
				Menu menu = new Menu();
				menu.mostrarMenu();
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

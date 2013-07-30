package edu.telefono.vistas.vistaaplicaciones;

import java.util.Scanner;

import edu.telefono.musica.Musica;
import edu.telefono.vistas.vistaaplicaciones.Telefono;
import edu.telefono.aplicaciones.*;
import edu.telefono.vistas.vistaarchivo.*;


public class Aplicaciones {
	
	public void menuPrincipal() {
		
		
		 
		Scanner read = new Scanner(System.in);
		int op = 0;

		do {
			System.out.println("Menú Principal");
			System.out.println("1. Contacto " + "\n2. Calculadora"
					+ "\n3. Musica" + "\n4. Enviar SMS"
					+ "\n5. Enviar Archivos" + "\n6. Salir");
			System.out.println("Elija una opción");

			op = read.nextInt();

			if (op == 1) {
				//Contacto contacto = new Contacto();
				//contacto.mostarcontacto();
			}

			else if (op == 2) {
				
				Calculadora calculadora = new Calculadora();
				calculadora.menu();
			} else if (op == 3) {

				Musica musica = new Musica();
				musica.menuPrincipal();
				
				
			} else if (op == 4) {
				EscribirSms escribirSms = new EscribirSms();
				escribirSms.enviandoMensaje ();
				
			} else if (op == 5) {
				EnviarArchivo enviarArchivo = new EnviarArchivo();
				enviarArchivo.enviandoArchivo();
				
			} else if (op == 6) {
				System.out.println("Gracias por utilizar la aplicación");
			} else {
				System.out.println("ERROR, por favor escriba bien");
			}

		} while (op != 6);

	}

}

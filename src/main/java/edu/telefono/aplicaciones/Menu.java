package edu.telefono.aplicaciones;

import java.util.Scanner;
import edu.telefono.aplicaciones.*;
import edu.telefono.musica.Musica;
import edu.telefono.vistas.vistacalculadora.VistaCalculadora;

public class Menu {

  public void mostrarMenu() {
		
		

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
				// ejecutar el Programa Uno
			}

			else if (op == 2) {
			VistaCalculadora.main(null);
			} else if (op == 3) {
				// ejecutar el Programa Dos
				Musica mus=new Musica();
				mus.menuPrincipal();
				System.out.println("Opcion es musica");
			} else if (op == 4) {
				// ejecutar el Programa Dos
			} else if (op == 5) {
				// ejecutar el Programa Dos
			} else if (op == 6) {
				System.out.println("Gracias por utilizar la aplicación");
			} else {
				System.out.println("ERROR, por favor escriba bien");
			}

		} while (op != 6);

	}

}

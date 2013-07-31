package edu.telefono.aplicaciones;

import java.util.Scanner;


///import edu.telefono.vistas.vistaaplicaciones.Telefono;

import edu.telefono.vistas.vistaarchivo.*;
import edu.telefono.vistas.vistacalculadora.*;
import edu.telefono.vistas.vistacontacto.*;
import edu.telefono.vistas.vistamensaje.*;
import edu.telefono.vistas.vistamusica.*;





public class Aplicaciones {

	public void menuPrincipal() {

		Scanner read = new Scanner(System.in);
		int op = 0;

		do {
			System.out.println("Menu Principal");
			System.out.println("1. Contacto " + "\n2. Calculadora"
					+ "\n3. Musica" + "\n4. Enviar SMS"
					+ "\n5. Enviar Archivos" + "\n6. Salir");
			System.out.println("Elija una opcion");

			op = read.nextInt();

			if (op == 1) {
				VistaContacto vistaContacto = new VistaContacto();
				vistaContacto.vistacontacto();
			}

			else if (op == 2) {

				VistaCalculadora calculadora = new VistaCalculadora();
				calculadora.mostrarMenu();
			} else if (op == 3) {

				ViewMusica viewMusica = new ViewMusica();
				viewMusica.menuPrincipal();

			} else if (op == 4) {
				VistaMensaje vistaMensaje = new VistaMensaje();
				vistaMensaje.vistamensaje();

			} else if (op == 5) {
				ViewFiles viewFiles = new ViewFiles();
				viewFiles.Menu();

			} else if (op == 6) {
				System.out.println("Gracias por utilizar la aplicacion");
			} else {
				System.out.println("ERROR, por favor escriba bien");
			}

		} while (op != 6);

	}

}

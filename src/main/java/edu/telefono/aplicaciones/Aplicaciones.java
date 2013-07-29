package edu.telefono.aplicaciones;

import java.util.Scanner;
import edu.telefono.aplicaciones.Menu;
import edu.telefono.aplicaciones.*;

public class Aplicaciones {

  //public Menu menu;

	public static void main(String[] args) {

		Aplicaciones aplicaciones = new Aplicaciones();
		aplicaciones.mostrarMenu();
	}
	
	public void mostrarMenu(){
		Scanner read = new Scanner(System.in);
		int op = 0;

		do {
			System.out.println("Menú Principal");
			System.out.println("1. Aplicaciones" + "\n2. Salir");

			op = read.nextInt();

			if (op == 1) {

				Menu menu = new Menu();
				menu.mostrarMenu();

			}

			else if (op == 2) {
				System.out.println("Gracias por utilizar la aplicación");
				// ejecutar el Programa Dos
			} else {
				System.out.println("ERROR, por favor escriba bien");
			}

		} while (op != 2);
	}

}

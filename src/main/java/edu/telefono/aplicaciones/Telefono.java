package edu.telefono.aplicaciones;


import java.util.Scanner;
import edu.telefono.aplicaciones.*;


public class Telefono {
	
	public static void main(String[] args) {

		Telefono telefono = new Telefono();
		telefono.menuPrincipal();
		
		
		
	}
	
	 public void menuPrincipal(){
		 try{
		Scanner read = new Scanner(System.in);
		int op = 0;

		do {
			System.out.println("Menu Principal");
			System.out.println("1. Aplicaciones" + "\n2. Salir");

			op = read.nextInt();

			if (op == 1) {

				Aplicaciones aplicaciones = new Aplicaciones();
				aplicaciones.menuPrincipal();
			}

			else if (op == 2) {
				System.out.println("Gracias por utilizar la aplicacion");
				// ejecutar el Programa Dos
			} else {
				System.out.println("ERROR, por favor escriba bien");
			}

		} while (op != 2);
			} catch (Exception e) {
				System.out.println("no se aceptan letras solo numeros!!!");
				Telefono telefono = new Telefono();
				telefono.menuPrincipal();
			}
		 
		
	}


}

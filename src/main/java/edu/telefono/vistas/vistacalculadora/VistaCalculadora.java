package edu.telefono.vistas.vistacalculadora;

import java.util.Scanner;
import edu.telefono.aplicaciones.Aplicaciones;
import edu.telefono.calculadora.Calculadora;


public class VistaCalculadora {

	private Scanner teclado;
	
	 public void mostrarMenu(){
				System.out.println("\t    Calculadora\n");
				System.out.println("Elija la operacion que desea realizar:");
				System.out.println("\n\t1\tSuma");
				System.out.println("\t2\tResta");
				System.out.println("\t3\tMultiplicacion");
				System.out.println("\t4\tDivicion");
				System.out.println("\t5\tRaiz Cuadrada");
				System.out.println("\t6\tSeno");
				System.out.println("\t7\tCoseno");
				System.out.println("\t8\tMenu del Telefono");
				System.out.println("\nElija una opcion:");
				opcion();
	 }
	 
	 private void opcion(){
			Calculadora calc = new Calculadora();
			try {
				teclado = new Scanner(System.in);
				int opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					calc.num1();
					calc.num2();
					calc.operacionSuma();
					calc.imprimir();
					break;
				case 2:
					calc.num1();
					calc.num2();
					calc.operacionResta();
					calc.imprimir();
					break;
				case 3:
					calc.num1();
					calc.num2();
					calc.operacionMulti();
					calc.imprimir();
					break;
				case 4:
					calc.num1();
					calc.num2();
					calc.operacionDivi();
					calc.imprimir();
					break;
				case 5:
					calc.num1();
					calc.operacionRaiz();
					calc.imprimir();
					break;
				case 6:
					calc.num1();
					calc.operacionSeno();
					calc.imprimir();
					break;
				case 7:
					calc.num1();
					calc.operacionCoseno();
					calc.imprimir();
					break;
				case 8:
					//Regresar al muenu del telefono
					break;
				default:
					System.out.println("Error: opcion invalida");
					 opcion();
					break;
				}
			} catch (Exception error) {
				System.out.println("Error: opcion invalida");
				 opcion();
			}
		}
	}

package edu.telefono.vistas.vistacalculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import edu.telefono.calculadora.Calculadora;

public class VistaCalculadora {

  
  public static void main(String a[]) {
		Calculadora calc = new Calculadora();// creamos el objeto calc
		
    // operaciones.
		try {
				System.out.println("\t    Calculadora\n");
				System.out.println("Elija la operación que desea realizar:");
				System.out.println("\n\t1\tSuma");
				System.out.println("\t2\tResta");
				System.out.println("\t3\tMultiplicacion");
				System.out.println("\t4\tDivicion");
				System.out.println("\t5\tRaiz Cuadrada");
				System.out.println("\t6\tSeno");
				System.out.println("\t7\tCoseno");
				System.out.println("\nElija una opción:");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String frase = new String(br.readLine());
				int opcion = Integer.parseInt(frase);

				switch (opcion) {
				case 1:
					calc.Suma();
					break;
				case 2:
					calc.Resta();
					break;
				case 3:
					calc.Multiplicacion();
					break;
				case 4:
					calc.Division();
					break;
				case 5:
					calc.Raiz();
					break;
				case 6:
					calc.Seno();
					break;
				case 7:
					calc.Coseno();
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} catch (Exception error) {

			}
		}
	}

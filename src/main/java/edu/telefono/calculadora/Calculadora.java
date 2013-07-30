package edu.telefono.calculadora;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Jaime y Adriana
 */
public class Calculadora {

  public void Menu() {
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
				this.Suma();
				break;
			case 2:
				this.Resta();
				break;
			case 3:
				this.Multiplicacion();
				break;
			case 4:
				this.Division();
				break;
			case 5:
				this.Raiz();
				break;
			case 6:
				this.Seno();
				break;
			case 7:
				this.Coseno();
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} catch (Exception error) {

		}
	}

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



	// Metodo Sumar
		private void Suma() {
			try {
				float sumar;
				
				System.out.println("Ingrese primer numero: ");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String frase1 = new String(br1.readLine());
				float num1 = Float.parseFloat(frase1);

				System.out.println("Ingrese segundo numero: ");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String frase2 = new String(br2.readLine());
				float num2 = Float.parseFloat(frase2);
				sumar = num1 + num2;
				System.out.println("\nEl resultado de la suma es: " + sumar);
				try{
					System.out.println("Desea continuar sumando?\n1=si\n2=no");
					BufferedReader opsi = new BufferedReader(new InputStreamReader(System.in));
					String pregunta = new String(opsi.readLine());
					int op1 = Integer.parseInt(pregunta);	
				while(op1==1) {
					System.out.println("Ingrese otro numero: ");
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String frase3 = new String(br3.readLine());
					float num3 = Float.parseFloat(frase3);
					sumar+=num3;
					
					System.out.println("\nEl resultado de la suma es: " + sumar);
					System.out.println("\nDesea continuar sumando?\n1=si\n2=no");
					opsi = new BufferedReader(new InputStreamReader(System.in));
					pregunta = new String(opsi.readLine());
					op1 = Integer.parseInt(pregunta);

				}
			} catch (Exception error) {

			}
				
				Limpiar();
				System.out.println("\t\tCalculadora");
				System.out.println("\n\t\t   Suma");
				System.out.println("\nEl resultado de la suma es: " + sumar);
				Regresar();
				
			} catch (Exception error) {
				System.out.println("\nSolo se admiten numeros");
			}
		}

		// Metodo Restar
		private void Resta() {
			
			try {
				float resultado;
				
				System.out.println("Ingrese primer numero: ");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String frase1 = new String(br1.readLine());
				float num1 = Float.parseFloat(frase1);

				System.out.println("Ingrese segundo numero: ");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String frase2 = new String(br2.readLine());
				float num2 = Float.parseFloat(frase2);
				resultado = num1 - num2;
				System.out.println("\nEl resultado de la resta es: " + resultado);
				try{
					System.out.println("Desea continuar sumando?\n1=si\n2=no");
					BufferedReader opsi = new BufferedReader(new InputStreamReader(System.in));
					String pregunta = new String(opsi.readLine());
					int op1 = Integer.parseInt(pregunta);	
				while(op1==1) {
					System.out.println("Ingrese otro numero: ");
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String frase3 = new String(br3.readLine());
					float num3 = Float.parseFloat(frase3);
					resultado -=num3;
					
					System.out.println("\nEl resultado de la resta es: " + resultado);
					System.out.println("\nDesea continuar sumando?\n1=si\n2=no");
					opsi = new BufferedReader(new InputStreamReader(System.in));
					pregunta = new String(opsi.readLine());
					op1 = Integer.parseInt(pregunta);

				}
			} catch (Exception error) {

			}
				
				Limpiar();
				System.out.println("\t\tCalculadora");
				System.out.println("\n\t\t   Resta");
				System.out.println("\nEl resultado de la resta es: " + resultado);
				Regresar();
				
			} catch (Exception error) {
				System.out.println("\nSolo se admiten numeros");
			}

		}

		// Metodo Multiplicar
		private void Multiplicacion() {
			try {
				float resultado;
				
				System.out.println("Ingrese primer numero: ");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String frase1 = new String(br1.readLine());
				float num1 = Float.parseFloat(frase1);

				System.out.println("Ingrese segundo numero: ");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String frase2 = new String(br2.readLine());
				float num2 = Float.parseFloat(frase2);
				resultado = num1 * num2;
				System.out.println("\nEl resultado de la multiplicacion es: " + resultado);
				try{
					System.out.println("Desea continuar Multiplicando?\n1=si\n2=no");
					BufferedReader opsi = new BufferedReader(new InputStreamReader(System.in));
					String pregunta = new String(opsi.readLine());
					int op1 = Integer.parseInt(pregunta);	
				while(op1==1) {
					System.out.println("Ingrese otro numero: ");
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String frase3 = new String(br3.readLine());
					float num3 = Float.parseFloat(frase3);
					resultado *=num3;
					
					System.out.println("\nEl resultado de la multiplicacion es: " + resultado);
					System.out.println("\nDesea continuar multiplicando?\n1=si\n2=no");
					opsi = new BufferedReader(new InputStreamReader(System.in));
					pregunta = new String(opsi.readLine());
					op1 = Integer.parseInt(pregunta);

				}
			} catch (Exception error) {

			}
				
				Limpiar();
				System.out.println("\t\tCalculadora");
				System.out.println("\n\t\t   Multiplicacion");
				System.out.println("\nEl resultado de la multiplicacion es: " + resultado);
				Regresar();
				
			} catch (Exception error) {
				System.out.println("\nSolo se admiten numeros");
			}
		}

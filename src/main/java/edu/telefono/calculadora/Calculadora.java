package edu.telefono.calculadora;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import edu.telefono.vistas.vistacalculadora.VistaCalculadora;

/**
 * 
 * @author Jaime y Adriana
 */
public class Calculadora {

  	// Metodo Sumar
		public void Suma() {
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
		public void Resta() {
			
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
		public void Multiplicacion() {
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


		// Metodo Dividir
		public void Division() {
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
				
				if (num2 == 0) {
					Limpiar();
					System.out.println("ADVERTENCIA: No es posible la division por cero, comience de nuevo!!!\n\n");
				}else{
				
				resultado = num1 / num2;
				
				System.out.println("\nEl resultado de la divicion es: " + resultado);
				
				try{
					System.out.println("Desea continuar dividiendo?\n1=si\n2=no");
					BufferedReader opsi = new BufferedReader(new InputStreamReader(System.in));
					String pregunta = new String(opsi.readLine());
					int op1 = Integer.parseInt(pregunta);	
				while(op1==1) {
					System.out.println("Ingrese otro numero: ");
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String frase3 = new String(br3.readLine());
					float num3 = Float.parseFloat(frase3);
					resultado /=num3;
					
					System.out.println("\nEl resultado de la divicion es: " + resultado);
					System.out.println("\nDesea continuar dividiendo?\n1=si\n2=no");
					opsi = new BufferedReader(new InputStreamReader(System.in));
					pregunta = new String(opsi.readLine());
					op1 = Integer.parseInt(pregunta);
				}				
			} catch (Exception error) {
			
			}
				
				Limpiar();
				System.out.println("\t\tCalculadora");
				System.out.println("\n\t\t   Divicion");
				System.out.println("\nEl resultado de la dividiendo es: " + resultado);
				Regresar();
				
				}
				} catch (Exception error) {
				System.out.println("\nSolo se admiten numeros");
			}
		}
		
		// Metodo Raiz
		public void Raiz() {
			try {
				double raiz;

				System.out.println("Ingrese primer numero: ");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String frase1 = new String(br1.readLine());
				float num1 = Float.parseFloat(frase1);
				
				raiz = Math.sqrt(num1);
				Limpiar();
				System.out.println("\t\tCalculadora");
				System.out.println("\n\t\t   Raiz Cuadrada");
				System.out.println("\nEl resultado de la  raiz cuadrada es: " + raiz);
				Regresar();
			} catch (Exception error){
				
			}
		}
		
		
		// Metodo Regresar
		public void Regresar(){
				
			try {
				System.out.println("\n\tRegresar menu principal: R");
				System.out.println("\n\tSalir de aplicacion oprimir: S");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				String frase = new String(br.readLine());
				char opcion = frase.charAt(0);

				switch (opcion) {
				case 'R':
				case 'r':
					this.Limpiar();
					VistaCalculadora.main(null);
					break;
				case 'S':
				case 's':
					System.exit(0);
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} catch (Exception error) {

			}
		}
		
	
	// Metodo Coseno
	
	public void Coseno() {
		try {
			double coseno;

			System.out.println("Ingrese el numero: ");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String frase1 = new String(br1.readLine());
			float num1 = Float.parseFloat(frase1);
			
			coseno = Math.cos(num1);
			Limpiar();
			System.out.println("\t\tCalculadora");
			System.out.println("\n\t\t   Coseno");
			System.out.println("\nEl resultado del Coseno: " + coseno);
			Regresar();
		} catch (Exception error){
			
		}
	}

	// Metodo Seno
	public void Seno() {

		try {
			double seno;

			System.out.println("Ingrese el numero: ");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String frase1 = new String(br1.readLine());
			float num1 = Float.parseFloat(frase1);
			
			seno = Math.sin(num1);
			Limpiar();
			System.out.println("\t\tCalculadora");
			System.out.println("\n\t\t   Seno");
			System.out.println("\nEl resultado del seno: " + seno);
			Regresar();
		} catch (Exception error){
			
		}
	}



	// Metodo Limpiar
	public void Limpiar(){
		int saltos = 10; 
		for(int i = 0; i < saltos; i++){ 
		System.out.println(); 
		}
	}
	
}

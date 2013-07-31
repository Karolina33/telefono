package edu.telefono.calculadora;


import java.util.Scanner;
import edu.telefono.vistas.vistacalculadora.VistaCalculadora;


/**
 * 
 * @author Jaime y Adriana
 */
public class Calculadora {

	private Scanner teclado;
	private double num1;
	private double num2;
	private double resultado;
	private int pregunta;
	private String tipoOperacion;
	
	public double num1(){
		try {
			teclado = new Scanner(System.in);
			System.out.println("Ingrese un numero: ");
			num1=teclado.nextDouble();			
		} catch (Exception e) {
			System.out.println("Error: Solo se admiten Numeros");
			num1();
		}
		return num1;
	}

	public double num2(){
		try {
			teclado = new Scanner(System.in);
			System.out.println("Ingrese otro numero: ");
			num2=teclado.nextDouble();
			
		} catch (Exception e) {
			System.out.println("Error: Solo se admiten Numeros");
			num2();
		}
		return num2;
	}
	
	public void operacionSuma(){
		tipoOperacion="Suma";
		resultado= num1+num2;			
	}

	public void operacionResta(){
		tipoOperacion="Resta";
		resultado= num1-num2;
	}
	
	public void operacionMulti(){
		tipoOperacion="Multiplicacion";
		resultado= num1*num2;
	}
	
	public void operacionDivi(){
		tipoOperacion="Division";
		resultado= num1/num2;
	}
	
	public void operacionRaiz(){
		tipoOperacion="Raiz";
		resultado = Math.sqrt(num1);
	}
	
	public void operacionSeno(){
		tipoOperacion="Seno";
		resultado = Math.sin(num1);
	}
	
	public void operacionCoseno(){
		tipoOperacion="Coseno";
		resultado = Math.cos(num1);
	}
	
	public void imprimir(){
		System.out.println("\t\tCalculadora");
		System.out.println("\n\t\t"+tipoOperacion);
		System.out.println("\nEl resultado de la " +tipoOperacion+"  es: " + resultado);
		System.out.println("¿Desea continuar con la misma operacion?\n1=si\n2=no");
		pregunta();
	}
	
	public void pregunta(){
		
		try{

			teclado = new Scanner(System.in);
			pregunta=teclado.nextInt();	
			if(pregunta==1) {
				
				if (tipoOperacion=="Suma"){
					resultado=resultado+num2();					
				}
				else if (tipoOperacion=="Resta"){
					resultado=resultado-num2();					
				}
				else if (tipoOperacion=="Multiplicacion"){
					resultado=resultado*num2();					
				}
				else if (tipoOperacion=="Division"){
					resultado=resultado/num2();	
				}
				else if (tipoOperacion=="Raiz"){
					resultado=num1();
					operacionRaiz();
				}
				else if (tipoOperacion=="Seno"){
					resultado=num1();
					operacionSeno();
				}
				else if (tipoOperacion=="Coseno"){
					resultado=num1();
					operacionCoseno();
				}
				imprimir();
			}
			else if(pregunta==2){
				VistaCalculadora vista = new VistaCalculadora();
				vista.mostrarMenu();
			}else if (pregunta!=1||pregunta!=2){
				System.out.println("Error: opcion invalida");
				pregunta();	
			}
		} catch (Exception error) {
			System.out.println("Error: opcion invalida");
			pregunta();	
		}	
	}
}

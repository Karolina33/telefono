package edu.telefono.vistas.vistamusica;

import java.util.Scanner;

import edu.telefono.musica.Artista;
import edu.telefono.musica.Genero;
import edu.telefono.musica.Musica;

public class ViewPista {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
public static String opcion2;

	
	public static void seleccionarPista(){
		String titulo =("\tTELEFONO \n  (Aplicación Musica) \n (Busqueda por Género)\n");
		
		Scanner entrada=new Scanner(System.in);	
		ViewGenero pis=new ViewGenero();
		String result=pis.opcion;
				
		
		if(result.equals("1")){
			System.out.println(titulo);
			System.out.println("Seleccione la musica del género Jazz");
			System.out.println(" ");
			System.out.println("1...Todos quiren ser ya gatos");
			System.out.println("2...Barrial de el bordo");
			System.out.println("3...Violadores de verso");
			System.out.println("4...Catherine Jeta Jones");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Regresar al menu__  R");
			System.out.println("salir de la aplicacion__  S\n");
			System.out.println("Elige una Opción:");
			opcion2=entrada.nextLine();
			switch (opcion2){
			case "1":
				System.out.println("Reproduciendo Tema Todos quiren ser ya gatos");
				break;
			case "2":
				System.out.println("Reproduciendo Tema Barrial de el bordo");
				break;
			case "3":
				System.out.println("Reproduciendo Tema Violadores de verso");
				break;
			case "4":
				System.out.println("Reproduciendo Tema Catherine Jeta Jones");
				break;
			case "r":
				Musica men=new Musica();
				men.music();
				break;
			case "s":
				System.exit(0);
				break;
			default:
				seleccionarPista();
			}
			
		}else if(result.equals("2")){
			System.out.println(titulo);
			System.out.println("Seleccione la musica del género clásico");
			System.out.println(" ");
			System.out.println("1...Mozart");
			System.out.println("2...Beethoven");
			System.out.println("3...Bach");
			System.out.println("4...Glenn");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Regresar al menu__  R");
			System.out.println("salir de la aplicacion__  S\n");
			System.out.println("Elige una Opción:");
			opcion2=entrada.nextLine();
			switch (opcion2){
			case "1":
				System.out.println("Reproduciendo Tema Mozart");
				break;
			case "2":
				System.out.println("Reproduciendo Tema Bethoven");
				break;
			case "3":
				System.out.println("Reproduciendo Tema Bach");
				break;
			case "4":
				System.out.println("Reproduciendo Tema Glenn");
				break;
			case "r":
				Musica men=new Musica();
				men.music();
				break;
			case "s":
				System.exit(0);
				break;
			default:
				seleccionarPista();
			}
			
		}else if(result.equals("3")){
			System.out.println(titulo);
			System.out.println("Seleccione la musica del género pop");
			System.out.println(" ");
			System.out.println("1...yo no se mañana");
			System.out.println("2...Contigo");
			System.out.println("3...Daria la vida por ti");
			System.out.println("4...te quiero");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Regresar al menu__  R");
			System.out.println("salir de la aplicacion__  S\n");
			System.out.println("Elige una Opción:");
			opcion2=entrada.nextLine();
			switch (opcion2){
			case "1":
				System.out.println("Reproduciendo Tema Yo no se mañana");
				break;
			case "2":
				System.out.println("Reproduciendo Tema Contigo");
				break;
			case "3":
				System.out.println("Reproduciendo Tema Daria la vida Por Ti");
				break;
			case "4":
				System.out.println("Reproduciendo Tema Te quiero");
				break;
			case "r":
				Musica men=new Musica();
				men.music();
				break;
			case "s":
				System.exit(0);
				break;
			default:
				seleccionarPista();
			}
			
		}else if(result.equals("4")){
			System.out.println(titulo);
			System.out.println("Seleccione la musica del género rock");
			System.out.println(" ");
			System.out.println("1...The Jonas Brother");
			System.out.println("2...Mancha de Rolando");
			System.out.println("3...That Body de Black Eyed Peas");
			System.out.println("4...Roll Train");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Regresar al menu__  R");
			System.out.println("salir de la aplicacion__  S\n");
			System.out.println("Elige una Opción:");
			opcion2=entrada.nextLine();
			switch (opcion2){
			case "1":
				System.out.println("Reproduciendo Tema The Jonas Brother");
				break;
			case "2":
				System.out.println("Reproduciendo Tema Mancha de Rolando");
				break;
			case "3":
				System.out.println("Reproduciendo Tema That Body de Black Eyed Peas");
				break;
			case "4":
				System.out.println("Reproduciendo Tema Roll Train");
				break;
			case "r":
				Musica men=new Musica();
				men.music();
				break;
			case "s":
				System.exit(0);
				break;
			default:
				seleccionarPista();
			}
			
		}else if(result.equals("r")){
			
		}else if(result.equals("s")){
			
		}else {
			return;
		}
		
		
		
		
	}
	
	public static void seleccionarPistaArt(){
		String titulo =("\tTELEFONO \n  (Aplicación Musica) \n (Busqueda por Artista)\n");
		Scanner entrada=new Scanner(System.in);
		ViewArtista art=new ViewArtista();
		String result2=art.opcion;
		
		if(result2.equals("1")){
		System.out.println(titulo);
		System.out.println("Seleccione la musica del artista Alejandro Fernández");
		System.out.println(" ");
		System.out.println("1...Vuelve a mi");
		System.out.println("2...Abrázame");
		System.out.println("3...Canta Corazón");
		System.out.println("4...Te voy a perder");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S\n");
		System.out.println("Elige una Opción:");
		opcion2=entrada.nextLine();
		switch (opcion2){
		case "1":
			System.out.println("Reproduciendo Tema Vuelve a mi");
			break;
		case "2":
			System.out.println("Reproduciendo Tema Abrázame");
			break;
		case "3":
			System.out.println("Reproduciendo Tema Canta Corazón");
			break;
		case "4":
			System.out.println("Reproduciendo Tema Te voy a perder");
			break;
		case "r":
			Musica men=new Musica();
			men.music();
			break;
		case "s":
			System.exit(0);
			break;
		default:
			seleccionarPistaArt();
		}
		
	}else if(result2.equals("2")){
		System.out.println(titulo);
		System.out.println("Seleccione la musica del artista Nigga");
		System.out.println(" ");
		System.out.println("1...Te quiero");
		System.out.println("2...luna dile");
		System.out.println("3...Ella la que me pudo enamorar");
		System.out.println("4...Te extraño");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S\n");
		System.out.println("Elige una Opción:");
		opcion2=entrada.nextLine();
		switch (opcion2){
		case "1":
			System.out.println("Reproduciendo Tema Te quiero");
			break;
		case "2":
			System.out.println("Reproduciendo Tema luna dile");
			break;
		case "3":
			System.out.println("Reproduciendo Tema Ella la que me pudo enamorar");
			break;
		case "4":
			System.out.println("Reproduciendo Tema Te extraño");
			break;
		case "r":
			Musica men=new Musica();
			men.music();
			break;
		case "s":
			System.exit(0);
			break;
		default:
			seleccionarPistaArt();
		}
		
	}else if(result2.equals("3")){
		System.out.println(titulo);
		System.out.println("Seleccione la musica del artista Komander");
		System.out.println(" ");
		System.out.println("1...Tragos de Amargo licor");
		System.out.println("2...Mi niño");
		System.out.println("3...Plebada 30-30");
		System.out.println("4...Amanecer si ti");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S\n");
		System.out.println("Elige una Opción:");
		opcion2=entrada.nextLine();
		switch (opcion2){
		case "1":
			System.out.println("Reproduciendo tema Tragos de amargo licor");
			break;
		case "2":
			System.out.println("Reproduciendo Tema mi niño");
			break;
		case "3":
			System.out.println("Reproduciendo Tema pleabada 30-30");
			break;
		case "4":
			System.out.println("Reproduciendo Tema Amanecer sin ti");
			break;
		case "r":
			Musica men=new Musica();
			men.music();
			break;
		case "s":
			System.exit(0);
			break;
		default:
			seleccionarPistaArt();
		}
		
	}else if(result2.equals("4")){
		System.out.println(titulo);
		System.out.println("Seleccione la musica del artista Pedro Fernández");
		System.out.println(" ");
		System.out.println("1...Dime mi amor");
		System.out.println("2...Ay corazón");
		System.out.println("3...Amarte a la Antigua");
		System.out.println("4...Un mundo Raro");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Regresar al menu__  R");
		System.out.println("salir de la aplicacion__  S\n");
		System.out.println("Elige una Opción");
		opcion2=entrada.nextLine();
		switch (opcion2){
		case "1":
			System.out.println("Reproduciendo Tema Dime mi amor");
			break;
		case "2":
			System.out.println("Reproduciendo Tema Ay corazon");
			break;
		case "3":
			System.out.println("Reproduciendo Tema Amarte a la antigua");
			break;
		case "4":
			System.out.println("Reproduciendo Tema Un mundo Raro");
			break;
		case "r":
			Musica men=new Musica();
			men.music();
			break;
		case "s":
			System.exit(0);
			break;
		default:
			seleccionarPistaArt();
		}
		
	}else if(result2.equals("r")){
		
	}else if(result2.equals("s")){
		
	}else{
		return;
	}

		
	}

}

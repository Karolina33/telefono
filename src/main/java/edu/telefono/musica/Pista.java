package edu.telefono.musica;

import java.util.*;

import edu.telefono.musica.Artista;
import edu.telefono.musica.Musica;
import edu.telefono.musica.Genero;
import edu.telefono.vistas.vistamusica.ViewPista;


public class Pista {
	public String nombrePista;
	public static String opcion2;
	
	public static void pista(){
		ViewPista pist=new ViewPista();
		pist.seleccionarPista();
		pist.seleccionarPistaArt();

		
	}

}

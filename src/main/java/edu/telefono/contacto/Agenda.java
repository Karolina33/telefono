package edu.telefono.contacto;
import java.io.*;
import java.util.*;

public class Agenda
{
  Contacto Contacto=new Contacto();
	ArrayList <Contacto> Contactos = new ArrayList <Contacto>();
	String eli="";
	
	
	public void agregar(){
		Contacto datos = new Contacto();
		System.out.println("Digite el nombre el contacto");
		datos.nom = leer();
		System.out.println("Digite el telefono del contacto");
		datos.tel = leer();
		Contactos.add(datos);
	}
	public void busquedanom(){
		System.out.println("Digite el nombre de la persona a buscar");
		eli = leer();
		Iterator<Contacto> it = Contactos.iterator();
		int i=0, j=0;
		System.out.println("Nombre\tTelefono");
		while (it.hasNext())
		{
			it.next();
			if(Contactos.get(i).nom.equals(eli))
			{		
				j++;						
				System.out.println(Contactos.get(i).nom+"\t"+Contactos.get(i).tel);
			}
			i++;
		}
		if (j==0)
		{
			System.out.println("El contacto " + eli + " no se encuentra en la agenda");
		}
	}

	public void busquedatel(){
		System.out.println("Digite el telefono de la persona a buscar");
		eli = leer();
		Iterator<Contacto> ite = Contactos.iterator();
		int a=0, b=0;
		System.out.println("Telefono\tNombre");
		while (ite.hasNext())
		{
			ite.next();
			if(Contactos.get(a).tel.equals(eli))
			{		
				b++;						
				System.out.println(Contactos.get(a).tel+"\t"+Contactos.get(a).nom);
			}
			a++;
		}
		if (b==0)
		{
			System.out.println("El contacto " + eli + " no se encuentra en la agenda");
		}
	}
		
	public void modnombre(){
		System.out.println("Digite el nombre de la persona a modificar");
		eli = leer();
		Iterator<Contacto> iter = Contactos.iterator();
		int c=0, d=0;
		System.out.println("Ahora los datos del contacto son");
		while (iter.hasNext())
		{
			iter.next();
			if(Contactos.get(c).nom.equals(eli))
			{		
				Contacto dts = new Contacto();
				System.out.println("Digite el nuevo nombre el contacto");
				dts.nom = leer();
				System.out.println("Digite el nuevo telefono del contacto");
				dts.tel = leer();
				Contactos.set(c,dts);
				d++;						
				System.out.println(Contactos.get(c).nom+"\t"+Contactos.get(c).tel);
			}
			c++;
		}
		if (d==0)
		{
			System.out.println("El contacto " + eli + " no se encuentra en la agenda");
		}
	}
	
	public void elimnom(){
		System.out.println("Digite el nombre del contacto a eliminar");
		eli = leer();
		Iterator<Contacto> itera = Contactos.iterator();
		int g=0,h=0;
		while (itera.hasNext())
		{
			itera.next();
			if(Contactos.get(g).nom.equals(eli))
			{
				h++;
				itera.remove();
				System.out.println("Se ha eliminado el contacto "+ eli +" correctamente");
				break;						
			}						
		}
		g++;	
		if (h==0)
		{
			System.out.println("El contacto digitado no se encuentra en la agenda");
		}
	}
	
	static String leer()
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String opcion="";
		try
		{
			opcion = br.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		return opcion;
	}
	
}

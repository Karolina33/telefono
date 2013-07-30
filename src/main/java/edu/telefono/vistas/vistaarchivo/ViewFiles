package edu.telefono.vistas.vistaarchivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ViewFiles {
  private static FileInputStream fin;

	public static void main(String[] arg) {

		File file = new File("C://Prueba//Archivo.txt");

		try {
			fin = new FileInputStream(file);
			byte fileContent[] = new byte[(int) file.length()];
			fin.read(fileContent);

			String strFileContent = new String(fileContent);

			System.out.println("File content: ");
			System.out.println(strFileContent);
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado " + e);
		} catch (IOException ioe) {
			System.out.println("Error al enviar archivo " + ioe);
		}
	}
}

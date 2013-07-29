package edu.telefono.archivo;

import java.io.File;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import com.sun.jersey.multipart.impl.MultiPartWriter;

public class EnviarArchivo {
	public void enviandoArchivo() {
		String urlDelServicio = "http://localhost:8080/generador-encuestas/resolver/send/file";
		String urlDelArchivoDelSistema = "/home/mrivera/ola.txt";

		ClientConfig configuracionDelCliente = new DefaultClientConfig();
		configuracionDelCliente.getClasses().add(MultiPartWriter.class);
		Client cliente = Client.create(configuracionDelCliente);
		WebResource webResource = cliente.resource(urlDelServicio);

		ClientResponse respuestaPeticion;

		try {
			FormDataMultiPart multiPart = new FormDataMultiPart();
			multiPart.bodyPart(new FileDataBodyPart("file", new File(
					urlDelArchivoDelSistema),
					MediaType.APPLICATION_OCTET_STREAM_TYPE));

			respuestaPeticion = webResource.type(MediaType.MULTIPART_FORM_DATA)
					.accept(MediaType.TEXT_PLAIN)
					.post(ClientResponse.class, multiPart);

			String respuestaDelServicio = respuestaPeticion
					.getEntity(String.class);

			System.out.println(respuestaDelServicio);

		} catch (ClientHandlerException e) {
			System.err.println(e.getMessage());
		} finally {
			cliente.destroy();
		}
	}
}

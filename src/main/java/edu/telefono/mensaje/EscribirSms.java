package edu.telefono.mensaje;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class EscribirSms {

	public void enviandoMensaje(String msj) {
		
		Client client = Client.create();
		MultivaluedMap<String, String> parametros = new MultivaluedMapImpl();
		parametros.add("sms", " "+ msj);

		WebResource webResource = client.resource("http://10.100.96.171:8080/generador-encuestas/resolver/send/sms");
		String respuestaServicio = webResource.queryParams(parametros).get(
				String.class);

		System.out.println(respuestaServicio);
	}

}

package edu.telefono.mensaje;

import java.io.IOException;
import javax.net.ssl.HttpsURLConnection ;

import com.sun.jersey.spi.inject.ClientSide;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EscribirSms {
  
	public void enviandoMensaje () {
		ClientSide Client = Client.create();
		MultivaluedMap<String, parametros, String> MultivaluedMapImpl = new ();
		parametros.add ("sms", "ola k ace");
		
		WebResource WebResource = client.resource ("http://localhost:8080/generador-encuestas/resolver/send/sms");		
		Cadena respuestaServicio = webResource.queryParams (parametros).get(String.class);
		
		System.out.println (respuestaServicio);
	}	 
}

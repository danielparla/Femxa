package JSON;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class MainRecado {

	

	public static void main(String[] args) throws Exception {
	
		List<Recado> lrecados= RecadoJson.serializar();
		Recado recado;
		Date fecha= recado.getFecha_hora_maxima();
		
		for (Recado r: lrecados){
			System.out.println("ARRAY SIN ORDENAR"+
					"\nRecibido: "+r.getFecha_hora()+
					"\nNombre del cliente: "+r.getNombre_cliente()+
					"\nTelefono "+r.getTelefono()+
					"\nRecogida "+r.getDireccion_recogida()+
					"\nEntrega "+r.getDireccion_entrega()+
					"\nDescripción: "+r.getDescripcion()+
					"\nHora máxima: "+r.getFecha_hora_maxima()+
					"\n ");
			
			Collection.sort
			Arrays.sort(lrecados, Collection);
			System.out.println("ARRAY ORDENADO \n"+ 
		}
		
	}

}

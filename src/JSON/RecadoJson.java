package JSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class RecadoJson {

	static Gson gson;
	static Recado recado;
	
	public static String getJSON(String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();
		return result.toString();
	}
	
	public static List<Recado>serializar() throws JsonSyntaxException, Exception{
		
		gson= new Gson();

		List<Recado> lista_recados=gson.fromJson(getJSON("http://elrecadero-ebtm.rhcloud.com/ObtenerListaRecados"), new TypeToken<List<Recado>>(){}.getType());
		
		return lista_recados;
	}
	

	//TODO
//	public int compareTo(Prueba obj) {
//		if(cal.getTimeInMillis() < obj.cal.getTimeInMillis()) {
//		return -1;
//		} else if(cal.getTimeInMillis() > obj.cal.getTimeInMillis()) {
//		return 1;
//		}
//		return 0;
//		}
//		@Override
//		public String toString() {
//		return cal.getTime().toString();
//		}
//		}
}
	
	
	
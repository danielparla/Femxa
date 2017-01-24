import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2Fichero {

	static String[] fromFichero2Array(File file) throws IOException {

		String[] lista_cadena = new String[15];
		FileReader archivo;
		archivo = new FileReader(file);

		BufferedReader lectura = new BufferedReader(archivo);

		int i = 0;
		String var = lectura.readLine();
		while (var != null) {

			lista_cadena[i] = var;
			i++;
			var = lectura.readLine();

		}
		lectura.close();
		archivo.close();

		return lista_cadena;
	}

	@SuppressWarnings("resource")
	public static boolean prueba(String[] lista_cadena) throws IOException {

		boolean ok = true;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
			try 
			{
				fw = new FileWriter("salida");
				bw = new BufferedWriter(fw);
				int i = 0;
				int longi = lista_cadena.length-1;
				
				for (String cadena : lista_cadena)
				{
					bw.write(cadena);
					if (i!=longi)
						{
						bw.newLine();
						}
					i = i+1;
				}
				
				
			} catch (IOException e) {
				System.out.println("Error creando Fw");
				e.printStackTrace();
				ok = false;
			}
			finally 
			{
				try {
					bw.close();
					fw.close();
				} catch (Exception e) {
					System.out.println("Error cerrando fichero salida");
					e.printStackTrace();
					ok = false;
				}
				
			}
			
		
		return ok;
	}

	public static void main(String[] args) throws IOException {

		File fichero_leido = new File("texto");

		String[] resultado = fromFichero2Array(fichero_leido);
		int j = 0;
		
		for (String linea : resultado)
			System.out.println(linea);

	}

}

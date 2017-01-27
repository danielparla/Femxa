package I18n;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class EjemploPropiedades {
	
	public static void main(String[] args) throws IOException {
	
		
			try {
				
				Properties fichero_propiedades =null;
				
				fichero_propiedades= new Properties();
				
				FileReader fr = new FileReader("bd.properties");
				
				fichero_propiedades.load(fr);
				
				String valor_driver= fichero_propiedades.getProperty("driver");
				String valor_cadena= fichero_propiedades.getProperty("cadena_conexion");
				String valor_user= fichero_propiedades.getProperty("user");
				String valor_password= fichero_propiedades.getProperty("password");
				
				System.out.println(valor_driver);
				System.out.println(valor_cadena);
				System.out.println(valor_user);
				System.out.println(valor_password);
				
				fr.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			finally {
				
			}
	
	}
}

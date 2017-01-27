package I18n;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class CuentoIdiomas {

	public FileReader eligeFichero(){
		
		Scanner sc=new Scanner(System.in);
		String lectura=sc.nextLine();
		
		if (lectura.equalsIgnoreCase("Italiano"))
		
		return null;
	}
	
	
	
	public static void main(String[] args) {
	
		try {
			
			Properties fichero_propiedades =null;
			
			
			fichero_propiedades= new Properties();
			
			FileReader fr = new FileReader("bd.properties");
			
			fichero_propiedades.load(fr);
			
			String valor_driver= fichero_propiedades.getProperty("driver");
			String valor_cadena= fichero_propiedades.getProperty("cadena_conexion");
			String valor_user= fichero_propiedades.getProperty("user");
			String valor_password= fichero_propiedades.getProperty("password");
		
			
			fr.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
	


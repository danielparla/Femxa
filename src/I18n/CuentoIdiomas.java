package I18n;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Scanner;

public class CuentoIdiomas {

	public static String eligeFichero(){
		
		System.out.println("Por favor, elija un idioma: \n Español \n Italiano \n Inglés");
		Scanner sc=new Scanner(System.in);
		String lectura=sc.nextLine();
		String idioma=null;
		
		if (lectura.equalsIgnoreCase("Italiano")||lectura.equalsIgnoreCase("Italian")){
			idioma="IT";
		}
		if (lectura.equalsIgnoreCase("English")||lectura.equalsIgnoreCase("Ingles")){
			idioma="EN";
		}
		if (lectura.equalsIgnoreCase("Español")){
			idioma="ES";
		}
		else {
			System.out.println("El idioma elegido no es correcto");
			eligeFichero();
		}
		return idioma;
	}
	
	
	
	public static void main(String[] args) {

		args[0]=eligeFichero();
		String archivo=null;
		
		try {
			
			if(args[0].equals("ES"))
				archivo="story_es.properties";
			if(args[0].equals("EN"))
				archivo="story_en.properties";
			if(args[0].equals("IT"))
				archivo="story_it.properties";
			
			Properties fichero_propiedades =null;
			
			fichero_propiedades= new Properties();
			
			FileReader fr = new FileReader(archivo);
			
			fichero_propiedades.load(fr);
			
			String valor_start= fichero_propiedades.getProperty("start");
			String valor_body= fichero_propiedades.getProperty("body");
			String valor_end= fichero_propiedades.getProperty("end");
			String valor_outfile= fichero_propiedades.getProperty("outfile");

			fr.close();
			
			String ruta = "/home/mario/archivo.txt";
			File newArchivo = new File(ruta);
			BufferedWriter bw;
			
			if(newArchivo.exists()) {
			      System.out.println("El fichero ya existe");
			} 
			else {
				
				      bw = new BufferedWriter(new FileWriter(valor_outfile));
				      bw.write(valor_start);
				      bw.write(valor_body);
				      bw.write(valor_end);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
	


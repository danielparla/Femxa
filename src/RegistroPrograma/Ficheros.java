package RegistroPrograma;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ficheros {

	static File usuario= new File("Usuarios");
	static File pass= new File ("Contraseñas");
	
	public static String[] lista_archivo(File file) throws IOException{
		
		//lee el archivo USUARIOS y devuleve una array
		
		String[] lista= new String[50];
		
		FileReader usuario_read=new FileReader(usuario);
	
		BufferedReader lectura_usu =new BufferedReader(usuario_read);
		
		int i = 0;
		String var = lectura_usu.readLine();
		
		while (var != null) {

			lista[i] = var;
			i++;
			var = lectura_usu.readLine();

		}
		lectura_usu.close();
		usuario_read.close();
		
		
			return lista;
			
	}
	
	public static String[] lista_password(File file) throws IOException{
		
		//lee el archivo CONTRASEÑAS y devuelve una array
		
		FileReader pass_read=new FileReader(pass);
		BufferedReader lectura_pass =new BufferedReader(pass_read);
		String[] lista= new String[50];
		
		int i = 0;
		String var = lectura_pass.readLine();
		
		while (var != null) {

			lista[i] = var;
			i++;
			var = lectura_pass.readLine();

		}
		lectura_pass.close();
		pass_read.close();
		
			return lista;
	}
	
	public static boolean guarda_nombre(String nombre) throws IOException {

		boolean ok = false;
		FileWriter fw = new FileWriter(usuario);
		BufferedWriter bw = new BufferedWriter(fw);
		String[] lista_nom=lista_archivo(usuario);
		
		int i=0;
		
		bw.write(nombre);
			ok=true;
		
			bw.close();
			fw.close();
			
			return ok;
		}
			
		
	public static boolean guarda_pass(String passw) throws IOException {

		boolean ok = false;
		FileWriter fw = new FileWriter(pass);
		BufferedWriter bw = new BufferedWriter(fw);
		String[] lista_nom=lista_archivo(pass);
		
		int i=0;
		
			bw.write(passw);
			ok=true;
		
			bw.close();
			fw.close();
			
			return ok;
	}


}

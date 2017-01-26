package BBDD;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import RegistroPrograma.Ficheros;

public class Usuario {

	static String nombre;
	static String psw;
	static int contador=1;
	public Usuario(String nombre, String psw) {

		this.nombre = nombre;
		this.psw = psw;

	}

	public static void setUsuario() throws IOException {

		System.out.println("Introduzca el nombre del Usuario:");
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		
		System.out.println("Introduzca una contraseña:");
		psw = sc.nextLine();
		System.out.println("Confirme la contraseña:");
		String psw2 = sc.nextLine();
		
		if (psw.equals(psw2)) {
			if (Ficheros.guarda_nombre(nombre) && Ficheros.guarda_pass(psw)) {
				System.out.println("Guardado");
			} else
				System.out.println("Ocurrió un error");
		} else {
			System.out.println("El ususario ya estaba registrado" + " o las contraseñas no son identicas,"
					+ " por favor, repita el registro...");
			setUsuario();
		}
	}

	public static boolean getUsuario() throws IOException {
		
		String[] lista_usuario=Ficheros.lista_archivo(new File("Usuarios"));
		String[] lista_pass=Ficheros.lista_password(new File("Contraseñas"));
		
		System.out.println("Introduzca el nombre del Usuario:");
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		
		System.out.println("Introduzca su contraseña:");
		psw = sc.nextLine();
			
		boolean ok=false;
		
		while (contador<=3){
		if (contador==3){
			System.exit(0);
		}
		if (lista_usuario[0].equals(nombre)&&lista_pass[0].equals(psw)) {
			System.out.println("Éxito");
			contador=4;
			ok=true;
		} else{
			System.out.println("Nombre no encontrado o contraseña incorrecta");
			contador++;
			getUsuario();}
			
			
		}
		return ok;
	}

}

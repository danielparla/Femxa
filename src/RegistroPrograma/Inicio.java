package RegistroPrograma;
import java.io.IOException;
import java.util.Scanner;

import Femxa.clase.Usuario;

public class Inicio {

	public static int leerOpcion() {

		System.out.println("Elija una opción:"
				+ "\n1: Registrarse \n2: Acceder");

		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();

		return opcion;
	}

	public static void main(String[] args) throws IOException {

		switch (leerOpcion()) {
		case 1:
			Usuario.setUsuario();
			break;
			
		case 2:
			Usuario.getUsuario();
		break;

		default:
			System.out.println("Por favor, "
					+ "escoja una opción correcta");
			break;
		}
		
	}

}

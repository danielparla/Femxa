import java.util.Scanner;

public class CodificarCarpetas {

	static String codigo = "abcdefghijklmnñopqrstuvwxyz +-/.ABCDEFGHIJKLMNÑOPQRSTUVWXYZA0123456789*";

	public static String codificado(String cadena) {

		String palabra_codificada = "";

		int i = 0;
		int j = 0;

		for (i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == codigo.charAt(j)) {

				palabra_codificada += codigo.charAt(j + 1); // suma la letra posterior del abecedario
				j = 0;
			}

			else {
				j++;
				i--;
			}

		}

		return palabra_codificada;

	}

	public static String decodifica(String cadena) {

		String palabra_codificada = "";
		int i = 0;
		int j = 0;

		for (i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == codigo.charAt(j)) {

				palabra_codificada += codigo.charAt(j - 1); // suma la letra posterior del abecedario
				j = 0;
			}

			else {
				j++;
				i--;
			}
		}
		return palabra_codificada;
	}

	public static void main(String[] args) {

		System.out.println("¿Está codificado? \n1:Si \n2:No");

		Scanner sc1 = new Scanner(System.in);
		int si_no = sc1.nextInt();

		if (si_no == 2) {
			System.out.println("Por favor, introduzca el nombre de la carpeta sin '*'");

			Scanner sc2 = new Scanner(System.in);
			String fichero = sc2.nextLine();

			String fichero_codificado = codificado(fichero);

			System.out.println("La palabra codificada es: " + fichero_codificado);
		} else if(si_no==1){
			System.out.println("Por favor, introduzca el nombre de la carpeta");

			Scanner sc2 = new Scanner(System.in);
			String fichero_decodificar = sc2.nextLine();

			String fichero_decodificado = decodifica(fichero_decodificar);

			System.out.println("La palabra decodificada es: "
					+ fichero_decodificado);
		}

		/**
		 * Haced el cuerpo de los métodos y un pequeño main para probarse de
		 * forma que luego podamos usar esta clase para codificar decodificar
		 * ficheros
		 * 
		 * Un método codifica el mensaje y llamando al método decodifica,
		 * recuperaría el mensaje original
		 * 
		 * @author Administrador
		 *
		 */

	}

}

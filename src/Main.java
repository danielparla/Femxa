import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		String opcion= JOptionPane.showInputDialog("Elija una opción: \n1:Insertar persona \n2:Lista de personas "
				+ "\n3:Buscar persona \n4:Borrar persona \n5:Salir");
		int opcionInt= Integer.parseInt(opcion);
		
		switch (opcionInt) {
		case 1:
			
			String nombre=JOptionPane.showInputDialog("Escriba el nombre de la persona");
			String edadAux=JOptionPane.showInputDialog("Introduzca la edad de la persona");
			int edad= Integer.parseInt(edadAux);
			
			
			break;

		default:
			break;
		}

	}

}

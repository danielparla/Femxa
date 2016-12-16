import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonaMAyor {

	public static final int NUMERO_PERSONAS = 3;
	 

	 public static int pedirEdad ()
		{
			String num = null;
			Scanner scanner = null;
			int num_leido=0;
			
			num =JOptionPane.showInputDialog("Introduce tu edad");
			num_leido=Integer.parseInt(num);	
			//este codigo lo muestra por ventana.
			
			return num_leido;
		}
		
		
		public static String pedirNombre ()
		{
			String nombre = null;
			Scanner scanner = null;
				
			nombre =JOptionPane.showInputDialog("Introduce tu nombre");
				//este codigo lo muestra por ventana.
			
			return nombre;
		}
	

	
public static void main(String[] args) {
		
		String nombre = null;
		int edad = 0;
		int edadMayor = 0;
		
		Persona personaMayor = new Persona();
		Persona p = new Persona();

		for(int i=0; i < NUMERO_PERSONAS; i++ ){
			System.out.print("Introduzca su nombre: ");
			nombre = pedirNombre();
			System.out.print("Introduzca su edad: ");
			edad = pedirEdad();			
			
			if (edad > edadMayor){
				edadMayor = edad;
				personaMayor.setNombre(nombre);
				personaMayor.setEdad(edad);
			}
		}	
		
		JOptionPane.showMessageDialog(null, "La persona de mayor edad es "+personaMayor.getNombre());
		//este codigo lo muestra por ventana.
}


}

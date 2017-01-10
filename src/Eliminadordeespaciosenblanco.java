import javax.swing.JOptionPane;


public class Eliminadordeespaciosenblanco {

	
	public static String pedirPalabra()
	{
	
		String entrada= JOptionPane.showInputDialog("Introduzca la frase y eliminaré los espacios:");
			
		return entrada;
	}
	public static void main(String[] args) {
		
		String entrada=pedirPalabra();
		
		for (int i=0; i<=(entrada.length() -1);i++){
			if (entrada.charAt(i)!=' ')
				System.out.print(entrada.charAt(i));
		}
	}

}

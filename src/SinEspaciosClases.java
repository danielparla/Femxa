import javax.swing.JOptionPane;


public class SinEspaciosClases {

	public static String pedirPalabra()
	{
	
		String entrada= JOptionPane.showInputDialog("Introduzca la frase y eliminaré los espacios:");
			
		return entrada;
	}
	
	public static char eliminarEspacios(){
		
		String entrada=pedirPalabra();
		int i=0;
		
				
		for (i=0; i<=(entrada.length() -1);i++){
			char letraLeida=entrada.charAt(i);
			if (letraLeida!=' '){
				
				return letraLeida;
			}
		}
			
	}
	
	public static void main(String[] args) {
		
		char letras= eliminarEspacios();
		
		System.out.print(letras);
		
		}
	}
	
}

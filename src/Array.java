
public class Array {

	//hemos escrito en argumentos "por fin es viernes"
	//este programa mostrara una por una cada palabra de la array y se llama ''RECORRER''
	
	public static void main(String[] argumentos) {
		
		int i =0;
		
		for (i=0; i<argumentos.length;i++){
			System.out.println("la palabra " +i+ "es " + argumentos[i]);
		}
		
	}	
}		
		
/*public class Array {

	//Hemos dado el valor SOL ES VIda a ''args'' pulsando boton derecho sobre la class
	//run as, run configurations.
	
	public static void main(String[] args) {
		
		int n_palabras = args.length; 
		System.out.println(n_palabras); //esto indica el numero de palabras dentro de la array
		
		System.out.println("Palabra 1 = " +args [0]); 
		System.out.println("Palabra 2 = " +args [1]);
		System.out.println("Palabra 3 = " +args [2]); 
	}
*/


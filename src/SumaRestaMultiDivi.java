
public class SumaRestaMultiDivi {

	//Dar dos cifras y mostrar cual es su suma, su resta, su multiplicacion y su division. 
	
	public static void main(String[] args) {
		
		double var_a=5;
		double var_b=3;
		
		double suma=var_a + var_b;
		double resta= var_a-var_b;
		double por= var_a * var_b;
		double entre = var_a / var_b;
		
		System.out.println("Para las variables a = 5 y b = 3 :");
		System.out.println("Suma: " + suma ); 
		System.out.println("Resta " + (var_a - var_b));//tambien se puede meter directamente la operacion en el out
		System.out.println("Multiplicación " + por);
		System.out.println("División "+ entre);
	}

}

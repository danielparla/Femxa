import java.util.Scanner;

public class CadenaRecursiva {

	static int i;
	static int j;
	static boolean es_si;
	static String palabra;
	
	private static boolean es_palindromo(){
		
		
		
		if (palabra.charAt(i)==palabra.charAt(j))
		
		if(i>=j)
			es_si=true;
	
		else{
			i++;
			j--;
			es_palindromo();
		}
		
		
		return es_si;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca una palabra por favor");
		
		Scanner sc=new Scanner(System.in);
		String entrada=sc.nextLine();
		palabra=entrada;
		
		i=0;
		j=palabra.length()-1;
		es_si=false;
		
		if(es_palindromo())
			System.out.println("Es palindromo");
		else
			System.out.println("No es palindromo");
		
		

	}

}

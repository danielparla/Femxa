
public class CheckedVsUnchecked {

	public static void main(String[] args) {
		
		String cadena=null;
		int ae []=new int[4];
		try{
			
			 int tamano=ae.length;
			 ae[tamano]=89;
			
			
			//int tamano = cadena.length();
		
		System.out.println(tamano);
			
		}catch (Exception e){
			System.out.println("Exception producida");
		e.printStackTrace();	
		}
		
		

	}

}

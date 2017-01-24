
public class NotaMedia {

	private static int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
	
	public static void main(String[] args) {
		
		float pos_array=0;
		float suma_array=0;
		float nota_media=0; 
		
		for (int i=0;i<array_notas.length;i++){
			pos_array = array_notas[i];
			suma_array += pos_array;
			nota_media= (suma_array/array_notas.length);
		}
		
		System.out.println(nota_media);
		
	/**
	* HACED EL CUERPO DEL MAIN
	* PARA QUE DEVUELVA LA NOTA
	* MEDIA 
	* 
	* Ojo con los tipos
	* la media será real (float)
	* 
	*/
	}

}

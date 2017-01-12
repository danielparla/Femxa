

import java.io.File;

public class FicherosCona {

	public static void main(String[] args) {
		
		String ruta="C:\\Users\\Administrador\\workspace3\\ProgramaFicheros\\carpetaejemplo";
		File directorio=new File(ruta);
		String[]ver_directorio=directorio.list();
		
		
		String[] archivos=directorio.list();
		
		for(int i=0;i<archivos.length;i++){
			
			for(int j=0;j<archivos[i].length();j++){
				if (archivos[i].charAt(j)=='a'||archivos[i].charAt(j)=='A'){
					System.out.println(archivos[i]);
					i++;
				}
			}
			
		}

	}

}
